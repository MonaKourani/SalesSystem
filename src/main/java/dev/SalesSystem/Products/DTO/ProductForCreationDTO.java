package dev.SalesSystem.Products.DTO;

public class ProductForCreationDTO {
    private String productName;
    private String description;
    private String category;
    private Long price;

    public  ProductForCreationDTO() {
    }

    public  ProductForCreationDTO(String productName, String description, String category,Long price) {
        this.productName = productName;
        this.description = description;
        this.category = category;
        this.price=price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
