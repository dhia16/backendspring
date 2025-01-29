package Formation.Formation.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GenerationType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Client {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)

    int id;
    String nomClient;
    String prenomClient;
    String emailClient;
    String telephoneClient;    
    String adresseClient;
    public int getId() {
        return id; 
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomClient() {
        return nomClient;
    }
    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }
    public String getPrenomClient() {
        return prenomClient;
    }
    public void setPrenomClient(String prenomClient) {
        this.prenomClient = prenomClient;
    }
    public String getEmailClient() {
        return emailClient;
    }
    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }
    public String getTelephoneClient() {
        return telephoneClient;
    }
    public void setTelephoneClient(String telephoneClient) {
        this.telephoneClient = telephoneClient;
    }
    public String getAdresseClient() {
        return adresseClient;
    }
    public void setAdresseClient(String adresseClient) {
        this.adresseClient = adresseClient;
    }

    
    
}
