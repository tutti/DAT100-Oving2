import easyIO.*;

/**
 * Besvarelse på oppgave 1
 * 
 * @author Pål V. Gjerde
 *
 */
public class Oppgave1 {
    private static In in = new In();
    private static Out out = new Out();
    
    /**
     * Tar en poengsum, returnerer karakteren den poengsummen tilsvarer.
     * 
     * @param poengsum Elevens poengsum
     * @return Karakteren (en bokstav) eleven har fått
     */
    public static char poengsumTilKarakter(int poengsum) {
        if (poengsum < 40) return 'F';
        if (poengsum < 50) return 'E';
        if (poengsum < 60) return 'D';
        if (poengsum < 80) return 'C';
        if (poengsum < 90) return 'B';
        return 'A';
    }
    
    /**
     * Leser inn 10 poengsummer, skriver ut tilsvarende karakter for hvert
     * forsøk. Ugyldige poengsummer godtas ikke, og må skrives inn på nytt.
     * 
     * @param args Brukes ikke.
     */
    public static void main(String[] args) {
        out.outln("Karaktersetting");
        out.outln("***************");
        int poengsum;
        for (int i=0; i < 10; ++i) {
            for (
                poengsum = -1;
                poengsum < 0 || poengsum > 100;
                poengsum = in.inInt()
            ) {
                out.out("Les inn poengsum (0-100): ");
            }
            out.out("Karakter: ");
            out.outln(poengsumTilKarakter(poengsum));
        }
    }
}
