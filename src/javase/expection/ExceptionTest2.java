package javase.expection;

public class ExceptionTest2 {
//    方法一
//    public static void main(String[] args) throws ClassNotFoundException{
//        doSome();
//    }

    //方法二
    public static void main(String[] args) {
        try {
            doSome();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void doSome() throws ClassNotFoundException{
        System.out.println("wrong!!!");
    }
}
