package dev.SalesSystem.Clients.Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class ClientModel {
    @Id
    private String id;
    private String name;
    private String lastName;
    private long mobile;

    public ClientModel() {
    }

    public ClientModel(String name, String lastName, long mobile) {
        this.name = name;
        this.lastName = lastName;
        this.mobile = mobile;
    }

    public String getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }
}
