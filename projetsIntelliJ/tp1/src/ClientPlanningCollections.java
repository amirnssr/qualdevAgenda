
import java.util.InputMismatchException;
import java.util.NoSuchElementException;


public class ClientPlanningCollections {
    public static void main (String[]args){
        PlanningCollections planning= new PlanningCollections();
        
       
        try{

            
            Date date1=new Date(10, 03, 2024);
            Horaire hd=new Horaire(17, 0);
            Horaire hf=new Horaire(18, 0);
            PlageHoraire plg=new PlageHoraire(hd, hf);
            Reservation res=new Reservation(date1, plg, "course");
            planning.ajout(res);

        }

        catch(ExceptionPlanning e){
            System.out.println("Code erreur : "+ e.getCodeErreur());
        }
        catch(InputMismatchException e){
            System.out.println("1-entier attendu");
        }
        catch(NoSuchElementException e){
            System.out.println("2-le scanner est épuisé");

        }
        catch(IllegalStateException e){
            System.out.println("3-"+ e.getMessage());

        }
       
       

       

        System.out.println(planning.toString());
    }

}
