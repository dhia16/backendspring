package Formation.Formation.Model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    Date dateCommande;
    Double montantCommande;
    @ManyToOne
    Produit Produit;
    @ManyToOne
    Client Client;

    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public Date getDateCommande() {
        return dateCommande;
    }
    public void setDateCommande(Date dateCommande) {
        this.dateCommande = dateCommande;
    }
    public Double getMontantCommande() {
        return montantCommande;
    }
    public void setMontantCommande(Double montantCommande) {
        this.montantCommande = montantCommande;
    }
    public Produit getProduit() {
        return Produit;
    }
    public void setProduit(Produit produit) {
        Produit = produit;
    }
    public Client getClient() {
        return Client;
    }
    public void setClient(Client client) {
        Client = client;
    }
    
}
