package C_array;

public class ArrayTest01 {
    public static void main(String[] args) {
        //静态初始化
        int[] a1 = {1,2,3};
        System.out.println(a1.length);
        //取数组
        System.out.println("first:"+a1[0]+"last:"+a1[a1.length-1]);
        //改
        a1[0] =3;
        a1[a1.length-1]=1;
        System.out.println("first:"+a1[0]+"last:"+a1[a1.length-1]);
        //遍历
        for(int i=0;i<a1.length;i++){
            System.out.println(a1[i]);
        }
    }
}
