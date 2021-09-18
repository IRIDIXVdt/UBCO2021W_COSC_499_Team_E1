import java.util.ArrayList;

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
        for(int i = 1; i < input.size(); i++){
            for(int j = i; j > 0; j--){
                if(input.get(j) <= input.get(j-1)){
                    break;
                }
                else{
                    int temp = input.get(j);
                    input.add(j, input.get(j-1));
                    input.add(j-1, temp);
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
