import java.util.Optional;

public class OptionalClassObjectCreation {

    public static void main(String[] args) {
        // create Optional object
        Optional<String> str = Optional.empty();
        Optional<Integer> inte = Optional.of(1);  // when you are almost sure value will not be null use this
        Optional<Boolean> boole = Optional.ofNullable(true);  // when you think the value can be null use this

    }



}
