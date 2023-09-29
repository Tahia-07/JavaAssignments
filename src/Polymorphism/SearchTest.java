package Polymorphism;

public class SearchTest {
    public void normalSearch(){
        System.out.println("Search without any input");

    }

    public void normalSearch(String invalidInput){
        System.out.println("Search with invalid input"+ invalidInput );

    }

    public void normalSearch(String letter, int number){
        
        System.out.println("Search with input" + letter+ ""+ number);

    }

    public static void main(String[] args) {

        SearchTest st= new SearchTest();
        st.normalSearch();
        st.normalSearch(" invalidInput");
        st.normalSearch(" ABC", 123);
    }
}
