public class PlageHoraire {
    final static int chDUREEMIN = 60;
    private Horaire chHeureDebut;
    private Horaire chHeureFin;

    public PlageHoraire(Horaire HeureDebut, Horaire HeureFin) {
        chHeureDebut = HeureDebut;
        chHeureFin = HeureFin;
    }

    public String toString() {
        return chHeureDebut.getHeure() + "h" + chHeureDebut.getQuartHeure() + "-" + chHeureFin.getHeure() + "h"
                + chHeureFin.getQuartHeure();
    }

    public int duree() {
        return chHeureFin.toMinutes() - chHeureDebut.toMinutes();
    }

    public String convert() {
        int h = duree() / 60;
        int min = duree() % 60;
        if (min < 10 && min >= 0)
            return Integer.toString(h) + "h" + "0" + Integer.toString(min);
        else
            return Integer.toString(h) + "h" + Integer.toString(min);
    }

    public int compareTo(PlageHoraire PH) {
        if (this.chHeureDebut.toMinutes() > PH.chHeureDebut.toMinutes())
            return 1;
        if (this.chHeureDebut.toMinutes() < PH.chHeureDebut.toMinutes())
            return -1;
        else
            return 0;
    }
}