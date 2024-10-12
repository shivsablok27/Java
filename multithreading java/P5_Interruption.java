class Interruption extends Thread{
    @Override
    public void run(){
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
public class P5_Interruption {
    public static void main(String[] args){
        Interruption t1 = new Interruption();
        t1.start();
        t1.interrupt();
    }
}
