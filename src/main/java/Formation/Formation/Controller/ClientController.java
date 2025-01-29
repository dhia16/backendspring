package Formation.Formation.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Formation.Formation.Model.Client;
import Formation.Formation.Services.ClientService;

@RestController
@CrossOrigin("*")
@RequestMapping("/client")
public class ClientController {
    @Autowired
    ClientService ClientService;

@GetMapping("/clients")
public List<Client> getAllClients(){
    return ClientService.getClientList();
}
@GetMapping("/client/{id}")
public Client getClient(@PathVariable int id){
return ClientService.getClient(id);
}
@PostMapping("/ajoutclient")
public Client ajoutClient(@RequestBody Client Client){
    return ClientService.addClient(Client);
}
@DeleteMapping("/deleteclient/{id}")
public void deleteClient(@PathVariable int id){
    ClientService.deleteClient(id);
}
@PutMapping("/updateclient")
public Client updateClient(@RequestBody Client Client){
    return ClientService.updateClient(Client);
}

}
