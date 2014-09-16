import easyIO.*;

/**
 * Besvarelse p� oppgave 2
 * Leser inn en tekstfil (spesifisert av brukeren), der f�rste linje er antall
 * linjer i filen (utenom den f�rste linjen), teller antall linjer med et
 * gitt m�nster (ogs� spesifisert av brukeren), og skriver ut de to eller tre
 * midterste tegnene i hver linje (kun det ene tegnet for linjer p� ett tegn).
 * 
 * @author P�l V. Gjerde
 *
 */
public class Oppgave2 {
    private static In in = new In();
    private static Out out = new Out();
    
    
    public static void main(String[] args) {
        // �pne filen for lesing
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
        
        // Sp�r om et m�nster som skal finnes
        out.out("Skriv inn et m�nster: ");
        String monster = in.inLine();
        int antall = 0;
        
        // Opprett en string-array for oppgave d).
        String[] print = new String[antallLinjer];
        
        // Tell antall linjer med m�nsteret
        // Jeg bruker ikke forenklet for her, for jeg trenger indexen
        // til � lagre midtdelen av strengene i riktig rekkef�lge.
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
        out.outln("Antall linjer med m�nsteret: " + antall);
        
        for (String linje : print) {
            out.outln(linje);
        }
    }

}
