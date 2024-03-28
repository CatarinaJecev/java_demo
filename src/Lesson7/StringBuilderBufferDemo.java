package Lesson7;

public class StringBuilderBufferDemo {
    public static void main(String[] args) {

        int iterations = 100000;

        long startTimeNormal = System.currentTimeMillis();

        String resultNormal = "";

        for (int i = 0; i< iterations; i++) {
            resultNormal += "Iterations" + i + " ";

        }

        long endTimeNormal = System.currentTimeMillis();
        long durationNormal = endTimeNormal - startTimeNormal;
        System.out.println("Result string: " + resultNormal);
        System.out.println("Time taken without StringBuilder/StringBuffer: " + durationNormal);
    }
}
