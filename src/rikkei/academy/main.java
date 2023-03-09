package rikkei.academy;

public class main {
    public static void main(String[] args) {
        // write your code here
        int[] arr = {3, 5,3, 7,9};
        int index = minValue(arr);
        System.out.println("Giá trị nhỏ nhất mảng là: " + arr[index]);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
