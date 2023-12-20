package dev.SalesSystem.Transaction.Service;

import dev.SalesSystem.Transaction.DAO.TransactionDao;
import dev.SalesSystem.Transaction.Model.TransactionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    private TransactionDao transactionDao;
    public ResponseEntity<List<TransactionModel>> fetchTransactions(){
        return ResponseEntity.ok(transactionDao.fetchTransaction());
    }
}
