package offer;

public class offer_11 {

    public static int minArray(int[] numbers) {

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i + 1] < numbers[i]) {
                return numbers[i + 1];
            }
        }
        return numbers[0];
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 1, 2};
        System.out.println(minArray(arr));
    }

}
