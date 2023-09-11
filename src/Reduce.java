public class Reduce {

    public static void main(String[] args) {
        int count = 0;
        int n = 100;
        while (n > 0){
            n = operation(n);
            count += 1;
        }
        System.out.println("It took " + count + " times for 100 to reach 0.");
    }

    private static int operation(int n) {
        if (n % 2 == 0) {
            n = n / 2;
        } else {
            n -= 1;
        }
        return n;
    }
}
