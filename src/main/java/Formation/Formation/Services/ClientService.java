package Formation.Formation.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Formation.Formation.Model.Client;
import Formation.Formation.Repository.ClientRepository;
import jakarta.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ClientService {
    @Autowired
 ClientRepository ClientRepo ; 
 public List<Client> getClientList() {
    return (List<Client>) ClientRepo.findAll() ;
 }
 public Client getClient(int id) {
    return ClientRepo.findById(id).get();
 }
 public Client addClient(Client client) {
    return ClientRepo.save(client);
 }
 public void deleteClient(int id) { 
    ClientRepo.deleteById(id);
 } 
 public Client updateClient(Client client) {
    return ClientRepo.save(client);
 }


}
