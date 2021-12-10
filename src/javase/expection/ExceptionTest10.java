package javase.expection;
/*
自定义异常
 */
public class ExceptionTest10{
    public static void main(String[] args) {
        //new异常对象，没有抛出
        MyException e = new MyException("empty???");
        e.printStackTrace();

        String msg = e.getMessage();
        System.out.println(msg);
    }

}

class MyException extends Exception{
    public MyException(){
    }
    public MyException(String s){
        super(s);
    }
}