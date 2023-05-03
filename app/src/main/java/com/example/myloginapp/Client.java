package com.example.myloginapp;


public class Client {
    String Username, Phone, Commande;

    public Client(String username, String phone, String commande) {
        Username = username;
        Phone = phone;
        Commande = commande;
    }

    public String getUsername() {
        return Username;
    }

    public String getPhone() {
        return Phone;
    }

    public String getCommande() {
        return Commande;
    }
}
