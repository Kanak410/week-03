package stringbuffer.comparestringbufferandbuilder;

public class Main {
    public static void main(String[] args) {
        int iterations = 10; // Run the test multiple times
        int concatIterations = 100000;
        String s = "Hello";

        long totalTimeStringBuilder = 0;
        long totalTimeStringBuffer = 0;

        for (int i = 0; i < iterations; i++) {
            totalTimeStringBuilder += testStringBuilder(concatIterations, s);
            totalTimeStringBuffer += testStringBuffer(concatIterations, s);
        }

        System.out.println(" StringBuilder Time: " + (totalTimeStringBuilder / iterations) + " ns");
        System.out.println(" StringBuffer Time: " + (totalTimeStringBuffer / iterations) + " ns");
    }

    public static long testStringBuilder(int count, String s) {
        long startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(s);
        }
        return System.nanoTime() - startTime;
    }

    public static long testStringBuffer(int count, String s) {
        long startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < count; i++) {
            sbf.append(s);
        }
        return System.nanoTime() - startTime;
    }
}
