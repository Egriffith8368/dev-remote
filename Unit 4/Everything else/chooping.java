public class chooping {

    public static void main(String arg[]){
    int num=67845;

        System.out.println(num%10);
        System.out.println(num/10);

        int count= 0
        int total=0
        while (num>0){
            System.out.println(num%10);
            num=num/10;
            count++;
        }
        System.out.println(count);
        double avg=(double)total/count;
        System.out.println("Average of numbers"+ avg);

    }
    
}
