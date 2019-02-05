package dumaya.dev;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

/**
 * Une série de x chiffres/couleurs
 * @param nbChiffre de la combinaison à trouver
 * @param essaiCombinaison
 */
public abstract class TourdeJeu {

    /**
     * Saisir une combinaison de n chiffres
     */
    public void saisirCombinaison(){
        System.out.println("Saisie combinaison de " + nbChiffre + " chiffres");
                Scanner sc = new Scanner(System.in);
        int nb=0;
        for(int i=0;i<nbChiffre;i++) {
            System.out.println("Saisie " + (i+1) );
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

    public void afficherResultat() {

    }

    public abstract void comparaisonCombinaison();
    public abstract void preparationResultat();


}
