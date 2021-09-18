import java.util.ArrayList;
import java.util.Random;

public class Main{
    public static void main(String args[]){
        ArrayList<String> testStringArray = new ArrayList<String>();
        ArrayList<Integer> testIntArray = new ArrayList<Integer>();
        // we intitalize the array lists down here
        int length = 10;
        for(int i = 0; i < 10; i++){
            testIntArray.add(Math.random()*100);
        }
        //--------------------------------------
        System.out.println("11111");
        System.out.println(Feature.arraySum(testIntArray));
        System.out.println(Feature.arrayProduct(testIntArray));
        System.out.println(Feature.intArraySortDesc(testIntArray));
        System.out.println(Feature.stringArraySortAsc(testStringArray));
    }
    
}