import classes.Date;
import classes.Horaire;
import classes.PlageHoraire;
import classes.Reservation;

import java.util.ArrayList;
import java.util.TreeSet;

public class ClientPlanningCollections {
    public static void main (String [ ]args){
        Horaire horaired= new Horaire(12, 00);
        Horaire horairef=new Horaire(13, 30);
        Date dateseance=new Date(05, 03, 2024);
        PlageHoraire pH= new PlageHoraire(horaired, horairef);
        Reservation seance= new Reservation(dateseance, pH,"poney avec nathan");



        Horaire horairede= new Horaire(05, 2);
        Horaire horairefi=new Horaire(06, 3);
        Date dateseance2=new Date(07, 04, 2024);
        PlageHoraire pH1= new PlageHoraire(horairede, horairefi);
        Reservation seance1= new Reservation(dateseance2, pH1,"natation avec nathan");

        ArrayList<Reservation> alist=new ArrayList<Reservation>();
        TreeSet<Reservation> tset=new TreeSet<Reservation>();

        alist.add(seance);
        //tset.add(seance1);
        PlanningCollections plc1= new PlanningCollections(alist,tset);
        System.out.println(plc1.toString());
    }
}
