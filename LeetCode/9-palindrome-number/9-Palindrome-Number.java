import java.util.Scanner;

class Solution {
    public boolean isPalindrome(int x) {
        int temp = x;
        int sum = 0;
        int n;
        while (temp > 0) {
            n = temp % 10;
            sum = sum * 10 + n;
            temp = temp / 10;
        }
        return sum == x;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        Solution sol = new Solution();
        boolean result = sol.isPalindrome(number);

        if (result) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}