package fr.dampierre;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        int salaire = 400;
        int prime = 250;
        int quota = 10;
        System.out.println("Combien de ventes cette semaine ?");
        Scanner clavier = new Scanner(System.in);
        int nbDeVentes = clavier.nextInt();
        clavier.close();
        if (nbDeVentes >= quota) {
            salaire = salaire + prime;
        }
        System.out.println("Le salaire hebdo est de : " + salaire);
        // blabla
    }
}
