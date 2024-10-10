// 14. Problem: Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The square root of x should be computed without using built-in exponent functions or operators.
public int mySqrt(int x) {
    if (x == 0) {
        return 0;
    }
    int left = 1, right = x;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (mid > x / mid) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }
    return right;
}