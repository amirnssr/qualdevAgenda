package clients;

import classes.*;
import interfaces.ConstantesErreurs;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.NoSuchElementException;
import java.util.InputMismatchException;


public class ClientPlanning implements ConstantesErreurs {
    public static void main (String [ ]args){

    
            //scanner.close();
            Planning plg= new Planning(2);
            try {
                Scanner scanner = new Scanner (new File("data"+File.separator+"planning.txt")).useDelimiter(",");
                while(scanner.hasNext()){
                    String intitule =scanner.next();
                    int jour=scanner.nextInt();
                    int mois=scanner.nextInt();
                    int annee=scanner.nextInt();
                    int hdebut = scanner.nextInt();
                    int dmin=scanner.nextInt();
                    int hfin=scanner.nextInt();
                    int fmin=scanner.nextInt();
                    Horaire horaired= new Horaire(hdebut, dmin);
                    Horaire horairef=new Horaire(hfin, fmin);
                    Date dateseance=new Date(jour, mois, annee);
                    PlageHoraire pH= new PlageHoraire(horaired, horairef);
                    Reservation seance= new Reservation(dateseance, pH, intitule);
                    

                    plg.ajout(seance);
                }

                scanner.close();
            }
            catch(FileNotFoundException e){
                System.out.println("code d'erreur"+e);
            }

            catch(InputMismatchException e){
                System.out.println("code d'erreur"+ e);
            }

            catch(NoSuchElementException e){
                System.out.println("code d'erreur"+e);
            }
            catch(ExceptionPlanning e){
                System.out.println("code d erreur"+e);
            }
        System.out.println(plg);
        }
           
            
       

    
}
