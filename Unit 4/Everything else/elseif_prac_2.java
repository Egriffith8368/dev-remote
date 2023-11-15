
/**
 * Write a description of class elseif_prac here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
    
public class elseif_prac
{
   public static void light(String color){

      if (color == "Red"){
        System.out.println("You must stop");
      }
      else if (color == "Yellow"){
        System.out.println("Slow");
      }
      else if (color == "Green"){
        System.out.println("Go");
      }
      else {
        System.out.println("Error: Light Color invalid");
      }
       
   }
    public String grade(int y){
        if (y == 4){
            System.out.println("A");
        }
        else if (y==3){
            System.out.println("B");
        }
        else if (y==2){
            System.out.println("C");
        }
        else if (y==1){
            System.out.println("D");
        }
        else if (y==0){
            System.out.println("F");
        }
        else {
            System.out.println("Error: Non possible grade- Grades possible are 0-4");
        }
      
        
        return "test";
    }
    public static void chicken(int z){
       if (z<103 && z>98){
        System.out.println("Status: OK");

       }
       else if (z>102){
        System.out.println("Status: WARNING- TEMPETURE IS TO HOT");
       } 
       else if (z<99){
        System.out.println("Status: WARNING- TEMPETURE IS TO COLD");
       }

        
    }
    public String food(String order){
        System.out.println("Any Food restrictions?:");
    if (order=="lactose intolerant"){
        System.out.println("No chesse");
    }
    else if (order=="vegetarian"){
        System.out.println("Veggie burger");

    }
    else if (order=="none"){
        System.out.println("No alterations");
    }
    else{
        System.out.println("ERROR: DIATARY RESTRICTION NOT POSSIBLE");
    }

        
        
        
       return "test"; 
    }
    public static void main(String args[]){
        // Creates an object called run
        elseif run=new elseif();
        // Calls the methods and inputs values
        run.light("Red");
        run.light("Green");
        run.light("Blue");
        System.out.println(run.grade(4));
        System.out.println(run.grade(0));
        System.out.println(run.grade(2));
        run.chicken(103);
        run.chicken(98);
        run.chicken(50);
        System.out.println(run.food("lactose intolerant"));
        System.out.println(run.food("vegetarian"));
    
   }
}    


