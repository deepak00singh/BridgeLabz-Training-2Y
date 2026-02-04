class CompareStringBufferAndStringBuilder {
    public static void main(String[] args) {
        int n = 1000000;

        long start, end;

        // StringBuilder
        StringBuilder sb1 = new StringBuilder();
        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sb1.append("hello");
        }
        end = System.nanoTime();
        System.out.println("StringBuilder Time: " + (end - start));

        // StringBuffer
        StringBuffer sb2 = new StringBuffer();
        start = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sb2.append("hello");
        }
        end = System.nanoTime();
        System.out.println("StringBuffer Time: " + (end - start));
    }
}
