package annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

/**
 * 被标注的类中必须有一个int类型的id属性，没有就报异常
 */
public class annotation03 {
    public static void main(String[] args) throws Exception {
        Class userClass = Class.forName("annotation.User");
        boolean isOK = false;
        if (userClass.isAnnotationPresent(id.class)){
            Field[] fields = userClass.getDeclaredFields();
            for (Field field : fields){
                if ("id".equals(field.getName()) && "int".equals(field.getType().getSimpleName())){
                    isOK = true;
                    break;
                }
            }
            if (!isOK) {
                throw new NoIdException("被@Id注解标注的类中必须有一个int类型的id属性");
            }
        }

    }
}
@id
class User{
//    int id;
    String name;
    String password;
}

/*
用来标注类，被标注的类中必须有一个int类型的id属性，没有就报异常
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface id {

}

class NoIdException extends RuntimeException{
    public NoIdException() {}
    public NoIdException(String s) {
        super(s);
    }
}