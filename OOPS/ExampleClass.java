package OOPS;
class Counter{
    static int count;
    Counter(){
        count++;
        System.out.println("Object Count: "+count);
    }
}
class PrintMessage{
    PrintMessage(String msg){
        System.out.println(msg);
    }
}
public class ExampleClass {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        PrintMessage msg = new PrintMessage("Wonders of Objects");
    }
}
