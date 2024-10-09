// Given a large integer represented as an integer array, increment the integer by one and return the resulting array.
public int[] plusOne(int[] digits) {
    int n = digits.length;
    for (int i = n - 1; i >= 0; i--) {
        if (digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        digits[i] = 0;
    }
    int[] result = new int[n + 1];
    result[0] = 1;
    return result;
}