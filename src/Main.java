public class Main {
    public static void main(String[] args) {
        int a = 400000000;
        int sum = 0;
        String arr = Integer.toString(a);
        char[] myCharArray = arr.toCharArray();
        for (int i = 0; i < myCharArray.length; i++) {
            sum += Character.getNumericValue(myCharArray[i]);
        }
        System.out.println(sum);
    }
}
