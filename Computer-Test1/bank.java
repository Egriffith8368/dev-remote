
/**
 * Write a description of class bank here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class bank
{
    private String accowner;
    private double accamount;
    
    
    
    public bank(String _owner){
        accowner=_owner;
        accamount+=1000;
        
    }
    
    public void deposit(double dep){
        accamount+=dep;
    
    }
    public void withdraw(double draw){
        accamount-=draw;
    
    }
    public void balence(){
        System.out.println("Your account balence is " + accamount);
    
    }
}Voi

