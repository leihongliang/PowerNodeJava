package thread;

/**
 * Sleep
 */
public class thread04 {
    public static void main(String[] args) {
        for (int i= 0; i< 10; i++){
            System.out.println(Thread.currentThread().getName() + "-->" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
