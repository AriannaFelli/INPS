package org.example;

import java.time.LocalDate;
import java.time.LocalTime;

public class VisitaMedica {
    private LocalDate data;
    private LocalTime orario;
    private Dottore dottore;
    private Diagnosi diagnosi;
    private boolean confermata;

    public VisitaMedica(LocalDate data, LocalTime orario, Dottore dottore) {
        this.data = data;
        this.orario = orario;
        this.dottore = dottore;
        this.confermata = false;
    }

    public void conferma() {
        this.confermata = true;
    }

    public void assegnaDiagnosi(Diagnosi diagnosi) {
        this.diagnosi = diagnosi;
    }

    @Override
    public String toString() {
        return "Visita il " + data + " alle " + orario +
                " con " + dottore +
                (confermata ? " [CONFERMATA]" : " [NON CONFERMATA]") +
                (diagnosi != null ? " - Diagnosi: " + diagnosi : "");
    }
}
