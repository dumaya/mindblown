package dumaya.dev;

import static dumaya.dev.Partie.*;

public class Jeu {

    public boolean jeuChallenger() {
        System.out.println("Lancement du jeu en mode Challenger");
        boolean gagne=false;
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
                    gagne = true;
                } else {
                    tourdeJeuR.afficherResultat(tourdeJeuR.preparationResultat(tourdeJeuR.comparaisonCombinaison(tentative,secret)));
                }

            } else {
                TourdeMastermind tourdeJeuM = new TourdeMastermind();
                tourdeJeuM.saisirCombinaison();
            }
            nbtour++;
        } while ((nbtour <= nbessaiPossible) && !gagne);
    return gagne;
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
        System.out.println("Lancement du jeu en mode Duel");
    }

    public void jeuDefenseur() {
        System.out.println("Lancement du jeu en mode Defenseur");
    }
}
