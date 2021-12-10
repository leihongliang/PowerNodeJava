package javase.expection;

public class ExceptionTest8 {
    public static void main(String[] args) {
        try{
            System.out.println("try");
            return;
        }finally {
            System.out.println("finally ");
        }
    }
}
//try
//finally
//return