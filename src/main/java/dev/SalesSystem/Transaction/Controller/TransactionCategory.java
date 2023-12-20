package dev.SalesSystem.Transaction.Controller;

import dev.SalesSystem.Transaction.Model.TransactionModel;
import dev.SalesSystem.Transaction.Service.TransactionService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Transactions")
public class TransactionCategory {
    private final TransactionService transactionService;

    public TransactionCategory(TransactionService transactionService) {
        this.transactionService = transactionService;
    }
    @GetMapping()
    public ResponseEntity<List<TransactionModel>> fetchTransactions(){
        return transactionService.fetchTransactions();
    }
}
