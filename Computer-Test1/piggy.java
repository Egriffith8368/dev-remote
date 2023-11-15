
public class piggy
{
    private int qua;
    private int dim;
    private int pen;
    private int nic;
    private double amount_q;
    private double amount_d;
    private double amount_p;
    private double amount_n;
    private double amount_f;
    
    
    
    
    
    public piggy(int _qua, int _dim, int _pen, int _nic){
        qua=_qua;
        dim=_dim;
        pen=_pen;
        nic=_nic;
    }
    public void qamount(){
        amount_q= qua*25;
    }
    public void damount(){
        amount_d= dim*10;
    }
    public void pamount(){
        amount_p= pen;
    }
    public void namount(){
        amount_n= nic*5;
    }
    public void Famount(){
        amount_f= amount_q+amount_d+amount_p+amount_p+amount_n;
    }
    public void ret(){
      System.out.println("Your piggy has" +amount_f+"cents");  
    }
}
    

