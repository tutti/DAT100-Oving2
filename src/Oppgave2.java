import easyIO.*;

/**
 * Besvarelse på oppgave 2
 * Leser inn en tekstfil (spesifisert av brukeren), der første linje er antall
 * linjer i filen (utenom den første linjen), teller antall linjer med et
 * gitt mønster (også spesifisert av brukeren), og skriver ut de to eller tre
 * midterste tegnene i hver linje (kun det ene tegnet for linjer på ett tegn).
 * 
 * @author Pål V. Gjerde
 *
 */
public class Oppgave2 {
    private static In in = new In();
    private static Out out = new Out();
    
    
    public static void main(String[] args) {
        // Åpne filen for lesing
        out.out("Skriv inn filnavn: ");
        String filnavn = in.inLine();
        In fil = new In(filnavn);
        
        // Les antall linjer
        int antallLinjer = fil.inInt();

        // Les inn hver linje i filen
        String[] linjer = new String[antallLinjer];
        for (int i = 0; i < antallLinjer; ++i) {
            linjer[i] = fil.inLine();
        }
        
        // Lukk filen
        fil.close();
        
        // Spør om et mønster som skal finnes
        out.out("Skriv inn et mønster: ");
        String monster = in.inLine();
        int antall = 0;
        
        // Opprett en string-array for oppgave d).
        String[] print = new String[antallLinjer];
        
        // Tell antall linjer med mønsteret
        // Jeg bruker ikke forenklet for her, for jeg trenger indexen
        // til å lagre midtdelen av strengene i riktig rekkefølge.
        for (int i = 0; i < linjer.length; ++i) {
            if (linjer[i].indexOf(monster) >= 0) {
                antall += 1;
            }
            // Ta med beregningen av midten av strengen
            if (linjer[i].length() == 1) {
                print[i] = linjer[i];
            }
            else if (linjer[i].length() % 2 == 0) {
                print[i] = linjer[i].substring(
                    linjer[i].length() / 2 - 1,
                    linjer[i].length() / 2 + 1
                );
            } else {
                print[i] = linjer[i].substring(
                    linjer[i].length() / 2 - 1,
                    linjer[i].length() / 2 + 2
                );
            }
        }
        
        // Skriv ut antall matcher
        out.outln("Antall linjer med mønsteret: " + antall);
        
        for (String linje : print) {
            out.outln(linje);
        }
    }

}
