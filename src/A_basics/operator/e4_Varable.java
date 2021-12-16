package A_basics.operator;/*
变量
1 内存中间的一块空间
2 数据类型，名称，字面值（数值）
3 声明再赋值，必须有赋值过程
数据类型
1 不同的数据类型底层会分配不同大小的空间
2 数据类型的作用是指导系统在内存中为其开辟多大的空间
 */

public class e4_Varable {

    public static void main(String[] args) {
        int i = 100;//局部变量
        System.out.println(i);
        int b=2,c=3;//必须一个一个赋值
//        int k = 9;
        System.out.println(k);
        for(int a=0; a<10; a++){
        }

//        System.out.println(com.lhl.base.a);//错误。a在上一个内存里已经被释放内存了
    }

    static int k = 10;//成员变量

    public static void doSome (){
//        System.out.println(i); //错误
    }
}
/*
int i 出了大括号就不行
static int k 就还可以

变量就近原则 优先局部变量 其次成员变量（static位置随意都行）
 */
