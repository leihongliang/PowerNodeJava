package array;
//一个压栈弹栈的程序
public class homework {
    public static void main(String[] args) {
        Mystack stack = new Mystack();
        stack.push(new Object());
        stack.pop();
        stack.pop();
    }
}
class Mystack{
    private Object[] elements;
    //栈针
    int index=-1;
    public Mystack(){
        this.elements=new Object[3];
        this.index = -1;
    }

    public Object[] getElements() {
        return elements;
    }
    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public void push(Object obj){
        if (this.index >= this.elements.length-1){
            System.out.println("满栈！！！");
            return;
        }
        else {
            index++;
            this.elements[index] = obj;
            System.out.println("压栈成功，压入：" + obj + "————栈针：" + index);
        }
    }

    public void pop(){
        if (this.index == -1){
            System.out.println("空栈！！！");
            return;
        }
        else {
            System.out.println("弹栈成功，弹出：" + elements[index]+ "————栈针：" + index);
            index--;
        }


    }
}