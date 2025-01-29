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

import Formation.Formation.Model.Commande;
import Formation.Formation.Services.CommandeService;

@RestController
@CrossOrigin("*")
@RequestMapping("/commande")
public class CommandeController {
    @Autowired
    CommandeService commandeService;

    @GetMapping("/commandes")
    public List<Commande> getAllCommandes(){
        return commandeService.getCommandes();
    }
    @GetMapping("/commande/{id}")
    public Commande getCommande(@PathVariable int id){
        return commandeService.getSingleCommande(id);
    }
    @PostMapping("/ajoutcommande")
    public Commande ajoutCommande(@RequestBody Commande Commande){
      return commandeService.addCommande(Commande);
    }
    @PutMapping("/updatecommande")
    public Commande updateCommande(@RequestBody Commande Commande){
        return commandeService.updateCommande(Commande);
    }
    @DeleteMapping("/deletecommande/{id}")
    public void deleteCommande(@PathVariable int id){
        commandeService.removeCommande(id);
    }



}
