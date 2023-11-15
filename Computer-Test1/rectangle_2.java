
/**
 * Write a description of class rectangle_2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class rectangle_2
{
    private double lengh;
    private double width;
    private double area;
    private double p1;
    private double p2;
    private double p;
    public rectangle_2(double _lengh, double _width){
        lengh=_lengh;
        width=_width;
    }
    
    public void are(){
        area=lengh*width;
        System.out.println("area is "+area);
    }
    public void per(){
        p1= 2*lengh;
        p2= 2*width;
        p= p1+p2;
        System.out.println("Perimiter is "+p);
    }




}
