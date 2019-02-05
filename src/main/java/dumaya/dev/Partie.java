package dumaya.dev;

import java.util.Scanner;

public class Partie {
    public static String choixJeu;
    private String choixModeJeu;
    public static boolean modeDev;
    public boolean isModeDev() {
        return modeDev;
    }


    public static int nbdeCouleur;
    public static int nbessaiPossible;
    public static int longueurduSecret;

    public void choixduJeu() {
        System.out.println("Choisissez le jeu auquel vous voulez jouer : R pour Rechercher +/- ou M pour Mastermind");
        Scanner sc = new Scanner(System.in);
        choixJeu = sc.next();
        System.out.println("Choisissez le mode de jeu auquel vous voulez jouer : C pour Challenger, U pour Duel ou D pour Defense");
        choixModeJeu = sc.next();
    }

    public void initLog() {
        modeDev = true;
    }

    public void chercherConfig() {
        nbdeCouleur=4;
        nbessaiPossible=20;
        longueurduSecret=4;
    }

    public void lancerJeu() {
        System.out.println("C'est parti pour : Jeu :" + choixJeu + " Mode : " + choixModeJeu);
        Jeu jeu = new Jeu();
        switch (choixModeJeu) {
            case "C":
                jeu.jeuChallenger();
            case "U":
                jeu.jeuDuel();
            case "D":
                jeu.jeuDefenseur();
            default :
                break;
        }

    }
}
