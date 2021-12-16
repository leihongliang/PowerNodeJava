package B_OOP.e24_Object;

//匿名内部类
public class objecttest07 {
    public static void main(String[] args) {
        //法一：不用匿名内部类，需要new一个类去实现这个接口
        Mymath2 mm1 = new Mymath2();
        mm1.mySum(new ComuteImpl(),1,1);

        //法二：不需要有new一个类，new了一个没有名字的类
        Mymath2 mm2 = new Mymath2();
        mm2.mySum(new Compute() {//
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        }, 2, 2);
    }
}

//不用匿名内部类
class ComuteImpl implements Compute{
    public int sum(int a,int b){
        return a+b;
    }
}

interface Compute {
    int sum(int a,int b);
}
class Mymath2{
    public void mySum(Compute c,int x,int y){//不要把接口特殊化
        int retValue = c.sum(x, y);
        System.out.println(x+"+"+y+"="+retValue);
    }
}