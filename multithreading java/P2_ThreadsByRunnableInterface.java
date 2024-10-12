class OurThread implements Runnable{
    public void run(){
        for (int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName() + " lover");
        }
    }
}
public class P2_ThreadsByRunnableInterface {
    public static void main(String[] args)throws InterruptedException{
        OurThread object = new OurThread();
        Thread t1 = new Thread(object);
        t1.setName("Yash");
        t1.start();
        Thread t2 = new Thread(object);
        t2.setName("Tanvi");
        t2.start();
        System.out.println(Thread.currentThread().getName()+" Shiv");
        
        t1.join();
        t2.join();
        
        Thread t3 = new Thread(object);
        t3.setName("Lawaniya");
        t3.start();
    }
}
