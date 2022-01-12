package reflect;

public class reflect12 {
    public static void main(String[] args) throws Exception {
        Class stringClass = Class.forName("java.lang.String");
        // 获取父类
        System.out.println(stringClass.getSuperclass().getName());

        // 获取接口
        Class[] interfaces = stringClass.getInterfaces();
        for (Class in : interfaces){
            System.out.println(in.getName());
        }

    }
}
