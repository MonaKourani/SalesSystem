package dev.SalesSystem.Sales.Model;

import dev.SalesSystem.Clients.Model.ClientModel;
import dev.SalesSystem.Transaction.Model.TransactionModel;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;
import java.util.List;

@Document
public class SalesModel {
    @Id
    private String id;
    private Date createdOn;
    private ClientModel client;
    private String seller;
    private Long total;
    private List<TransactionModel> transactions;

    public SalesModel() {
    }

    public SalesModel(ClientModel client, String seller, List<TransactionModel> transactions) {
        this.client = client;
        this.seller = seller;
        this.transactions = transactions;
        this.total=transactions.stream().mapToLong(TransactionModel::price).sum();
        this.createdOn= new Date();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public ClientModel getClient() {
        return client;
    }

    public void setClient(ClientModel client) {
        this.client = client;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<TransactionModel> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<TransactionModel> transactions) {
        this.transactions = transactions;
    }
}
