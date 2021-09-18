import java.util.ArrayList;

public class Main{
    public static void main(String args[]){
        ArrayList<String> testStringArray = new ArrayList<String>();
        ArrayList<Integer> testIntArray = new ArrayList<Integer>();
        // we intitalize the array lists down here

        // Initializ the int array
        int length = 10;
        for(int i = 0; i < length; i++){
            testIntArray.add((int)(Math.random()*100));
        }

        // sysout the int array
        System.out.print("Test Int Array: ");
        for(int item : testIntArray){
            System.out.print(item+" ");
        }
        //--------------------------------------


        System.out.println("\nFeature 1 intArraySortDesc: "+Feature.intArraySortDesc(testIntArray));     
        System.out.println(Feature.stringArraySortAsc(testStringArray));        
        System.out.println(Feature.arraySum(testIntArray));
        System.out.println(Feature.arrayProduct(testIntArray));        

    }
    
}