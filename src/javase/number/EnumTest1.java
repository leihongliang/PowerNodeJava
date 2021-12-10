package javase.number;
//枚举类
public class EnumTest1 {
    public static void main(String[] args) {
        Result reValue = divide(10,2);
        System.out.println(reValue ==Result.SUCCESS ?"success!!!":"fail!!!");
    }
    public static Result divide(int a,int b){
        try {
            //程序到此处没有出现异常
            int c= a/b;//b有几率会为0
            return Result.SUCCESS;
        }catch (Exception e){
            //程序到此处出现异常
            return Result.FAIL;
        }
    }
    enum Result{
        SUCCESS,FAIL
    }
}
