package dev.SalesSystem.Sales.Controllers;

import dev.SalesSystem.Products.DTO.ProductForCreationDTO;
import dev.SalesSystem.Products.Model.ProductModel;
import dev.SalesSystem.Products.Service.ProductService;
import dev.SalesSystem.Sales.DTO.SalesForCreationDTO;
import dev.SalesSystem.Sales.Model.SalesModel;
import dev.SalesSystem.Sales.Service.SalesService;
import dev.SalesSystem.Transaction.Model.TransactionModel;
import dev.SalesSystem.Transaction.Service.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Sales")
public class SalesController {
    private final SalesService salesService;

    public SalesController(SalesService salesService) {
        this.salesService=salesService;
    }

    @GetMapping()
    public ResponseEntity<List<SalesModel>> fetchSales(){
        return salesService.fetchSales();
    }
    @PostMapping
    public ResponseEntity<SalesModel> createSale(@RequestBody SalesForCreationDTO sale){
        return salesService.createSale(sale);
    }
    @PostMapping("/{saleId}")
    public ResponseEntity<SalesModel> updateSale(@PathVariable String saleId, @PathVariable String transactionId, @RequestBody TransactionModel trans){
        return salesService.updateSale(saleId,transactionId,trans);
    }
}
