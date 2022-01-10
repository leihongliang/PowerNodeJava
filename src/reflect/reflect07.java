package reflect;

import reflect.Student;

import java.io.File;
import java.lang.reflect.Field;

public class reflect07 {
    public static void main(String[] args) {

        /*
        Student s = new Student();
        s.no = 111;
         */

        try {
            // 使用反射机制访问一个对象的属性
            Class studentClass = Class.forName("reflect.Student");
            Object obj =  studentClass.newInstance();

            // 获取no属性，根据属性的名称获取Field
            Field noField = studentClass.getDeclaredField("no");
            System.out.println(noField.getName()); // no
            noField.set(obj,111);
            System.out.println(noField.get(obj));// 111

            // 访问私有属性
            Field nameField = studentClass.getDeclaredField("name");
            // 打破封装
            nameField.setAccessible(true);
            System.out.println(nameField.getName()); // name
            nameField.set(obj,"leihongliang");
            System.out.println(nameField.get(obj));// leihongliang


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
