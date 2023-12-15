package dev.SalesSystem.Products.Service;

import dev.SalesSystem.Products.DAO.ProductDAO;
import dev.SalesSystem.Products.DTO.ProductForCreationDTO;
import dev.SalesSystem.Products.Model.ProductModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class ProductService {
    @Autowired
    private ProductDAO productDao;

    public ResponseEntity<List<ProductModel>> fetchProducts(){
        return ResponseEntity.ok(productDao.fetchProduct());
    }
    public ResponseEntity<ProductModel> createProduct(ProductForCreationDTO newProduct){
        return ResponseEntity.ok(productDao.createProduct(new ProductModel(newProduct.getProductName(), newProduct.getDescription(), newProduct.getCategory())));
    }

    public ResponseEntity<ProductModel> updateProduct(String id,ProductForCreationDTO updatedProduct){
        return ResponseEntity.ok(productDao.updateProduct(id,updatedProduct));
    }
}
