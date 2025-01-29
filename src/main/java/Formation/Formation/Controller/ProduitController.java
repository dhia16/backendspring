package Formation.Formation.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Formation.Formation.Model.Produit;
import Formation.Formation.Services.ProduitService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@CrossOrigin("*")
@RequestMapping("/produit")


public class ProduitController {
    @Autowired
    ProduitService ProduitService ; 
@PostMapping("/ajoutproduit")
public Produit ajoutproduit(@RequestBody Produit Produit){
return ProduitService.ajoutProduit(Produit);

}
@GetMapping("/produits")

public List<Produit> getAllProduit(){
    return ProduitService.getAllProduits();
}
@GetMapping("/produits/{id}")
public Produit getProduit(@PathVariable int ID ){
    return ProduitService.getSingleProduit(ID);
}

@DeleteMapping("/deleteproduit/{id}")

public void deleteProduit(@PathVariable int id) {
    ProduitService.deleteProduit(id);
} 

@PostMapping("/ajoutrproduit")
public Produit ajoutProduit(@RequestBody Produit Produit){
    return ProduitService.ajoutProduit(Produit);
}
@PutMapping("/updateproduit")

public Produit updateProduit(@RequestBody Produit Produit){
    return ProduitService.updateProduit(Produit);
}

@GetMapping("/searchbyname/{nom}")
public List<Produit> searchbyName(@PathVariable String nom) {
    return ProduitService.searchProduits(nom);
}


}



    

