public class exc12 {

    public static int productRecursive(int[] arr, int index) {
        if(index == arr.length - 1) {
            return arr[index];
        }

        return arr[index] * productRecursive(arr, index + 1);
    }
    public static void main(String[] args) {
        int[] arr = {
            1,
            2,
            3,
            5,
            6,
            7
        };

        int product = productRecursive(arr, 0);
        System.out.println("Product: " + product);

    }
}
