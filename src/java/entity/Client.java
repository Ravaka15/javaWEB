/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

/**
 *
 * @author ZoR
 */
public class Client {
    private int idClient;
    private String nomClient;
    private String prenomClient;
    private String sexeClient;
    private String adresseClient;
    private String situationMatClient;

    public Client() {
    }

    public Client(int idClient, String nomClient, String prenomClient, String sexeClient, String adresseClient, String situationMatClient) {
        this.idClient = idClient;
        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
        this.sexeClient = sexeClient;
        this.adresseClient = adresseClient;
        this.situationMatClient = situationMatClient;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
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

    public String getSexeClient() {
        return sexeClient;
    }

    public void setSexeClient(String sexeClient) {
        this.sexeClient = sexeClient;
    }

    public String getAdresseClient() {
        return adresseClient;
    }

    public void setAdresseClient(String adresseClient) {
        this.adresseClient = adresseClient;
    }

    public String getSituationMatClient() {
        return situationMatClient;
    }

    public void setSituationMatClient(String situationMatClient) {
        this.situationMatClient = situationMatClient;
    }
    
}
