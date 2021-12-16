package C_array;

import java.util.Arrays;

/*
    选择排序
 */
public class Arraystest2 {
    public static void main(String[] args) {
        int[] arr = {9,8,10,7,6,0,11};
        for (int i=0; i<arr.length-1; i++){
            int min= i;//默认最左边的为最小值
            for (int j=i+1;j<arr.length-1; j++){
                if (arr[j]<arr[min]){//判断最左边的是否为最小值
                   min = j;
                }
            }
            if (min !=i){//不是则交换
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
                System.out.println(Arrays.toString(arr));
            }
        }
    }
}
