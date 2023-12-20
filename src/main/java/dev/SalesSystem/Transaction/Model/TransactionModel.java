package dev.SalesSystem.Transaction.Model;

import dev.SalesSystem.Products.Model.ProductModel;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class TransactionModel {
    @Id
    private String id;
    private ProductModel product;
    private int quantity;

    public TransactionModel(ProductModel product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public TransactionModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProductModel getProduct() {
        return product;
    }

    public void setProduct(ProductModel product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public long price(){
        return quantity*product.getPrice();
    }
}
