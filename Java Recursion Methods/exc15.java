public class exc15 {
    // Rekursiv funksiya: massiv tartiblanganligini tekshiradi 
    public static boolean isSorted(int[] arr, int index) {
        // base case: Agar element yoki kamroq qoglan  bo'lsa, true
        if (index == arr.length - 1) {
            return true;
        }

        // Agar hozirgi element keyingisidan katta bo'lsa, tartiblangan emas 
        if(arr[index] > arr[index + 1]) {
            return false;
        }

        // Qoglan elementlar uchun rekursiv chaqiruv 
        return isSorted(arr, index + 1);

    }
    public static void main(String[] args) {
        int[] example1 = {1, 2, 3, 4, 5};
        int[] example2 = {1, 3, 2, 5, 6};  

        System.out.println("example1 is sorted? " + isSorted(example1, 0)); // true
  
    } 
}
