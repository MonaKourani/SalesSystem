package dev.SalesSystem.Sales.Service;

import dev.SalesSystem.Clients.DAO.ClientDAO;
import dev.SalesSystem.Clients.DTO.ClientForCreationDTO;
import dev.SalesSystem.Clients.Model.ClientModel;
import dev.SalesSystem.Products.DAO.ProductDAO;
import dev.SalesSystem.Sales.DAO.SalesDAO;
import dev.SalesSystem.Sales.DTO.SalesForCreationDTO;
import dev.SalesSystem.Sales.Model.SalesModel;
import dev.SalesSystem.SalesSystemApplication;
import dev.SalesSystem.Transaction.DAO.TransactionDao;
import dev.SalesSystem.Transaction.Model.TransactionModel;
import dev.SalesSystem.Transaction.Repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
        if(clientDAO.findClientById(sale.getClient().getId()).isEmpty()){
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(salesDAO.createSale(new SalesModel(sale.getClient(), sale.getSeller(), sale.getTransactions())));
    }

    public ResponseEntity<SalesModel> updateSale(String saleId, String transactionId, TransactionModel transactionModel){
        Optional<SalesModel> oldSale= salesDAO.findSaleById(saleId);
        if(oldSale.isEmpty()){
            return ResponseEntity.badRequest().build();
        }
        SalesModel sale=oldSale.get();
        return ResponseEntity.ok(salesDAO.updateSale(saleId,new SalesModel());
    }
}
