package dev.SalesSystem.Products.DTO;

public class ProductForCreationDTO {
    private String productName;
    private String description;
    private String category;

    public  ProductForCreationDTO() {
    }

    public  ProductForCreationDTO(String productName, String description, String category) {
        this.productName = productName;
        this.description = description;
        this.category = category;
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
}
