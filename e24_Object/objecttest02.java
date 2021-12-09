public class objecttest02 {
    public static void main(String[] args) {
        int a = 100;
        int b = 100;
        Mytime2 t1 = new Mytime2(2008,8,8);
        Mytime2 t2 = new Mytime2(2008,8,8);
        System.out.println(t1 == t2);//false
        System.out.println(a == b);//true
        System.out.println(t1.equals(t2));//false
        System.out.println(t1.equals1(t2));//true

    }
}
class Mytime2{
    int year;
    int month;
    int day;
    public Mytime2(){
    }
    public Mytime2(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }
    //第一版
    /*
    public boolean equals1(Object obj){
        int year1 = this.year;
        int month1 = this.month;
        int day1 = this.day;

//        int year2 = obj.year;
//        int month2 = obj.month;
//        int day2 =obj.day;

        if(obj instanceof Mytime2){
            Mytime2 t =(Mytime2) obj;
            int year2 = t.year;
            int month2 = t.month;
            int day2 = t.day;
            if (year1 == year2 && month1== month2 && day1==day2){
                return true;
            }
            return false;
        }

        return false;
    }*/
    //第二版

    public boolean equals1(Object obj) {
        //obj为空
        if (obj == null) {
            return false;
        }
        //不是同一个Mytime2的数据类型
        if (!(obj instanceof Mytime2)) {
            return false;
        }
        //内存地址相同
        if (this == obj) {
            return true;
        }
        //程序到这说明obj是一个Mytime类型
        Mytime2 t =(Mytime2) obj;
        if(this.year ==t.year && this.month == t.month && this.day == t.day){
            return true;
        }
        return false;
    }
}
