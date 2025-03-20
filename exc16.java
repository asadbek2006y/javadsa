public class exc16 {
    public static void main(String[] args) {
        String[] arr = new String[5];

        arr[0] = " +\"\"\"\"\"+ ";
        arr[1] = "[| o o |]";
        arr[2] = " |  ^  |";
        arr[3] = " | '-' |";
        arr[4] = " +-----+";

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
