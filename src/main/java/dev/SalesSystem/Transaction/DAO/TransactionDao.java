package dev.SalesSystem.Transaction.DAO;

import dev.SalesSystem.Transaction.Model.TransactionModel;
import dev.SalesSystem.Transaction.Repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionDao {
    @Autowired
    private TransactionRepository transactionRepository;
    public List<TransactionModel> fetchTransaction (){
        return transactionRepository.findAll();
    }
    public Optional<TransactionModel> findTransactionById(String id){
        return transactionRepository.findById((id));
    }

}
