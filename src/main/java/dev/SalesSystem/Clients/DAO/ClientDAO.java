package dev.SalesSystem.Clients.DAO;

import dev.SalesSystem.Clients.Model.ClientModel;
import dev.SalesSystem.Clients.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ClientDAO {
    @Autowired
    private ClientRepository clientRepository;
    public List<ClientModel> fetchClients (){
        return clientRepository.findAll();
    }
    @Transactional
    public ClientModel createClient(ClientModel clientModel) {
        return clientRepository.save(clientModel);
    }

    @Transactional
    public ClientModel updateClient(String id, ClientModel clientModel) {
        Optional<ClientModel> client = clientRepository.findById(id);

        if (client.isPresent()) {
            ClientModel existingClient =client.get();
            existingClient.setName(clientModel.getName());
            existingClient.setLastName(clientModel.getLastName());
            existingClient.setMobile(clientModel.getMobile());
            return clientRepository.save(existingClient);
        } else {
            throw new IllegalStateException("Product not found with ID: " + id);
        }
    }
}
