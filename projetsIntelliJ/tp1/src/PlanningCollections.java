import java.util.*;



public class PlanningCollections {
    public ArrayList<Reservation>chListReservations;
    public TreeSet<Reservation>chSetReservations;
    public TreeMap<Integer,TreeSet<Reservation>>chTreeMap;
    public PlanningCollections(){
        chListReservations=new ArrayList<Reservation>();
        chSetReservations=new TreeSet<Reservation>();
    }

    public String toString(){
        return "treeSet: "+chSetReservations.size()+"- \n"+chSetReservations+
        " ArrayList: "+chListReservations.size()+"- \n"+chListReservations+"- \n"+
         "TreeMap: "+ chTreeMap.size()+"- \n"+chTreeMap+"-\n"
        ;
    }

    public void ajout (Reservation parReservation) throws ExceptionPlanning{
        Iterator<Reservation>iterateur=chListReservations.iterator();
        while(iterateur.hasNext()){
            Reservation reserv=iterateur.next();
            if(reserv.compareTo(parReservation)==0){
                throw new ExceptionPlanning(2);
            }
        }
        chListReservations.add(parReservation);
        chSetReservations.add(parReservation);
        chTreeMap.add(parReservation);
    }

    public TreeSet <Reservation> getReservations(DateCalendrier parDate){
        TreeSet<Reservation> trs= new TreeSet<Reservation>();
        Iterator<Reservation>ite=chSetReservations.iterator();
        while(ite.hasNext()){
            Reservation res = ite.next();
            
            if(res.getDate()==parDate){
                trs.add(res);
            }

            if(chSetReservations.isEmpty()){
                return null;
            }

            
        }
        return trs;
        
    }

    public TreeSet<Reservation> getReservations(String parString){
        TreeSet<Reservation> tst=new TreeSet<Reservation>();
        Iterator<Reservation> itr=chSetReservations.iterator();
        while(itr.hasNext()){
            Reservation reser= itr.next();
            if(reser.getIntitule()==parString){
                tst.add(reser);

            }

        }
        return tst;
    }


    

   
}
