class DaemonThread extends Thread{
    public void run(){
        while(true){
            System.out.println("Hello World");
        }
    }
}
public class P7_DaemonThread {
    public static void main(String[] args) {
        DaemonThread t1 = new DaemonThread();
        t1.setDaemon(true);
        t1.start();

        System.out.println(Thread.currentThread().getName() + " Ends Here!!");
    }
}
