import easyIO.*;

public class Oppgave5 {
    private static In in = new In();
    private static Out out = new Out();
    
    public static void main(String[] args) {
        double hoyeste = -10000.0;
        double sum = 0;
        
        out.outln("Temperaturanalyse");
        out.outln("*****************");
        out.outln("Skriv inn temperaturer:");
        for (int i = 0; i < 7; ++i) {
            out.out((i+1)+". dag: ");
            double temperatur = in.inDouble();
            hoyeste = Math.max(hoyeste, temperatur);
            sum += temperatur;
        }
        out.outln("*****************");
        out.out("Gjennomsnittstemperaturen var ");
        out.outln(sum / 7.0);
        out.out("Den høyeste temperaturen var ");
        out.outln(hoyeste);
    }
}
