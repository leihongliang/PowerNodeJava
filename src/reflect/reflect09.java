package reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class reflect09 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class userServiceClass = Class.forName("reflect.UserService");
        Method[] methods = userServiceClass.getDeclaredMethods();
        System.out.println(methods.length);
        for (Method method : methods){
            System.out.println(method.getName() // 方法名
                    +" | " + method.getReturnType().getSimpleName() // 返回值类型
                    +" | " + Modifier.toString(method.getModifiers())); // 方法的修饰符列表

            Class[] parameterTypes = method.getParameterTypes();
            for (Class parameterType : parameterTypes){
                System.out.println(parameterType.getSimpleName());// 参数类型
            }
        }
    }


}

class UserService {
    public boolean login(String name, String password) {
        if ("admin".equals(name) && "123".equals(password)) {
            return true;
        }
        return false;
    }
    public void logout() {
        System.out.println("Exit system!");
    }
}