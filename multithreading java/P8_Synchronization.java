class Counter{
    private int count = 0;
    public synchronized void increment(){ 
        // Critical Section : Mutual Exclusion
        count++;
    }
    public int getCount(){
        return count;
    }
}
class DemoThread extends Thread{
    private Counter counter;

    public DemoThread(Counter counter){
        this.counter = counter;
    }
    @Override
    public void run(){
        for (int i=0; i<1000; i++){
            counter.increment();
        }
    }
}
public class P8_Synchronization {
    public static void main(String[] args){
        Counter counter = new Counter(); // common resource of t1 & t2
        DemoThread t1 = new DemoThread (counter);
        DemoThread t2 = new DemoThread (counter);
        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }
        catch(Exception e){
            //HANDLING
        }

        System.out.println("Final Count = " + counter.getCount());
    }
}
