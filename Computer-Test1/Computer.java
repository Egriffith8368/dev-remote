
/**
 * Write a description of class Computer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Computer
{
   //instance variable
    
   private String os;
   private String make;
   private double os_ver;
   
   //constructor
   
public Computer(String _os, String _make, double _os_ver){
    os=_os;
    make=_make;
    os_ver=_os_ver;
    
    
    
    }
    public String toString(){
        return "Your computer software is "+os+" Your computer hardware is "+make+" and your software version is "+os_ver;
    }
}
