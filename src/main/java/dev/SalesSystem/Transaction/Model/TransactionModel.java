package dev.SalesSystem.Transaction.Model;

import dev.SalesSystem.Products.Model.ProductModel;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class TransactionModel {
    @Id
    private String id;
    private String productId;
    private Long price;
    private int quantity;

    public TransactionModel(String productId, int quantity, Long price) {
        this.productId = productId;
        this.quantity = quantity;
        this.price=price;
    }

    public TransactionModel() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
    public Long total(){
        return price*quantity;
    }
}
