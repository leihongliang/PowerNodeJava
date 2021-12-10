package array;
//数组扩容
public class ArrayTest06 {
    public static void main(String[] args) {
        int[] src = {1,2,3};
        int[] dest = new int[5];
        System.arraycopy(src,1,dest,3,2);
        for(int i=0; i<dest.length;i++){
            System.out.println(dest[i]);
        }
    }
}

