package A_basics.operator;

/*
tips
    1 ++ 和 = 的顺序？
    2 逻辑运算符的记忆
    3 短路与是什么意思？
    4 扩展类的赋值运算符不改变运算结果类型  com.lhl.base.operator1
    5
 */
public class e6_Calculation {
    public static void main(String[] args){
        int y = 10;
        ++ y;// 11
        System.out.println(y);
        int a = ++ y;//11 12
        int b = y ++;//12 13
        System.out.println(a);
        System.out.println(b);//先赋值，后加一
        System.out.println(y);

    }
}
/*
& 与 1 1= 1
| 或
! 非 取反
^ 异或 只要不一样，就是true

&& 短路与
|| 短路或

 */

class operator{
    public static void main(String[] args){
        int x = 10;
        int y = 8;
        System.out.println( false && ++x<y);// 短路现象，不用执行后面的了
        System.out.println(x);
    }
}

class operator1{
    public static void main(String[] args){
        byte x = 0;
        x += 128;
        //x = (byte)(x + 128)
        System.out.println(x);
    }
}

// 加法符号
class  operator2{
    public static void main(String[] args){
        int a=10;
        int b=20;
        System.out.println(a+"+"+b+"="+(a+b));

    }
}
//三元运算符
class operator3{
    public static void main(String[] args){
        boolean sex =  false;
        char c = sex ? 'a':'b';
        System.out.println(c);
    }
}