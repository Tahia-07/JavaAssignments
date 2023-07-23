package asignment3;

public class IfElseIfLadder {
    public static void main(String[] args) {
        int marks= 93;
        if (marks>=0 && marks<=59){
            System.out.println("Failed");
        }
        else if (marks>=60 && marks<=66) {
            System.out.println("D");
        }
        else if (marks>=67 && marks<=69) {
            System.out.println("D+");
        }
        else if (marks>=70 && marks<=72) {
            System.out.println("C-");

        }
        else if (marks>=73 && marks<=76) {
            System.out.println("C");
        }
            else if (marks>=77 && marks<=79) {
                System.out.println("C+");

            }
        else if (marks>=80 && marks<=82) {
            System.out.println("B-");

        }
        else if (marks>=83 && marks<=86) {
            System.out.println("B");

        }
        else if (marks>=87 && marks<=89) {
            System.out.println("B+");

        }
        else if (marks>=90 && marks<=92) {
            System.out.println("A-");

        }
        else if (marks>=93 && marks<=100) {
            System.out.println("A");

        }


    }
}
