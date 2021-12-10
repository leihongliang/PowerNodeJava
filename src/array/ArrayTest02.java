package array;

public class ArrayTest02 {
    public static void main(String[] args) {
        //动态初始化
        int[] a = new int[3];
        for (int i=0; i<a.length; i++){
            System.out.println(a[i]);
        }
        Object[] objs = new Object[3];
        for (int i=0; i<objs.length; i++){
            System.out.println(objs[i]);
        }
        //静态初始化
        String[] str2 = {"a","b","c"};
        for (int i=0; i<str2.length; i++){
            System.out.println(str2[i]);
        }
    }
}
