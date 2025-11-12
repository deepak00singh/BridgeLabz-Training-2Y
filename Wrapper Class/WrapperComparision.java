public class WrapperComparision {
    public static void main(String[] args) {
        Integer a = 100;
        Integer b = 100;
        Integer c = 200;
        Integer d = 200;

        System.out.println(a == b); // true due to Integer cache (-128 to 127)
        System.out.println(c == d); // false (outside cache range)
        System.out.println(a.equals(b)); // true (compares values)
    }
}

/*
Explanation:
Java caches Integer values from -128 to +127.
So a & b refer to same object, but c & d don't.
*/
