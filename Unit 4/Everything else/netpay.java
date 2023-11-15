public class netpay {
    private double hours;
    private double pay;
    private double depen;
    private double gross;
    private double overpay;
    private double overtime;
    private double fed = 0.22;
    private double state = 0.04;
    private double Federal;
    private double StateTax;
    private double Netpay;
    private double fed1;
    private double fed2;
    private double fed3;
    private double fed4;
    private double Netpay1;
    private double taxtot;


    public netpay(double _hours, double _depen, double _pay){
        hours = _hours;
        pay = _pay;
        depen = _depen;
    }
    
    /**
     * 
     */
    public void GrossPay(){
        if (hours<=40){
            gross = pay * hours;
        }
        else{
            overtime = hours - 40;
            overtime = overtime * pay * 1.5;
            gross = pay * hours + overtime;
        }
    }

        public void net(){
            fed1=depen*24.32;
            fed2=gross-fed1;
            Federal=fed*fed2;
            StateTax=.04*gross;
            Netpay1=gross-Federal;
            Netpay=Netpay1-StateTax;
            taxtot=Federal+StateTax;

            


        }

    
        public void _RET_(){
            System.out.println("The Gross pay for this period was: "+gross);
            System.out.println("After taxes of: "+taxtot+" your net pay is: " +Netpay);
        }
    
    




    
}
