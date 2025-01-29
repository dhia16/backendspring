package Formation.Formation.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Formation.Formation.Model.Produit;
import Formation.Formation.Repository.ProduitRepository;
import jakarta.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class ProduitService {

@Autowired  

ProduitRepository ProduitRep;

public List<Produit> getAllProduits() {
    return (List<Produit>) ProduitRep.findAll();
   }
public Produit ajoutProduit(Produit Produit){
    return ProduitRep.save(Produit);
}
public Produit getSingleProduit(int id){
    return ProduitRep.findById(id).get()   ;
}
public void deleteProduit( int id){
    System.out.println(id);
    ProduitRep.deleteById(id);
}
public Produit updateProduit(Produit produit)
{
    return ProduitRep.save(produit);
}
public List<Produit> searchProduits(String Query) {
    //System.out.println(Query+"aaa");
    return (List<Produit>) ProduitRep.findByNomProduit(Query);
   }
}