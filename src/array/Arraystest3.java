package array;

public class Arraystest3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,87};
        int index = arraySearch(arr,8);
        System.out.println(index);
    }

    private static int arraySearch(int[] arr, int ele) {
        for (int i=0;i < arr.length; i++){
            if (ele == arr[i]){
                return i;
            }
        }
        return -1;
    }

    private static int binarySearch(int[] arr, int dest){
        int begin = 0;
        int end = arr.length-1;
        int mid = (begin + end)/2;
        while (begin <= end) {
            if (arr[mid] == dest) {
                return mid;
            } else if (arr[mid] < dest) {//目标在右边
                begin = mid + 1;
            } else if (arr[mid] > dest) {//目标在左边
                end = mid - 1;
            }
        }
        return -1;
    }


}
