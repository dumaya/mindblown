package dumaya.dev;

import java.util.Scanner;

/**
 * Une partie de jeu, avec enchainements de plusieurs jeux.
 */
public class Partie {
    public static String choixJeu;

    public void setChoixModeJeu(String choixModeJeu) {
        this.choixModeJeu = choixModeJeu;
    }

    private String choixModeJeu;
    public static boolean modeDev;
    public static int nbdeCouleur;
    public static int nbessaiPossible;
    public static int longueurduSecret;

    public void choixduJeu() {
        System.out.println("Choisissez le jeu auquel vous voulez jouer : R pour Rechercher +/- ou M pour Mastermind");
        Scanner sc = new Scanner(System.in);
        choixJeu = sc.next();
        System.out.println("Choisissez le mode de jeu auquel vous voulez jouer : C pour Challenger, U pour Duel ou D pour Defense");
        choixModeJeu = sc.next();
        System.out.println("C'est parti pour : Jeu : " + choixJeu + " Mode : " + choixModeJeu);
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
        Jeu jeu = new Jeu();
        switch (choixModeJeu) {
            case "C":
                jeu.jeuChallenger();
                break;
            case "U":
                jeu.jeuDuel();
                break;
            case "D":
                jeu.jeuDefenseur();
                break;
            default :
                break;
        }

    }
}
