
/**
 * Write a description of class addNumbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class addNumbers
{
    private int num1;
    private int num2;
    private int sum;
    
    
    public addNumbers(int _num1, int _num2){
        num1=_num1;
        num2=_num2;
    }
    public void add(){
        sum=num1+num2;
        System.out.println(sum);
    }
    public void avg(){
        double average=(double)sum/2; 
    }
}
