

public class Test_3
{
    public static void main(String [] args){    
        int age = 15;
        
        if (age>12 && age<20){
            System.out.println("You are a teen");
        }
        else{
            System.out.println ("You are not a teen");
        }
        String name = "Elijah";
        if (name.equals("Elijah") || name.equals("elijah")){
            System.out.println("Matching");
        }    
        else {
            System.out.println("Not Matching");
        }
        age = 21;
        boolean license= true;

        if (age>20 && license==true){
            System.out.println("You can drive a semi");
        }
        else{
            System.out.println("You cant drive a semi");
        }

    }
}