import java.util.List;

public class StringContainsDigitsOrNot {
    public static void main(String[] args) {
        String str = "ab1c" ;
        StringContainsDigitsOrNot obj = new StringContainsDigitsOrNot();
          System.out.println(obj.checkDigits(str));

    }

    public boolean checkDigits(String s) {
        char[] arr = s.toCharArray();
        boolean flag = false;
        for (char c : arr) {
            flag = Character.isDigit(c);
            if (flag == true) {
                break;
            }
        }
        return flag;
    }
}







