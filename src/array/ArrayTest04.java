package array;

public class ArrayTest04 {
    public static void main(String[] args) {
        if (args.length !=2){
            System.out.println("getout!");
            return;
        }
        String username = args[0];
        String password = args[1];
//        if (username.equals("lhl")&&password.equals("123"))
        //可以避免空指针异常
        if ("lhl".equals(username)&&"123".equals(password)){
            System.out.println("welcome!!");
        }
        else {
            System.out.println("not you!!");
        }
    }
}
