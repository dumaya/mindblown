package dumaya.dev;

import static dumaya.dev.Partie.*;

public class Jeu {

    public boolean jeuChallenger() {
        boolean gagné=false;
        String secret="0000";
        if (modeDev) {
            secret = this.definirCombinaisonSecrete("J");
        }
        else {
            secret = this.definirCombinaisonSecrete("O");
        }
        System.out.println("Le secret est :"+secret);
        int nbtour=0;

        do {
            if (choixJeu.equals("R")) {
                TourdeRecherchePlusMoins tourdeJeuR = new TourdeRecherchePlusMoins();
                String tentative = tourdeJeuR.saisirCombinaison();
                if (tourdeJeuR.comparaisonCombinaison(tentative, secret).equals("====")) {
                    gagné = true;
                } else {
                    tourdeJeuR.afficherResultat(tourdeJeuR.preparationResultat(tourdeJeuR.comparaisonCombinaison(tentative,secret)));
                }

            } else {
                TourdeMastermind tourdeJeuM = new TourdeMastermind();
                tourdeJeuM.saisirCombinaison();
            }
            nbtour++;
        } while (nbtour <= nbessaiPossible || gagné );
    return gagné;
    }

    private String definirCombinaisonSecrete(String typejoueur) {
        String combiSecrete ="0000";
        if (typejoueur.equals("J")){
            combiSecrete = "1111";
        } else {
            combiSecrete = "0000";
        }
        return combiSecrete;
    }

    public void jeuDuel() {
    }

    public void jeuDefenseur() {
    }
}
