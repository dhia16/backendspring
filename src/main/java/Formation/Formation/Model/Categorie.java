package Formation.Formation.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Categorie {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

    int id;
    String nomCategorie;
    String descriptionCategorie;
    
    
    public void setId(int id) {
        this.id = id;
    }
    public void setNomCategorie(String nomCategorie) {
        this.nomCategorie = nomCategorie;
    }
    public void setDescriptionCategorie(String descriptionCategorie) {
        this.descriptionCategorie = descriptionCategorie;
    }
    public int getId() {
        return id;
    }
    public String getNomCategorie() {
        return nomCategorie;
    }
    public String getDescriptionCategorie() {
        return descriptionCategorie;
    }
    
    
}
