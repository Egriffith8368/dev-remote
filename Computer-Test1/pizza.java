
/**
 * Write a description of class pizza here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class pizza
{
    private String type;
    private int size;
    private double price;
    
    //constructor
    public pizza(String _type, int _size, double _price){
        type=_type;
        size=_size;
        price=_price;
        
    }
    public String toString(){
        return "a "+type+" pizza that is  "+size+" inches and costs "+price+" dollars";
    }
}
