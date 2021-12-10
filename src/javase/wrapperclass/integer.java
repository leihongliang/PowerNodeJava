package javase.wrapperclass;

public class integer {
    public static void main(String[] args) {
        //123是基本数组类型int，转换成了 引用数据类型Integer（装箱）
        //int --> Integer
        Integer i = new Integer(123);//Integer(int value)
        //将引用数据类型 转换成 基本数据类型（拆箱）
        float f = i.floatValue();
        System.out.println(f);

        //String --> Integer
        Integer x = new Integer("123");//Integer(String s)

        //String -->Double
        Double e = new Double(3.14);
        System.out.println(e);

        MyInt myInt = new MyInt(100);
        doSome(myInt);
        doSome(100);

    }
    public static void doSome(Object obj){
        System.out.println(obj.toString());
    }
    //这是一个包装类，把int类型的value包装成一个对象
    public static class MyInt{
        int value;
        public MyInt(){
        }
        public MyInt(int value){
            this.value = value;
        }
        public String toString (){
            return String.valueOf(value);
        }

    }
}
