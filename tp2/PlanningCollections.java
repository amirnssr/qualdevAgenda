import java.util.ArrayList;
import java.util.TreeSet;
public class PlanningCollections {
    public ArrayList<Reservation> chStockResArrayList;
    public TreeSet<Reservation> chStockResTreeSet;


    public PlanningCollections(ArrayList<Reservation> parArrayList,TreeSet<Reservation> parTreeset){
        chStockResArrayList=parArrayList;
        chStockResTreeSet=parTreeset;
    }

   

    public String toString(){
        return "taille array list:  "+chStockResArrayList.size()+" "+chStockResArrayList.toString()+","+"taille treeset:"+chStockResTreeSet.size()+" "+chStockResTreeSet.toString();
    }

    
}
