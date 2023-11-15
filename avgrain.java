
import java.util.Scanner;
public class avgrain {

    public static void main(String[] args){


    int years;
    int months;
    double inches;
    int average;
    int count;
    double var;
    Scanner input=new Scanner(System.in);
    Int years=input.nextLine();
    System.out.println("Input the amount of years you would like to input:");
    months=years*12;
count=0;
    while (count!=months){
        Int var=input.nextLine();
        System.out.println("Enter the amount of rainfall for the month:")
        inches=inches+var;
        count=count+1;
        
        
    }
    System.out.println("The total amount of rainfall was: "+inches+" inches and the average amount ofrain fall was: "+ inches/count+"inches. There were "+ months+ " months in this data period");










    


    }
    
}
