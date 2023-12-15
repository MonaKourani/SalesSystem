package dev.SalesSystem.Products.DAO;

import dev.SalesSystem.Products.DTO.ProductForCreationDTO;
import dev.SalesSystem.Products.Model.ProductModel;
import dev.SalesSystem.Products.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductDAO {
    @Autowired
    private ProductRepository productRepository;

    public List<ProductModel> fetchProduct (){
        return productRepository.findAll();
    }
    @Transactional
    public ProductModel createProduct(ProductModel productModel) {
        return productRepository.save(productModel);
    }

    @Transactional
    public ProductModel updateProduct(String productId, ProductForCreationDTO updatedProduct) {
        Optional<ProductModel> product = productRepository.findById(productId);

        if (product.isPresent()) {
            ProductModel existingProduct = product.get();
            existingProduct.setProductName(updatedProduct.getProductName());
            existingProduct.setDescription(updatedProduct.getDescription());
            existingProduct.setCategory(updatedProduct.getCategory());
            return productRepository.save(existingProduct);
        } else {
            throw new IllegalStateException("Product not found with ID: " + productId);
        }
    }
}
