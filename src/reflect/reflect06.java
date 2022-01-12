package reflect;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 反射属性Field
 */
public class reflect06 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class studentClass = Class.forName("reflect.Student");
        System.out.println(studentClass.getSimpleName());// Student

        Field[] fields = studentClass.getFields();
        System.out.println(fields.length);
        Field f = fields[0];// 1
        System.out.println(f.getName()); // no

        Field[] fields2 = studentClass.getDeclaredFields();
        System.out.println(fields2.length);// 4
        for (Field field : fields2 ){
            // 属性类型 和 属性名
            int i = field.getModifiers();
            System.out.println(i);
            String modifierString = Modifier.toString(i);
            System.out.println(modifierString // 返回修饰符
                    +" | " + field.getType() // 返回类型
                    +" | " + field.getType().getSimpleName() // 返回类型名称
                    + " | " + field.getName()); // 返回字段名称
        }
    }
}
class Student{
    public static int no; // Field 对象
    String name;
    protected int age;
    boolean sex;
}