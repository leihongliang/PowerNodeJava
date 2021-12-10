package javase.number;

public class datetest2 {
    public static void main(String[] args) {
        //获取自从1970.1.1到当前时间的总毫秒数
        long nowTimeMillis = System.currentTimeMillis();
        System.out.println(nowTimeMillis);//1637324498004

        //返回以毫秒为单位的当前时间
        long begin = System.currentTimeMillis();
        print();
        long end = System.currentTimeMillis();
        System.out.println(end-begin);
    }
    public static void print(){
        for (int i=0; i<1000; i++){
            System.out.println("i="+i);
        }
    }
}
