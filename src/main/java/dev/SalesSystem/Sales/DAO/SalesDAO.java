package dev.SalesSystem.Sales.DAO;

import dev.SalesSystem.Sales.Model.SalesModel;
import dev.SalesSystem.Sales.Repository.SalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class SalesDAO {
    @Autowired
    private SalesRepository salesRepository;
    public List<SalesModel> fetchSales (){
        return salesRepository.findAll();
    }
    public Optional<SalesModel> findSaleById(String id){
        return salesRepository.findById(id);
    }
    @Transactional
    public SalesModel createSale(SalesModel salesModel) {
        return salesRepository.save(salesModel);
    }

    @Transactional
    public SalesModel updateSale(String saleId, SalesModel salesModel) {
        Optional<SalesModel> sale = salesRepository.findById(saleId);

        if (sale.isPresent()) {
            SalesModel existingSale = sale.get();
            return salesRepository.save(existingSale);
        } else {
            throw new IllegalStateException("Sale not found with ID: " + saleId);
        }
    }
}
