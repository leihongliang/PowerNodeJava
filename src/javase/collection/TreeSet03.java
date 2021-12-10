package javase.collection;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * 第二种排序方式：使用比较器
 */
public class TreeSet03 {
    public static void main(String[] args) {
        // WRONG！必须通过构造方法传递一个比较器进去
        // TreeSet<WuGui> wuGuis = new TreeSet<>();
        TreeSet<WuGui> wuGuis = new TreeSet<>(new WuGuiComparator());

        //匿名内部类的写法
        TreeSet<WuGui> wuGuis2 = new TreeSet<>(new Comparator<WuGui>(){
            @Override
            public int compare(WuGui o1, WuGui o2) {
                return Integer.compare(o1.age,o2.age);
            }
        });

        wuGuis.add( new WuGui(5));
        wuGuis.add( new WuGui(2));
        for (WuGui wuGui : wuGuis){
            System.out.println(wuGui);
        }

        //实现接口，匿名内部类
        wuGuis2.add( new WuGui(5));
        wuGuis2.add( new WuGui(2));
        for (WuGui wuGui2 : wuGuis2){
            System.out.println(wuGui2);
        }

    }
}
class WuGui{
    int age;

    public WuGui(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "WuGui{" +
                "age=" + age +
                '}';
    }
}

//单独编写比较器，实现java.util.Comparator接口
class WuGuiComparator implements Comparator<WuGui>{
    @Override
    public int compare(WuGui o1, WuGui o2) {
        return Integer.compare(o1.age, o2.age);
    }
}