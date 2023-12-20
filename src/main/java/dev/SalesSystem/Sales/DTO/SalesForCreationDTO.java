package dev.SalesSystem.Sales.DTO;

import dev.SalesSystem.Clients.Model.ClientModel;
import dev.SalesSystem.Transaction.Model.TransactionModel;

import java.util.Date;
import java.util.List;

public class SalesForCreationDTO {
    private ClientModel client;
    private String seller;
    private List<TransactionModel> transactions;

    public SalesForCreationDTO() {
    }

    public SalesForCreationDTO(ClientModel client, String seller, List<TransactionModel> transactions) {
        this.client = client;
        this.seller = seller;
        this.transactions = transactions;
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

    public List<TransactionModel> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<TransactionModel> transactions) {
        this.transactions = transactions;
    }
}
