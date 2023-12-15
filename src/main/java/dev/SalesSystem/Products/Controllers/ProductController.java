package dev.SalesSystem.Products.Controllers;

import dev.SalesSystem.Products.DTO.ProductForCreationDTO;
import dev.SalesSystem.Products.Model.ProductModel;
import dev.SalesSystem.Products.Service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Products")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping()
    public ResponseEntity<List<ProductModel>> fetchProducts(){
        return productService.fetchProducts();
    }
    @PostMapping
    public ResponseEntity<ProductModel> createProduct(@RequestBody ProductForCreationDTO product){
        return productService.createProduct(product);
    }
    @PostMapping("/{id}")
    public ResponseEntity<ProductModel> updateProduct(@PathVariable String id,@RequestBody ProductForCreationDTO product){
        return productService.updateProduct(id,product);
    }
}
