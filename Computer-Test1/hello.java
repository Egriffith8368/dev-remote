
/**
 * Write a description of class hello here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class hello
{
    private String name;
    
    
    
    public hello(String _name){
        name=_name;
    }
    public void english(){
        System.out.println("Hello, " +name+"!");
    }
    public void spanish(){
        System.out.println("Hola, " +name+"!");
    }
    public void french(){
        System.out.println("Bonjour, " +name+"!");
    }
}
