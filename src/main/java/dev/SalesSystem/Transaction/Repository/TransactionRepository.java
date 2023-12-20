package dev.SalesSystem.Transaction.Repository;

import dev.SalesSystem.Transaction.Model.TransactionModel;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface TransactionRepository extends MongoRepository<TransactionModel,String > {
}
