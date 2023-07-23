package asignment3;

public class NestedIfStatement {
    public static void main(String[] args) {
        int passCharacter = 6;

        if(passCharacter>=8){
            if (passCharacter<=32){
                System.out.println("Valid Password");
            }

            }
        else {
            System.out.println("Invalid Password");
        }
    }
}
