package Formation.Formation.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;




@Entity
public class Produit {
@Id   
@GeneratedValue (strategy = GenerationType.IDENTITY)
    int id;
    String nomProduit;
    String description;
    double prix;
    int quantite;
    String photoProduit;

    @ManyToOne
    Categorie categorie;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomProduit() {
        return nomProduit;
    }
    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public double getPrix() {
        return prix;
    }
    public void setPrix(double prix) {
        this.prix = prix;
    }
    public int getQuantite() {
        return quantite;
    }
    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public Categorie getCategorie() {
        return categorie;
    }
    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
    public String getPhotoProduit() {
        return photoProduit;
    }
    public void setPhotoProduit(String photoProduit) {
        this.photoProduit = photoProduit;
    }
    
}

