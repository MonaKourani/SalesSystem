package dev.SalesSystem.Products.Repository;

import dev.SalesSystem.Products.Model.ProductModel;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ProductRepository extends MongoRepository<ProductModel, String> {
    Optional<ProductModel> findById(String productId);
}
