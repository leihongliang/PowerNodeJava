package javase.collection;

//自定义泛型
//
public class GenericTest02 <E>{
    public void doSome(E o) {
        System.out.println(o);
    }

    public static void main(String[] args) {
        GenericTest02<String> gt = new GenericTest02<>();
        gt.doSome("abc");

        GenericTest02<Integer> gt2 = new GenericTest02<>();
        gt2.doSome(123);

    }
}
