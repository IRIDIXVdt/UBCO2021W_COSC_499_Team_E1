import java.util.ArrayList;

public class Main{
    public static void main(String args[]){
        ArrayList<String> testStringArray = new ArrayList<String>();
        ArrayList<Integer> testIntArray = new ArrayList<Integer>();
        // we intitalize the array lists down here

        //--------------------------------------
        System.out.println(Feature.arraySum(testIntArray));
        System.out.println(Feature.arrayProduct(testIntArray));
        System.out.println(Feature.intArraySortDesc(testIntArray));
        System.out.println(Feature.stringArraySortAsc(testStringArray));
    }
    
}