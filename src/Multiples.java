public class Multiples {

    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                count++;
            }
        }
        System.out.println("There are " + count + " numbers below 1000 that are multiples of 3 or 5");
    }
}
