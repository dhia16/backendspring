package Formation.Formation.Repository;

import org.springframework.data.repository.CrudRepository;

import Formation.Formation.Model.Produit;
import java.util.List;

public interface ProduitRepository extends CrudRepository <Produit ,Integer>{

     List<Produit> findByNomProduit(String nomProduit);

}
