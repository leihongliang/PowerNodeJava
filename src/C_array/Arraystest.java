package C_array;
import java.util.Arrays;

/*
    冒泡排序
    9 8 10 7 6 0 11
    8 9 10 7 6 0 11
    8 9 10 7 6 0 11
    8 9 7 10 6 0 11
    8 9 7 6 10 0 11
    8 9 7 6 0 10 11
    8 9 7 6 0 10 11


    8 9 7 6 0 10
 */
public class Arraystest {
    public static void main(String[] args) {
        int[] arr = {9,8,10,7,6,0,11};
        for (int i=arr.length-1;i>0;i--){//需要进行length-1轮排序
            for (int j=0; j<i;j++ ){//需要进行length-i次排序
                if (arr[j]>arr[j+1]){//相邻两两比较
                    int temp = arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j] = temp;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
    }
}
