package org.example;

public class DemoSalarie  {



    public static void AfficherSalaire() {


        Salarie salarie = new Salarie(0, "employé", "administratif", "Jean-Michel Toto", 2000);
        System.out.println( "Le salarié " + salarie.Nom +" a un salaire de "+ salarie.Salaire + " euros (bon salaire pour un employé)");
        Salarie salarie1 = new Salarie(1, "employé", "administratif","Jean-Philippe Tata", 2300);
        System.out.println("Le salarié " + salarie1.Nom +" a un salaire de "+ salarie1.Salaire + " euros (on voit qu'il y en a un qui a des primes)");
        Salarie salarie2 = new Salarie(2, "cadre", "vente", "Jean-Claude Titi", 3000);
        System.out.println("Le salarié " + salarie2.Nom +" a un salaire de "+ salarie2.Salaire + " euros (ça touche pas mal)");
        Salarie salarie3 = new Salarie(3, "cadre", "vente", "Jean-Paul Tutu", 3500);
        System.out.println("Le salarié " + salarie3.Nom +" a un salaire de "+ salarie3.Salaire + " euros (ça touche encore mieux)");


      int salaireTotal = salarie.Salaire + salarie1.Salaire + salarie2.Salaire + salarie3.Salaire;
      System.out.println("Le montant total des salaires est de : " + salaireTotal);

        int nbrSalaries = Salarie.getCounter();
        System.out.println("Il y a ici un total de " + nbrSalaries + " salariés");

    }



}
