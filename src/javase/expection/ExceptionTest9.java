package javase.expection;
/*
一个面试题
 */
public class ExceptionTest9 {
    public static void main(String[] args) {
        System.out.println(m());
    }

    private static int m() {
        int i = 100;
        try {
            return i;//此行代码出现
        }finally {
            i++;
        }
    }
}
//100