package dev.SalesSystem.Clients.Repository;

import dev.SalesSystem.Clients.Model.ClientModel;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ClientRepository extends MongoRepository<ClientModel,String> {

}
