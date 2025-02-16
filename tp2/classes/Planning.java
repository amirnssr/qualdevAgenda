package classes;

public class Planning {
    private Reservation[] chTabReservations;
    private final int TAILLE;

    public Planning(int parTaille) {
        TAILLE = parTaille;
        chTabReservations = new Reservation[TAILLE];
    }

    public int getTaille(){
        return TAILLE;
    }

    private void fillPlanning(Planning planning) throws ExceptionPlanning {
        for (int i = 0; i < planning.getTaille(); i++) {
            planning.ajout(new Reservation(new Date(i + 1, 2, 2025), new PlageHoraire(new Horaire(9, 0), new Horaire(10, 0)), "Test" + i));
        }
    }

    public void ajout(Reservation reservation) throws ExceptionPlanning {
        if (chTabReservations[TAILLE - 1] != null) {
            System.out.println("tableau plein");
            throw new ExceptionPlanning(1);
        }
        if (!reservation.estValide()) {
            System.out.println("reservation non valide");
            throw new ExceptionPlanning(0);
        }
        for (int i = 0; i < chTabReservations.length; i++) {
            if (chTabReservations[i] == null) {
                chTabReservations[i] = reservation;
                break;
            }
            if (chTabReservations[i].compareTo(reservation) == 0) {
                System.out.println("reservations non compatibles");
                throw new ExceptionPlanning(2);
            }
        }
       
    }

    public String toString(){
        for(int i=0; i<chTabReservations.length;i++){
            if (chTabReservations[i] != null ){
                System.out.println(chTabReservations[i].toString());
            }
            else{
                System.out.println(" ---- pas de réservation -----");
            }
           
        }
        return "";
    }

    public Reservation getReservation(Date date){
        for (int i = 0; i < chTabReservations.length; i++){
            if (chTabReservations[i] != null && chTabReservations[i].chDate.compareTo(date) == 0){ // Utilisation de compareTo
                System.out.println("trouvé");
                return chTabReservations[i];
            }
        }
        return null;
    }





}