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

import Formation.Formation.Model.Categorie;
import Formation.Formation.Services.CategorieService;

@RestController
@CrossOrigin("*")
@RequestMapping("/categorie")
public class CategorieController {
    @Autowired
    CategorieService CategorieService;
    @PostMapping ("/ajoutcategorie")
    public Categorie ajouCategorie(@RequestBody Categorie Categorie)
    {
    return CategorieService.addCategorie(Categorie);
    }
    @GetMapping("/categories")
    public List<Categorie> getCategories(){
        return CategorieService.getAllCategorie();
    }
    @GetMapping("/categorie/{id}")
    public Categorie getSingleCategorie(@PathVariable int id){
        return CategorieService.getSingleCategorie(id);
    }
    @DeleteMapping("/deletecategorie/{id}")
    public void deleteCategorie(@PathVariable int id){
        CategorieService.deleteCategorie(id);
    }
    @PutMapping("/updatecategorie")
    public Categorie updateCategorie(@RequestBody Categorie Categorie){
        return CategorieService.updateCategorie(Categorie);
    }


}
