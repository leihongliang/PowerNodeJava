package annotation;

@MyAnnotatio2("value")
public class annotation01 {

    @MyAnnotation(name = "lei", value = 21)
    public void doSome(){
    }

    @Deprecated
    public void doSome1(){
    }

    @MyAnnotatio3(email = {"数","组"})
    public void doSome2(){
        @MyAnnotatio3(email = "大括号省略")
        int a;
    }

}
