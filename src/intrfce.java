public class intrfce {
    public static void main(String[] args) {
        Developer Panchali = new Developer();
        Computer lap = new Laptop();
        Computer desk = new Desktop();
        Panchali.devApp(desk);
    }

}

class Developer
{
    public void devApp(Computer desk){
        desk.code();
    }
}
class Laptop implements Computer{
    public void code(){
        System.out.println("wfhome");
    }
}

class Desktop implements Computer{
    public void code(){
        System.out.println("come to office :(");
    }
}
interface   Computer {
    void  code();
}