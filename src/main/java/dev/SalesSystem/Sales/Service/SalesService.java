package dev.SalesSystem.Sales.Service;

import dev.SalesSystem.Clients.DAO.ClientDAO;
import dev.SalesSystem.Products.DAO.ProductDAO;
import dev.SalesSystem.Sales.DAO.SalesDAO;
import dev.SalesSystem.Sales.DTO.SalesForCreationDTO;
import dev.SalesSystem.Sales.Model.SalesModel;
import dev.SalesSystem.Transaction.DAO.TransactionDao;
import dev.SalesSystem.Transaction.Model.TransactionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SalesService {
    @Autowired
    private SalesDAO salesDAO;
    @Autowired
    private ClientDAO clientDAO;
    @Autowired
    private ProductDAO productDAO;
    @Autowired
    private TransactionDao transactionDao;

    public ResponseEntity<List<SalesModel>> fetchSales(){
        return ResponseEntity.ok(salesDAO.fetchSales());
    }
    public ResponseEntity<SalesModel> createSale(SalesForCreationDTO sale){
        if(clientDAO.findClientById(sale.getClientId()).isEmpty()){
            return ResponseEntity.badRequest().build();
        }
        if (sale.getTransactions().stream().anyMatch(tfc ->
                productDAO.findProductById(tfc.getProductId()).isEmpty())) {
            return ResponseEntity.badRequest().build();
        }
        List<TransactionModel> list=sale.getTransactions().stream()
                .map(tfc -> {
                    Long price = productDAO.findProductById(tfc.getProductId()).get().getPrice();
                    return( new TransactionModel( tfc.getProductId(), tfc.getQuantity(), price));
                })
                .collect(Collectors.toList());
        transactionDao.createTransaction(list);
        return ResponseEntity.ok(salesDAO.createSale(new SalesModel(clientDAO.findClientById(sale.getClientId()).get(), sale.getSeller(), list)));
    }

    public ResponseEntity<SalesModel> updateSale(String saleId, String transactionId, TransactionModel transactionModel){
        Optional<SalesModel> oldSale= salesDAO.findSaleById(saleId);
        Optional<TransactionModel> oldTransaction= transactionDao.findTransactionById(transactionId);
        if(oldSale.isEmpty() || oldTransaction.isEmpty() ){
            return ResponseEntity.badRequest().build();
        }
        SalesModel sale=oldSale.get();
        TransactionModel trans =oldTransaction.get();
        List<TransactionModel> list=sale.getTransactions();
        list.remove(trans);
        list.add(transactionModel);
        sale.setTransactions(list);
        return ResponseEntity.ok(salesDAO.updateSale(saleId,sale));
    }
}
