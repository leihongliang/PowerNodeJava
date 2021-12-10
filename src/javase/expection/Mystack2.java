package javase.expection;
class test{
    public static void main(String[]args){
        Mystack2 mystack2 = new Mystack2();
        try{
            mystack2.push(new Object());
            mystack2.push(new Object());
            mystack2.push(new Object());


            mystack2.pop();
            mystack2.pop();
            mystack2.pop();
            mystack2.pop();

        }catch (MyStackOperationException e){
            e.printStackTrace();
        }
    }
}

public class Mystack2 {
    private Object[] elements;
    //栈针
    int index=-1;
    public Mystack2(){
        this.elements=new Object[3];
        this.index = -1;
    }

    public Object[] getElements() {
        return elements;
    }
    public void setElements(Object[] elements) {
        this.elements = elements;
    }

    public void push(Object obj) throws MyStackOperationException {
        if (this.index >= this.elements.length-1){
            MyStackOperationException e = new MyStackOperationException("full!!!");
            throw e;
        }
        else {
            index++;
            this.elements[index] = obj;
            System.out.println("压栈成功，压入：" + obj + "————栈针：" + index);
        }
    }

    public void pop() throws MyStackOperationException {
        if (this.index == -1){
            throw new MyStackOperationException("empty!!!");
        }
        else {
            System.out.println("弹栈成功，弹出：" + elements[index]+ "————栈针：" + index);
            index--;
        }
    }
}