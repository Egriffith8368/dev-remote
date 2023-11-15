public class returnc {
    
    private int at;
    private int hits;
    private double bat;
    private int hour;
    private int over;
    private int total;
    private double wage;






    public returnc (int _at, int _hits, int _hour, int _over, double _wage){
        at=_at;
        hits=_hits;
        hour=_hour;
        over=_over;
        wage=_wage;

    }

    public void batter(){
        bat = hits/at;
        System.out.println(bat);
    }



    public void pay(double temp_){
    total= (int) (wage*hour);
    temp_= wage* 1.5;
    temp_= temp_*over;
    total= (int) (total+ temp_);

    }

    



}
