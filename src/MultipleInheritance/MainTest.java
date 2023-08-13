package MultipleInheritance;

public class MainTest {
    public static void main(String[] args) {
        Samsung samsung= new Samsung();
        samsung.phoneBrand= "Samsung";
        samsung.phoneType= "Cellphone";
        samsung.price= 150000;
        samsung.operatingSystem= "Android";
        samsung.batteryLife();
        samsung.printDetails();
    }
}
