
/**
 * Write a description of class split_bill here.
 *
 * @egriffith 
 * @version (a version number or a date)
 */
public class split_bill
{
    private double tip;
    private double bill;
    private int people;
    private double split_1;
    private double split_2;
    
    
    
    
    public split_bill(double _bill, int _people){
        bill=_bill;
        people = _people;
        
        
    }
      public void tip_calc(){
          tip= bill*.20;
          
            
        }
    public void split_calc(){
        split_1= bill+tip;
        split_2=split_1/people;
    }
    public void results(){
        System.out.println("The total cost of the meal would be "+bill+" The cost of the tip would be "+tip+ " the final total would be "+split_1+" So everyone would pay "+split_2);
    }

    }







