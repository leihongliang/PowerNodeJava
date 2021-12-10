package javase.collection;

public class ForEach01 {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        for (int i = 0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        //增强for循环，没有下标
        for (int i : arr){
            System.out.println(i);
        }
    }
}
