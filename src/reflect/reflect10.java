package reflect;
import java.lang.reflect.Method;

public class reflect10 {
    public static void main(String[] args) throws Exception {
        UserService userService = new UserService();
        boolean loginSuccess = userService.login("admin","123");
        System.out.println(loginSuccess ? "success!" : "failed!" );

        Class userServiceClass = Class.forName("reflect.UserService");
        Object obj = userServiceClass.newInstance();
        // 获取方法
        Method loginMethod = userServiceClass.getDeclaredMethod("login", String.class, String.class);
        // 调用方法，传递参数
        Object retValue = loginMethod.invoke(obj,"admin","123");
        System.out.println(retValue);
    }
}
