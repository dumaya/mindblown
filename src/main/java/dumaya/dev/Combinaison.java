package dumaya.dev;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

/**
 * Une série de x chiffres/couleurs
 * @param nbChiffre de la combinaison à trouver
 * @param essaiCombinaison
 */
public class Combinaison {
    private int nbChiffre;

    public Combinaison(int nbChiffre) {
        this.nbChiffre = nbChiffre;
    }

    private List<Integer> essaiCombinaison = new ArrayList<Integer>();

    public List<Integer> getEssaiCombinaison() {
        return essaiCombinaison;
    }

    public void setEssaiCombinaison(List<Integer> essaiCombinaison) {
        this.essaiCombinaison = essaiCombinaison;
    }

    /**
     * Saisir une combinaison de n chiffres
     */
    public void saisirCombinaison(){
        System.out.println("Saisie combinaison de " + nbChiffre + " chiffres");
                Scanner sc = new Scanner(System.in);
        int nb=0;
        for(int i=0;i<nbChiffre;i++) {
            System.out.println("Saisie " + (i+1) );
            nb = sc.next("\\d{1,3}\\");
            essaiCombinaison.add(nb);
        }
    }

    /**
     * Afficher la combinaison
     */
    public void afficherCombinaison(){
        for(int i=0;i<nbChiffre;i++) {
            System.out.println(essaiCombinaison.toArray());
        }
    }
}
