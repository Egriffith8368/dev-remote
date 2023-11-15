
/**
 * Write a description of class ifelse here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ifelse
{
    public void worldrecord(int time){
       
    if (time<=223) {
        System.out.println("You broke the world record");
    }
    else {
        System.out.println("Sadly you did not break the world record");
        }    
    }
    public void posneg(int number){
    
        if(number>0){
            System.out.println("Positive");
        }
        if (number<0){
            System.out.println("Negative");
        }
        else {
            System.out.println("This number is neither");
        }
    
    }
    
    public void fraction(int num, int denum){
        if(denum==0){
            System.out.println("(Error- Number is not divisable)");
        }
        else {
            System.out.println("Decimel:"+(double)num/denum);
        }
    
    }
    public void newton(double mass){
        
        
        
 
    
    }   
    public static void main (String args[])
    {
        ifelse run=new ifelse();
        run.worldrecord(335);
        run.worldrecord(219);
        run.posneg(7);
        run.posneg(-3);
        run.fraction(10,0);
        run.fraction(12,15);
        run.newton(225);
        run.newton(33345);
        
        }
} 