public class superMarket {
    private double cost;
    private double cou;
    private double stTax;
    private double ciTax;
    private double _stTax;
    private double _ciTax;
    private double total;


    public superMarket(double _cost){
        cost=_cost;


    }

    public void calc(){
        if (cost<10){
            
            System.out.println("No Coupon");

        
        }
        else if (cost>9 && cost<=60){
            cou= cost*.8;
            
        }
        else if (cost>60 && cost<151){
            cou= cost*.10;
            
        }
        else if (cost>150 && cost<=210){
            cou= cost*.12;
        }
        else if (cost>210){
            cou=cost*.14;
        }
        else{

        System.out.println("ERROR: Could not calculate coupon amount");
        }


    }




    public String toString(){
        total=cost-cou;
        _stTax=2.9/cost;
        _ciTax=6.4/cost;
        stTax=_stTax*100;
        ciTax=_ciTax*100;
        total=total+stTax+ciTax;
        return("Your total cost is "+ total);
    }
}
