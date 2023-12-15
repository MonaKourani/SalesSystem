package dev.SalesSystem.Clients.Service;

import dev.SalesSystem.Clients.DAO.ClientDAO;
import dev.SalesSystem.Clients.DTO.ClientForCreationDTO;
import dev.SalesSystem.Clients.Model.ClientModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Component
public class ClientService {
    @Autowired
    private ClientDAO clientDAO;

    public ResponseEntity<List<ClientModel>> fetchclients(){
        return ResponseEntity.ok(clientDAO.fetchClients());
    }
    public ResponseEntity<ClientModel> createClient(ClientForCreationDTO client){
        return ResponseEntity.ok(clientDAO.createClient(new ClientModel(client.getName(),client.getLastName(),client.getMobile())));
    }

    public ResponseEntity<ClientModel> updateClient(String id,ClientForCreationDTO client){
        return ResponseEntity.ok(clientDAO.updateClient(id,new ClientModel(client.getName(),client.getLastName(),client.getMobile())));
    }
}
