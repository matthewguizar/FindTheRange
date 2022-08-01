

public class Main{
    public static void main(String[] args){
        int[] arr = new int[] {1,4,11,2,37,-4};

        System.out.println(findTheRange(arr));
    }

    public static String findTheRange(int [] arr){
        int smallest = arr[0];
        int biggest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > biggest){
                biggest = arr[i];
            }
            if (arr[i] < smallest){
                smallest = arr[i];
            }
        }
        return biggest + " " + smallest;
    }
}