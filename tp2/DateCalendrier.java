
import java.util.Calendar;

public class DateCalendrier extends Date implements ConstantesCalendrier,Comparable<Date> {
    public int chJourSemaine;

    public DateCalendrier(){
        
        Calendar today= Calendar.getInstance();
        chAnnee=today.get(Calendar.YEAR);
        chMois=today.get(Calendar.MONTH)+1;
        chJour=today.get(Calendar.DAY_OF_MONTH);
        int dayOfWeek=today.get(Calendar.DAY_OF_WEEK);
        chJourSemaine=dayOfWeek;
  
        if(chJourSemaine==1)
                chJourSemaine=7;
        else chJourSemaine-=1;


        
    }

    public DateCalendrier(int chJour,int chMois,int chAnnee){
        super( chJour, chMois,chAnnee); //appel au super constructeur
        Calendar today= Calendar.getInstance();
        today.set(this.chAnnee,this.chMois-1,this.chJour);
        this.chAnnee=today.get(Calendar.YEAR);
        this.chMois=today.get(Calendar.MONTH)+1;
        this.chJour=today.get(Calendar.DAY_OF_MONTH);
        this.chJourSemaine=today.get(Calendar.DAY_OF_WEEK);
       
        if(chJourSemaine==1)
                chJourSemaine=7;
        else chJourSemaine-=1;

    }

    public DateCalendrier dateDeLaVeille(){
        Date d=super.dateDeLaVeille();
        DateCalendrier c= new DateCalendrier(d.chJour,d.chMois,d.chAnnee);
        return c;
    }

    public DateCalendrier dateDuLendemain(){
        Date d= super.dateDuLendemain();
        DateCalendrier c= new DateCalendrier( d.chJour,d.chMois, d.chAnnee);
        return c;


    }
    
    
    public String toString(){
        return JOURS_SEMAINE[chJourSemaine-1]+" "+ chJour +" "+ MOIS[chMois-1];
    }

    public int compareTo(Date date){
        if (date.chAnnee>chAnnee){
            return -1;

        }
        if(date.chAnnee<chAnnee){
            return 1;
        }
        if(date.chMois>chMois){
            return -1;

        }
        if(date.chMois<chMois){
            return 1;

        }
        if(date.chJour>chJour){
            return -1;

        }
        if(chJour>date.chJour){
            return 1;
        }
        return 0;
    }

    
}
