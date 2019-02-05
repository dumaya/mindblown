package dumaya.dev;

import static dumaya.dev.Partie.*;

public class Jeu {

    public boolean jeuChallenger() {
        boolean gagné=false;
        String secret="";
        if (modeDev) {
            secret = this.definirCombinaisonSecrete("J");
        }
        else {
            secret = this.definirCombinaisonSecrete("O");
        }
        System.out.println("Le secret est :"+secret);
        int nbtour=0;

        while (nbtour >= nbessaiPossible || gagné ){
            if (choixJeu.equals("R")) {
                TourdeRecherchePlusMoins tourdeJeuR = new TourdeRecherchePlusMoins();
                tourdeJeuR.saisirCombinaison();
                tourdeJeuR.comparaisonCombinaison();
                tourdeJeuR.preparationResultat();
                tourdeJeuR.afficherResultat();

            } else {
                TourdeMastermind tourdeJeuM = new TourdeMastermind();
                tourdeJeuM.saisirCombinaison();

            }

            nbtour++;
        }
    return gagné;
    }

    private String definirCombinaisonSecrete(String typejoueur) {
        String combiSecrete ="";
        if (typejoueur.equals("J")){
            combiSecrete = "1111";
        } else {
            combiSecrete = "OOOO";
        }
        return combiSecrete;
    }

    public void jeuDuel() {
    }

    public void jeuDefenseur() {
    }
}
