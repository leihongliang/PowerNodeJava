public class ThisTest {
    static int num = 10;//类变量
    int num2 = 20;//实例变量

    public static void main(String[] args){
        System.out.println(num);
//        System.out.println(this.num2);//无法访问
        ThisTest thisTest = new ThisTest();//通过对象访问
        System.out.println(thisTest.num2);
    }
}
