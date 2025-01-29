package Formation.Formation.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Formation.Formation.Model.Categorie;
import Formation.Formation.Repository.CategorieRepository;
import jakarta.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class CategorieService {

    @Autowired
 CategorieRepository CategorieRepo;
public List<Categorie> getAllCategorie(){
return (List<Categorie>) CategorieRepo.findAll();
}
public Categorie getSingleCategorie( int id ) {
 return CategorieRepo.findById(id).get();
}

public void deleteCategorie( int id ) {
    CategorieRepo.deleteById(id);
}
public Categorie addCategorie( Categorie Categorie ) {
 return  CategorieRepo.save(Categorie);

}
public Categorie updateCategorie( Categorie Categorie ) {
    return  CategorieRepo.save(Categorie);
   
   }
}