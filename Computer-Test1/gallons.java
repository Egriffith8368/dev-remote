
/**
 * Write a description of class gallons here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class gallons
{
    private double lengnth;
    private double width;
    private double volume;
    private double time;
    private double gal1;
    private double gal2;
    
    
    public gallons(double _legnth, double _width){
        lengnth=_legnth;
        width=_width;
    }
    
    public void volu(){
        volume=lengnth * width;
        
    
    
    
    
}

    public void gal(){
        gal1=volume/12;
        gal2=gal1*231;
    }
public void time(){
    time=gal2/9;
}
    public String toString(){
        return("You will need " +gal2+ " to fill the pool. It will take you " +time+" Hours to fill the pool");
    }
}