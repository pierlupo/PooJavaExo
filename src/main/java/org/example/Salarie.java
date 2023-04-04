package org.example;

public class Salarie {
        private static int counter = 0;
        private int id;
        public int Matricule;
        public String Categorie;
        public String Service;
        public String Nom;
        public static int Salaire;

    {
        ++counter;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Salarie.counter = counter;
    }

    public Salarie(int matricule, String categorie, String service, String nom, int salaire) {
        Matricule = matricule;
        Categorie = categorie;
        Service = service;
        Nom = nom;
        Salaire = salaire;
    }

    public Salarie() {
    }
}
