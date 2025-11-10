import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class CopyListElements {
    public static void copyList(List<? super Number> dest, List<? extends Number> src) {
        for (Number n : src) dest.add(n);
    }

    public static void main(String[] args) {
        List<Number> dest = new ArrayList<>();
        List<Integer> src = Arrays.asList(10, 20, 30);
        copyList(dest, src);
        System.out.println(dest); // [10, 20, 30]

        List<Object> destObj = new ArrayList<>();
        copyList(destObj, src);
        System.out.println(destObj); // [10, 20, 30]
    }
}
