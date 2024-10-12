class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    @Override
    public void run(){
        for(int i=1; i<=10; i++){
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                System.out.println("CRITICAL SECTION");
            }
            System.out.println(Thread.currentThread().getName()+" Hello World");
        }
    }
}
public class P1_ThreadsByThreadsClass{
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Yash");
        MyThread t2 = new MyThread("Shiv");
        t1.start();
        t2.start();
    }
}