

public class forlooppractice
{

    private int x;
    private int p;
    

    public void multipleten(int num){
        
        for (x=0; x<=num ;x++){
            p=p+10;
            System.out.println(p);

        }
        
        
    }
    public void table(int one, int two){
        
        
        
    }
    public void wordtriangle(String word){
        // method that creates word triangle
        
        
    }
    public void repeatword(String repeat){
        // method that repeats a word based on it's length
        
        
    }
    public static void main (String[] args ){
        forlooppractice run=new forlooppractice();
        run.multipleten(3);
        run.multipleten(10);
        run.multipleten(20);
        run.table(5,5);
        run.table(4,3);
        run.wordtriangle("hippo");
        run.wordtriangle("maverick");
        run.repeatword("chicken");
        run.repeatword("computer science");
        
    }
}
