
/**
 * Write a description of class Age here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Age
{
    
    private int age ;
    
    
    
    public Age(int _age) {
        age=_age;
    }
    public void drive(){
       if (age>=16){
         System.out.println("You can drive");
           
       }
    }
    public String vote() {
        if (age>=18){
            return ("You can vote");
        }
        else{
            return ("You cant vote");
        }
    }
}
