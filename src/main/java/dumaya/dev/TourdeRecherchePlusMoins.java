package dumaya.dev;

public class TourdeRecherchePlusMoins extends TourdeJeu {
    @Override
    public String comparaisonCombinaison(String tentative, String secret) {
        if (tentative.equals(secret)) {
            return "====";
        } else {
            char[] tabTentative=tentative.toCharArray();
            char[] tabsecret=secret.toCharArray();
            String[] tabcompare= new String[tabsecret.length];
            for (int i=0;i<tabsecret.length;i++) {
                if (tabsecret[i]<tabTentative[i]) {
                    tabcompare[i] = "-";
                } else {
                    if (tabsecret[i]>tabTentative[i]) {
                        tabcompare[i] = "+";
                    } else {
                        tabcompare[i] = "=";
                    }
                }
            }
            return tabcompare.toString();
        }
    }

    @Override
    public String preparationResultat(String resultat) {
        String texte = ("Ce n'est pas exact, try again -------->" + resultat);
        return texte;
    }
}
