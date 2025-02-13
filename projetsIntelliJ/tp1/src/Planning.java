public class Planning {
    private Reservation[] chTabReservations;
    private final int TAILLE;

    public Planning(int parTaille) {
        TAILLE = parTaille;
        chTabReservations = new Reservation[TAILLE];
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
           
        }
        return "";
    }

    public Reservation getReservation(Date date){
        for (int i = 0; i < chTabReservations.length; i++){
            if (chTabReservations[i] != null && chTabReservations[i].chDate.equals(date)){
                System.out.println("trouvé");
                return chTabReservations[i];
                
            }
        }
        return null; 

    }

    public Reservation[] GetReservations (Date parDate){
        Reservation [] tabres= new Reservation [TAILLE];
        int nbres=0;
        for (int i=0;i<chTabReservations.length;i++){
            if(chTabReservations[i]!=null && chTabReservations[i].chDate.compareTo(parDate)==0){
                tabres[nbres]=tabres[i];
                nbres++;
            }
        }
        return tabres;

    }

    
}