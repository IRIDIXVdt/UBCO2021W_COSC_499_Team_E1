import java.util.ArrayList;
import java.util.Random;
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
        
        // Initializ the String array
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"; 
        int stringLength;    
        for(int i = 0; i < length; i++){

            StringBuffer sb=new StringBuffer();
            stringLength = (int)(int)(Math.random()*10+1);
            for(int j=0; j < stringLength; j++){
                int number=(int)(Math.random()*40);
                sb.append(str.charAt(number));
            }

    
            String string = new String(sb);
            testStringArray.add(string);
        }

        System.out.print("\nTest String Array: ");
        for(String item : testStringArray){
            System.out.print(item+" ");
        }
        
        //--------------------------------------

        System.out.println("\nFeature 1 intArraySortDesc: "+Feature.intArraySortDesc(testIntArray));     
        System.out.println("\nFeature 2 stringArraySortAsc: "+Feature.stringArraySortAsc(testStringArray));  
        System.out.println("\nFeature 3 arrayProduct: "+Feature.arrayProduct(testIntArray));       
        System.out.println("\nFeature 4 arraySum: "+Feature.arraySum(testIntArray));
               

    }
    
}