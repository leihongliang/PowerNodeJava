package javase.expection;

public class ExceptionTest5 {
    public static void main(String[] args) {
        NullPointerException e  = new NullPointerException("worng");
        String msg = e.getMessage();
        System.out.println(msg);
        //java后台打印异常堆栈追踪信息的时候，采用异步线程的方式
        e.printStackTrace();
        System.out.println("hello");
    }
}
