import java.sql.SQLException;

public class expeptionC {
    void test(int a, int b) throws ArithmeticException {

            int c = 0;
            c = a / b;
                System.out.print("output is " + c);
    }
    public static void main(String[] args) {
        expeptionC obj = new expeptionC();
        obj.test(10,0);

    }
}
