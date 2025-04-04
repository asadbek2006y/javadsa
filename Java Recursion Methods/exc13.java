public class exc13 {
    public static int productRecursive(int[] arr, int index) {
        if(index == arr.length - 1)  {
            return arr[index];
        }

        return arr[index] * productRecursive(arr, index + 1);
    }

    public static void main(String[] args) {
        int[] arr = {2,3,4};
        int result = productRecursive(arr, 0);
        System.out.println("output: " + result);
    }
    
}