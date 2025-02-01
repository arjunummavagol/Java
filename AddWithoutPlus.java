//Explanation:
//XOR (^) adds two numbers without carrying the bits.
//AND (&) identifies carry bits.
//The carry is shifted left (<<) and added iteratively until no carry is left.

public class AddWithoutPlus {
    public static int add(int a, int b) {
        while (b != 0) {
            int carry = a & b;  // Carry bits
            a = a ^ b;          // Sum without carry
            b = carry << 1;     // Shift carry to left
        }
        return a;
    }

    public static void main(String[] args) {
        int num1 = 15, num2 = 27;
        System.out.println("Sum: " + add(num1, num2)); // Output: 42
    }
}
