import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Feature {
    public static int arraySum(ArrayList<Integer> input){
        int arrsum = 0;
        for(int total: input){
            arrsum = total + arrsum;
        }
        return arrsum;
    }

    public static long arrayProduct(ArrayList<Integer> input){
        long product =1;
        for(int i = 0; i <input.size();i++){
            product = product * input.get(i);
        }
        return product;
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
        try{
            ArrayList<String> sortT = (ArrayList<String>)input.clone();
            sortT.sort(Comparator.naturalOrder());
            return sortT;
        }catch(Exception e){
            return null;
        }
        
    }
}
