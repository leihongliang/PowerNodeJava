public class e22_super {
    public static void main(String[] args) {
        new H();
    }
}
class F{
    public F(){
        System.out.println("1 F无参构造方法");
    }
}
class G extends F{
    public G(){
        System.out.println("2 G无参构造方法");
    }
    public G(String name){
        super();//不写也有
        System.out.println("3 G有参构造方法 string");
    }
}
class H extends G{
    public H(){
        this("lhl");
        System.out.println("4 H无参构造方法");
    }
    public H(String name){
        this(name, 20);
        System.out.println("5 H有参构造方法 string");
    }
    public H(String name,int age){
        super(name);
        System.out.println("6 H无参构造方法 string int");
    }

}