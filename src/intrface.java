import java.util.Scanner;
class intrface implements client
{
    public static void main(String[] args){
intrface i = new intrface();
i.input();
i.output();
    }
    String name ; double d ;
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("give");
        name = sc.nextLine();
        d = sc.nextInt();
    }
    public void  output(){
        System.out.println(name+" "+d);
    }

}