package dev.SalesSystem.Sales.DTO;

import dev.SalesSystem.Clients.Model.ClientModel;
import dev.SalesSystem.Transaction.DTO.TransactionForCreationDto;
import dev.SalesSystem.Transaction.Model.TransactionModel;

import java.util.Date;
import java.util.List;

public class SalesForCreationDTO {
    private String clientId;
    private String seller;
    private List<TransactionForCreationDto> transactions;

    public SalesForCreationDTO() {
    }

    public SalesForCreationDTO(String clientId, String seller, List<TransactionForCreationDto> transactions) {
        this.clientId = clientId;
        this.seller = seller;
        this.transactions = transactions;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getSeller() {
        return seller;
    }

    public void setSeller(String seller) {
        this.seller = seller;
    }

    public List<TransactionForCreationDto> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<TransactionForCreationDto> transactions) {
        this.transactions = transactions;
    }
}
