class YourThread extends Thread{
    @Override
    public void run(){
        System.out.println("State: "+ Thread.currentThread().getState()+ " RUNNING");
        try{
            Thread.sleep(2000);
        }
        catch(InterruptedException e){
            System.out.println("CRITICAL SECTION");
        }
    }
}

public class P3_DifferentStatesOfThread {
    public static void main(String[] args) throws InterruptedException {
        YourThread t1 = new YourThread();
        System.out.println("State: "+ t1.getState());
        t1.start();
        System.out.println("State: "+ t1.getState());
        Thread.sleep(100);
        System.out.println("State: "+ t1.getState());
        t1.join();
        System.out.println("State: "+ t1.getState());
    }
}
