import easyIO.*;

/**
 * Besvarelse på oppgave 4
 * Regner ut radian-verdien, samt sinus og cosinus, for hver 15. vinkel
 * mellom 0 og 180 inklusivt.
 * 
 * @author Pål V. Gjerde
 *
 */
public class Oppgave4 {
    // Lengde på hvert tall og antall desimaler på flyttallene i utskriften
    private static int lengde = 10;
    private static int desimaler = 3;
    
    // Utskriftsobjektet
    private static Out out = new Out();

    public static void main(String[] args) {
        // Skriv ut overskriftene
        out.out("grader", lengde, Out.RIGHT);
        out.out("radianer", lengde, Out.RIGHT);
        out.out("sin(x)", lengde, Out.RIGHT);
        out.out("cos(x)", lengde, Out.RIGHT);
        
        for (int i = 0; i <= 180; i += 15) {
            // Regn ut vinkelen i radianer, og sin- og cos-verdiene av vinkelen
            double deg = (double)i;
            double rad = Math.toRadians(deg);
            double sin = Math.sin(rad);
            double cos = Math.cos(rad);
            
            // Skriv ut en ny linje og verdiene for denne vinkelen
            out.outln();
            out.out(i, lengde, Out.RIGHT);
            out.out(rad, desimaler, lengde);
            out.out(sin, desimaler, lengde);
            out.out(cos, desimaler, lengde);
        }
    }

}
