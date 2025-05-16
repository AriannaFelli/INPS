import org.example.Dottore;

import java.time.LocalDate;
import java.util.ArrayList;

public class Diagnosi {

    String descrizione;
    String terapia;
    LocalDate data;
    LocalDate dataScadenza;
    Dottore dottore = new Dottore();

    public Diagnosi(String descrizione, String terapia, LocalDate data, LocalDate dataScadenza) {
        this.descrizione = descrizione;
        this.terapia = terapia;
        this.data = data;
        this.dataScadenza = dataScadenza;
    }

    public Diagnosi() {

    }

    public String getDescrizione() {
        return descrizione;
    }

    public String getTerapia() {
        return terapia;
    }

    public LocalDate getData() {
        return data;
    }

    public LocalDate getDataScadenza() {
        return dataScadenza;
    }

    public Dottore getDottore() {
        return dottore;
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

    public ArrayList<String> getDettagliDiagnosiList(ArrayList<Diagnosi> diagnosiList) {
        ArrayList<String> dettagli = new ArrayList<>();
        for (Diagnosi d : diagnosiList) {
            dettagli.add(d.toString());
        }

        return dettagli;
    }

}
