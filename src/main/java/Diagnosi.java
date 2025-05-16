import java.time.LocalDate;
import java.util.ArrayList;

public class Diagnosi {
/*📝 3. Classe Diagnosi
Attributi:
descrizione (String) - descrizione della diagnosi
terapia (String) - trattamento consigliato
data (LocalDate) - data della diagnosi
dataScadenza (LocalDate) - scadenza della diagnosi
dottore (Dottore) - dottore che ha effettuato la diagnosi
Metodi:
isScaduta(): verifica se la diagnosi è scaduta.
stampaDettagli(): stampa i dettagli della diagnosi*/

    String descrizione;
    String terapia;
    LocalDate data;
    LocalDate dataScadenza;
    //Dottore dottore = new Dottore();

    public Diagnosi(String descrizione, String terapia, LocalDate data, LocalDate dataScadenza) {
        this.descrizione = descrizione;
        this.terapia = terapia;
        this.data = data;
        this.dataScadenza = dataScadenza;
    }

    @Override
    public String toString() {
        return "Diagnosi{" +
                "descrizione='" + descrizione + '\'' +
                ", terapia='" + terapia + '\'' +
                ", data=" + data +
                ", dataScadenza=" + dataScadenza +
                ", dottore=" + "Dottore" +
                '}';
    }

    public void isScaduta() {
        if (data == dataScadenza) {
            System.out.println("La tua diagnosi è scaduta");
        }
    }

    ;

    public static ArrayList<String> getDettagliDiagnosiList(ArrayList<Diagnosi> diagnosiList) {
        ArrayList<String> dettagli = new ArrayList<>();
        for (Diagnosi d : diagnosiList) {
            dettagli.add(d.toString());
        }

        return dettagli;
    }

}
