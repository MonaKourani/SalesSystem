package dev.SalesSystem.Sales.Repository;

import dev.SalesSystem.Sales.Model.SalesModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SalesRepository extends MongoRepository<SalesModel,String> {
}
