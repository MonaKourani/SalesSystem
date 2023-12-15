package dev.SalesSystem.Clients.Controllers;

import dev.SalesSystem.Clients.DTO.ClientForCreationDTO;
import dev.SalesSystem.Clients.Model.ClientModel;
import dev.SalesSystem.Clients.Service.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Clients")
public class ClientController {
    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService=clientService;
    }

    @GetMapping()
    public ResponseEntity<List<ClientModel>> fetchClients(){
        return clientService.fetchclients();
    }
    @PostMapping
    public ResponseEntity<ClientModel> createClient(@RequestBody ClientForCreationDTO client){
        return clientService.createClient(client);
    }
    @PostMapping("/{id}")
    public ResponseEntity<ClientModel> updateClient(@PathVariable String id,@RequestBody ClientForCreationDTO client){
        return clientService.updateClient(id,client);
    }
}
