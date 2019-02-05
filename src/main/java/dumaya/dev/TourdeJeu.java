package dumaya.dev;

import java.util.Scanner;

import static dumaya.dev.Partie.longueurduSecret;

/**
 * Une série de x chiffres/couleurs
 * @param nbChiffre de la combinaison à trouver
 * @param essaiCombinaison
 */
public abstract class TourdeJeu {

    /**
     * Saisir une combinaison de n chiffres
     */
    public String saisirCombinaison() {
        System.out.println("Saisie combinaison de " + longueurduSecret + " chiffres");
        Scanner sc = new Scanner(System.in);
        String essaiCombinaison = sc.next();
        return essaiCombinaison;
    }

    /**
     * Afficher le résultat
     */

    public void afficherResultat(String texte) {
        System.out.println(texte);
    }

    public abstract String comparaisonCombinaison(String tentative, String secret);

    public abstract String preparationResultat(String resultat);
}


