package Basic;

public class ClassAndObject {
    int number= 10;
    String name="Blue";

    public ClassAndObject(){

    }

    public void createAnObject(){
        System.out.println(name+" is my favorite color");

    }

    public static void main(String[] args) {
        new ClassAndObject();
        ClassAndObject co= new ClassAndObject();
        co.name="Blue";
        co.createAnObject();
    }
}
