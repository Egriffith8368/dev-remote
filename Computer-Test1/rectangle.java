
/**
 * Write a description of class rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class rectangle
{
    //Instance variables
    
    private double height;
    private double width;
    
    
    // Constructre
    public rectangle(double _height_,double _width_){
        height=_height_;
        width=_width_;
    }

    public String toString(){
        return "A Rectangle with a height of "+height+" and a width of "+width;
    }
}
