
/**
 * Write a description of class grade here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class grade
{
    private String course;
    private int totalscore, totalposs;
    
    
    
    public grade(String _course){
        course=_course;
    }
    
    public void addscores(int score,int poss){
        totalscore+=score;
        totalposs+=poss;
        
    }
    
    public void calcgrade(){
        double grade=(double)totalscore/totalposs;
        System.out.println(grade);
    }
}


    
    

