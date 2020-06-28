public class problem_0009 {
    public boolean isPalindrome(int x) {
        int temp = 0;
        int value = x;

        while (value > 0) {
            temp = temp * 10 + value % 10;
            value = value / 10;
        }

        return temp == x;
    }

    public static void main(String[] args) {
        problem_0009 t = new problem_0009();
        System.out.println(t.isPalindrome(101));
    }
}