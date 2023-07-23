package Operator;

public class UnaryOperator {
    public static void main(String[] args) {
        int number= 100, number2=50;
        int result=number-number2;

        System.out.println(result); //50
        System.out.println(result++);//50
        System.out.println(++result);//52
        System.out.println(result++);//52
        System.out.println(result--);//53
        System.out.println(result);//52
        System.out.println(--result);//51
    }
}
