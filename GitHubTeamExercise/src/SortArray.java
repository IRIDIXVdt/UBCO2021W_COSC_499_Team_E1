public class SortArray {
    public static void main(String[] args) {
		
		int [] testIntArray = {3,4,1,2};
		
        int [] arr = sortIntArrayDesc(testIntArray);
        System.out.print("sort {3,4,1,2} Desc: ");
        for(int item:arr){
            System.out.print(item+" ");
        }
            

	}




    public static int[] sortIntArrayDesc(int[] arr){
        for (int i = 1; i < arr.length; i++) {
            for (int j = i;j > 0;j--){
                if (arr[j] <= arr[j-1]){
                    break;
                }else{
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }
       
        return arr;
    }
}
