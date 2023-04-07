public class MultiThreading2 {
    // be default we have main thread
    public static void main(String[] args) throws InterruptedException {
        Hi2 hi = new Hi2();  // object of the class
        Hello2 hello = new Hello2();
        Thread t1 = new Thread(hi);   // this is object of thread
        Thread t2 = new Thread(hello); // when using Runnable, we have to create one object of thread where we have to pass the object of runnable

        t1.start();
        try {
            Thread.sleep(10);
        }
        catch(Exception e){
            System.out.println(e);

        }
        t2.start();
        t1.join();;
        t2.join();



        System.out.println("DONE");

        //   hi.run();  -> we do not need this.
        // hello.run();
    }
}

class Hi2 implements Runnable{
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(500);
            }
            catch(Exception e ){

            }
        }
    }
}
class Hello2 implements Runnable{
    public void run() {
        for (int i = 0; i < 6; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(500);
            }
            catch(Exception e){
                System.out.println(e);

            }

        }
    }
}