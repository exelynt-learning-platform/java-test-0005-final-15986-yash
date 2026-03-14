public class Assignment4 {
    public static void main(String[] args) {
        int size = 7;
        int center = size / 2;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int value = Math.max(Math.abs(i - center), Math.abs(j - center)) + 1;
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
