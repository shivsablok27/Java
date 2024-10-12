class Yielding extends Thread{
    @Override
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println(Thread.currentThread().getName());
            Thread.yield();
        }
    }
}
public class P4_Yielding{
    public static void main(String[] args) {
        Yielding t1 = new Yielding();
        t1.setName("Yash");
        Yielding t2 = new Yielding();
        t2.setName("Tanvi");
        
        t1.start();
        t2.start();
    }
}