package dev.SalesSystem.Clients.DTO;

public class ClientForCreationDTO {
    private String name;
    private String lastName;
    private long mobile;

    public ClientForCreationDTO() {
    }

    public ClientForCreationDTO(String name, String lastName, long mobile) {
        this.name = name;
        this.lastName = lastName;
        this.mobile = mobile;
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
