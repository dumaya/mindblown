package dumaya.dev;

/**
 * Hello world!
 *
 */
public class Main
{
    public static <partie> void main(String[] args )
    {
        System.out.println("Bienvenue dans Mindblown");
        Partie partie = new Partie();
        partie.initLog();
        partie.chercherConfig();
        partie.choixduJeu();
        partie.lancerJeu();
    }
}
