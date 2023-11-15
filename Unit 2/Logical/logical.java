public class logical {

    private double height;
    
    private int age;

    private String name;

    public logical(String _name, int _age, double _height){
        name=_name;
        age=_age;
        height=_height;
    }
    public String toString(){
        if (age>8 && height>41){
            return("Welcome Aboard " +name);
        }
        else if (age<9 && height<42){
            return("Sorry "+name+ " You need to be 9 or older and at least 42 inches tall");
        }
        else if (age<9){
            return("Sorry " +name+ " Come back once your 9");
        }
        else if (height<42){
            return("Sorry " +name+ " Come back once your 42 inches tall!");
        }
        else{
            return("Sorry you cant ride");
        }
    }

}
