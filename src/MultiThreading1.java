public class MultiThreading1 {
    // be default we have main thread
    public static void main(String[] args) throws InterruptedException {
        Hi hi = new Hi();
        Hello hello = new Hello();

        hi.start();
        hello.start();

     //   hi.run();  -> we do not need this.
       // hello.run();
    }
}

class Hi extends Thread{
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(501);
            }
            catch(Exception e ){

            }
        }
    }
}
class Hello extends Thread{
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(501);
            }
            catch(Exception e){
                System.out.println(e);

            }

        }
    }
}