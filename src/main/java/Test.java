import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Test {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        foo(list,e -> e % 2==0);

    }

    static void foo(List<Integer> list, Function<Integer, Boolean> function) {
        for (Integer current:list) {
            if(function.apply(current)){
                System.out.println(current);
            }
        }
    }
}
