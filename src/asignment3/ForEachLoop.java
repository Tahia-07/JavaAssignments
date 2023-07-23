package asignment3;

public class ForEachLoop {

    public static void main(String[] args) {
        String []name= {"Tahia","Sadia","Labiba","Hasan","Hossain"};
        double []marks= {9.3,10,8,7.5,9};
        int []course={2,1,2,2,1};

        System.out.println("Name:");
        for (String str:name){
            System.out.println(str);

        }

        System.out.println("Score:");
        for (double db:marks){
            System.out.println(db);

        }

        System.out.println("Course:");
        for (int it:course){
            System.out.println(it);

        }
    }
}
