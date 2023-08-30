package Arrays_and_Arraylists;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1,2,8,5,2,15};
        System.out.println(Maxvalue(arr));
        System.out.println(Maxinrange(arr,1,3));
    }
    static int Maxvalue(int[] arr){
        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>maxValue){
                maxValue=arr[i];
            }
        }
        return maxValue;
    }

    static int Maxinrange(int[] arr,int start,int end){
        int maxValue = arr[start];
        for (int i = start; i < end; i++) {
            if(arr[i]>maxValue){
                maxValue=arr[i];
            }
        }
        return maxValue;
    }


}
