import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.NoSuchElementException;
import java.util.InputMismatchException;


public class ClientPlanning implements ConstantesErreurs{
    public static void main (String [ ]args){
        Planning planningSalleSport= new Planning(4);
        try{
            File fic=new File("data"+File.separator+"planning.txt");
            Scanner scanner=new Scanner(fic).useDelimiter(",");
            Reservation res;
            while(scanner.hasNext()){
                String intitule = scanner.next();

                Date date= new Date(scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
                Horaire heureD=new Horaire(scanner.nextInt(),scanner.nextInt());
                Horaire heureF=new Horaire(scanner.nextInt(),scanner.nextInt());
                System.out.println(intitule + "d" + date +"h" + heureD + "hf" + heureF);
                res = new Reservation(date,new PlageHoraire(heureD, heureF), intitule);
                planningSalleSport.ajout(res);
            
            }
            scanner.close();
            
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
       
       catch(FileNotFoundException e){
          System.out.println(e.getMessage());
        }
        planningSalleSport.toString();
    }
}
