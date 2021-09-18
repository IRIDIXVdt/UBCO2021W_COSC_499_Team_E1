import java.util.ArrayList;
import java.util.Collections;

public class Feature {
    public static int arraySum(ArrayList<Integer> input){
        //your code here
        return 0;
    }
    public static int arrayProduct(ArrayList<Integer> input){
        //your code here
        return 0;
    }

    public static ArrayList<Integer> intArraySortDesc(ArrayList<Integer> input){
        for (int i = 0; i < input.size()-1; i++) {  
            for (int j = i+1; j < input.size(); j++) {
                if(input.get(i)<input.get(j)){                  
                    Collections.swap(input, i, j);
                }
            }
        }
        return input;
    }

    public static ArrayList<String> stringArraySortAsc(ArrayList<String> input){
        //your code here
        return null;
    }
}
