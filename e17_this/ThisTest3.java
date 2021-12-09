/*
this. 用来区分局部变量和实例变量的时候不能省略
 */
public class ThisTest3 {
    private int id;//实例变量
    private String name;

    public void setId(int id){
        this.id = id;//实例变量=局部变量
    }
}
