package javase.number;

import java.util.Arrays;
import java.util.Random;

public class RandomTest1 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Random random = new Random();
        //产生一个int范围内（0-100）的随机数,不包括101
        int i=0;

        while (i< arr.length){
            int num = random.nextInt(6);
            int flag=1;
            for (int j=0;j<=i;j++){
                if (num == arr[j]){
                    flag = 0;
                }
            }
            if (flag==1){
                arr[i] = num;
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
