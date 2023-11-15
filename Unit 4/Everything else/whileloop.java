
// Scanenr Import
import java.util.Scanner;
public class whileloop {
   public static void main (String args[] ){
    //Condition
    boolean play = true;
    Scanner input=new Scanner(System.in);
    while(play){
        System.out.println("Hello, world");
        System.out.println("Do you want to repeat?:");
        String y=input.nextLine();
        if (y.equals("no")){
            play=false;
        }
     }
        String stop="";
        while (!stop.equals("stop")){
            System.out.println("Do you want to repeat?:");
            stop=input.nextLine();
        }


   } 
}
