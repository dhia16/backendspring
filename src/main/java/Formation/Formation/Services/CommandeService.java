package Formation.Formation.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Formation.Formation.Model.Commande;
import Formation.Formation.Repository.CommandeRepository;
import jakarta.transaction.Transactional;

@Service
@Transactional
public class CommandeService {
    @Autowired
CommandeRepository CommandeRepo; 

public List<Commande> getCommandes() {
return (List<Commande>) CommandeRepo.findAll();
}
public Commande getSingleCommande(int id) {
    return CommandeRepo.findById(id).get();
}
public Commande addCommande(Commande commande) {
    return CommandeRepo.save(commande);
}
public void removeCommande(int id) {
    CommandeRepo.deleteById(id);
}
public Commande updateCommande(Commande commande) {
    return CommandeRepo.save(commande);
}    
}
