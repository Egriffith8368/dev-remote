public class r {
    private int num;


    public r(int _num){
        num=_num;
    }








    public void calc(){
    if (num==0){
        System.out.println("Green");
    }
    else if (num>0 && num<11){
        if (num%2==0){
            System.out.println("Black");
        }
        else{
        System.out.println("Red");
        }
    }
    else if (num>10 && num<19){
        if (num%2==0){
            System.out.println("Red");
        }
        else {

            System.out.println("Black");
        }

    }
    else if (num>18 && num<29){
        if(num%2==0){
            System.out.println("Black");
        }
        else {
            System.out.println("Red");
        }

    }
    else if (num>28 && num<37){
        if (num%2==0){
            System.out.println("Red");
        }
        else{
            System.out.println("Black");
        }
    }
    else{
        System.out.println("ERROR:POCKET IS NOT POSSIBLE- POSSIBLE POTS 0-36");
    }
    }
}

