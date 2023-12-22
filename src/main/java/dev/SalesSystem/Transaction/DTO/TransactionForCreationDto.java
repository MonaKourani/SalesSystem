package dev.SalesSystem.Transaction.DTO;

public class TransactionForCreationDto {
    private String productId;
    private int quantity;

    public TransactionForCreationDto(String productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public TransactionForCreationDto() {
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
}
