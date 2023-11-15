
/**
 * Write a description of class runner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

public class runner
{
    public static void main(String[] args){
        Computer Computer_run= new Computer("MacOS sonoma","MacMini",18.1);
        Computer Computer_run2= new Computer("MacOS Ventura","Mac studio",14.3);
        System.out.println(Computer_run);
        System.out.println(Computer_run2);
        rectangle rectangle_run= new rectangle(5.0,9.0);
        System.out.println("------------------------");
        System.out.println(rectangle_run);
        System.out.println("------------------------");
        student student_run= new student("Elijah","Griffith",10,0);
        System.out.println(student_run);
        pizza pizza_run= new pizza("Meat lovers",15,15.43);
        System.out.println(pizza_run);
    
        
    }
}
