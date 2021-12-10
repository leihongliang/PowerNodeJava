package javase.string;

public class stringbuffertest1 {
    public static void main(String[] args) {
        StringBuffer stringbuffer = new StringBuffer();
        stringbuffer.append("a");
        stringbuffer.append(1);
        System.out.println(stringbuffer);

        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("a");
        stringbuilder.append(2);


    }
}
