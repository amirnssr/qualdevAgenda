import java.util.Arrays;
public class ClientDateCalendrier {
    public static void main (String [] args){
        DateCalendrier dateCalendrier0=new DateCalendrier();

        System.out.println(dateCalendrier0.dateDuLendemain());
       // System.out.println(dateCalendrier0.dateDuLendemain().getClass().getSimpleName());
        System.out.println(dateCalendrier0.toString());

        System.out.println(dateCalendrier0.dateDeLaVeille());
        DateCalendrier[]tab1={new DateCalendrier(2,5,2024),new DateCalendrier(1,5,2024)};
        
        Arrays.sort(tab1);
        for (int i=0;i<tab1.length;i++){
            System.out.println(tab1[i]);
        }
    }

}
