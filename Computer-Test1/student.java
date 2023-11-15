
/**
 * Write a description of class student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class student
{
    private String name;
    private String l_name;
    private int grade;
    private int clubs;
    
    
    // constructor
    
    public student(String _name_, String _lname_, int _grade_, int _clubs_){
        name=_name_;
        l_name=_lname_;
        grade=_grade_;
        clubs=_clubs_;
    
        
        
        
    
    }
    public String toString(){
        return name+" "+l_name+" is in "+grade+" grade and is in "+clubs+" club(s)";
    }

}

