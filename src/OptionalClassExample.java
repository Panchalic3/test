import java.util.Optional;

public class OptionalClassExample {

    public static Optional<String> getName(){
        String name = null;
       return Optional.ofNullable(name);
    }


    public static void main(String[] args) {
        String str = "";
//        String str2 = "Not Null";
//
        Optional <String> opt = Optional.ofNullable(str);
//        Optional <String> opt2 = Optional.ofNullable(str2);
//
        System.out.println(opt.isPresent());
        System.out.println(opt.get());
//        System.out.println(opt2.isPresent());
//       // System.out.println(opt.get());  --> no such element exception
//        System.out.println(opt2.get());
//        System.out.println(opt.orElse("this is null"));
//        System.out.println(opt2.orElse("this is null"));

        /**
         * when we are making a method and the method will be called by some else method, in that case we shuld make the retirm type of the method
         * as optional as in that case it can be handeled in the method thatbis calling th method.
         **/
//      Optional<String> n = getName();
//      System.out.println(n.orElse("null is the name"));



    }
}
