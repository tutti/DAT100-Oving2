import easyIO.*;

/**
 * Besvarelse p� oppgave 3
 * Sp�r brukeren om to tall x og n, og regner ut verdien av x^n p� to m�ter - 
 * ved hjelp av Math.pow() og ved hjelp av en l�kke. Begge resultatene skrives
 * ut, samt om de er like.
 * 
 * @author P�l V. Gjerde
 *
 */
public class Oppgave3 {
    private static In in = new In();
    private static Out out = new Out();

    public static void main(String[] args) {
        out.out("Skriv inn et tall for x: ");
        double base = in.inDouble();
        out.out("Skriv inn et tall for n: ");
        int exponent = in.inInt();
        
        double mathpow = Math.pow(base,  exponent);
        
        double calc = 1.0;
        for (int i = 0; i < exponent; ++i) {
            calc *= base;
        }
        
        out.outln("Resultat fra Math.pow(): " + mathpow);
        out.outln("Resultat fra l�kke:      " + calc);
        out.out("Like: " + ((mathpow == calc) ? "Ja" : "Nei"));
    }

}
