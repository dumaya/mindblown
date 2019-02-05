package dumaya.dev;

public class TourdeRecherchePlusMoins extends TourdeJeu {
    @Override
    public String comparaisonCombinaison(String tentative, String secret) {
        char[] tabTentative=tentative.toCharArray();
        char[] tabsecret=secret.toCharArray();
        char[] tabcompare= new char[tabsecret.length];
        for (int i=0;i<tabsecret.length;i++) {
            if (tabsecret[i]<tabTentative[i]) {
                tabcompare[i]='-';
            } else {
                if (tabsecret[i]>tabTentative[i]) {
                    tabcompare[i] = '+';
                } else {
                    tabcompare[i] = '=';
                }
            }
        }
        return String.valueOf(tabcompare);
    }

    @Override
    public String preparationResultat(String resultat) {
        String texte = (resultat + " <------ Ce n'est pas exact, try again");
        return texte;
    }
}
