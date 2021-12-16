package C_array;
//二维数组
public class ArrayTest07 {
    public static void main(String[] args) {
        //静态初始化
        int[][] a={
                {1},
                {1,2},
                {1,2,3},
        };
        int[] a0 = a[2];
        int a00 = a0[0];
        System.out.println(a00);
        System.out.println(a[2][0]);
        //遍历二维数组
        for(int i=0; i<a.length;i++){
            for(int j=0; j<a[i].length;j++){
                System.out.println(a[i][j]);
            }
        }
        //动态初始化二维数组
        int [][] array= new int[3][4];
        for(int i=0; i<array.length;i++){
            for(int j=0; j<array[i].length;j++){
                System.out.println(a[i][j]);
            }
        }
    }
}
