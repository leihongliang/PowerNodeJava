package B_OOP.e24_Object;

public class objecttest01 {
    public static void main(String[] args) {
        Mytime mt = new Mytime(2021,10,29);
        System.out.println(mt.toString());
    }
}
class Mytime{
    int year;
    int mouth;
    int day;
    public Mytime(){
    }
    public Mytime(int year, int mouth, int day) {
        this.year = year;
        this.mouth = mouth;
        this.day = day;
    }
    public String toString(){
        return year +"/"+ mouth +"/"+ day;
    }

}
