class ReverseStringUsingStringBuilder {
    public static void main(String[] args) {
        String str = "hello";

        StringBuilder sb = new StringBuilder();
        sb.append(str);

        sb.reverse();

        String result = sb.toString();
        System.out.println(result);
    }
}
