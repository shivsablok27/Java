class PriorityThread extends Thread{
    public PriorityThread(String name){
        super(name);
    }
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(Thread.currentThread().getName()
            + " Priority: "+Thread.currentThread().getPriority());
        }
    }
}
public class P6_PrioritySetting {
    public static void main(String[] args) {
        PriorityThread t1 = new PriorityThread("High");
        t1.setPriority(Thread.MAX_PRIORITY);
        PriorityThread t2 = new PriorityThread("Medium");
        t2.setPriority(Thread.NORM_PRIORITY);
        PriorityThread t3 = new PriorityThread("Low");
        t3.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}
