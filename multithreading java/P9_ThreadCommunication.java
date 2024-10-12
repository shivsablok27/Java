class SharedResource {
    int data;
    private boolean available = false;

    public synchronized void produce(int value) throws InterruptedException{
        while(available){
            wait();
        }
        data = value; // produced
        available = true;
        System.out.println("Produced "+data);
        notify();
    }
    public synchronized void consume() throws InterruptedException{
        while(!available){
            wait();
        }
        //consumed
        available = false;
        System.out.println("Consumed "+data);
        notify();
    }
}
class Producer extends Thread{
    private SharedResource resource;
    public Producer(SharedResource resource){
        this.resource = resource;
    }
    public void run(){
        for (int i = 0; i<5; i++){
            try{
                resource.produce(i);
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
class Consumer extends Thread{
    private SharedResource resource;
    public Consumer(SharedResource resource){
        this.resource = resource;
    }
    public void run(){
        for (int i = 0; i<5; i++){
            try{
                resource.consume();
            }
            catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

public class P9_ThreadCommunication {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();
        Producer producer = new Producer(resource);
        Consumer consumer = new Consumer(resource);
        producer.start();
        consumer.start();
    }    
}
