package array;
/*
    数组和方法
 */
public class ArrayTest03 {
    public static void main(String[] args) {
        int[] a1 = {1,2,3};
        String[] a2 ={"a","b","c"};
        printArray(a1);
        printArray(a2);
        printArray(new int[]{1,2,3});
    }

    public static void printArray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
    public static void printArray(String[] array){
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }
}
