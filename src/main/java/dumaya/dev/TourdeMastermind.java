package dumaya.dev;

public class TourdeMastermind extends TourdeJeu {
    @Override
    public String comparaisonCombinaison(String tentative, String secret) {

        return tentative;
    }

    @Override
    public String preparationResultat(String resultat) {
        String texte = (resultat + "<------ Ce n'est pas exact, try again" );
        return texte;
    }
}