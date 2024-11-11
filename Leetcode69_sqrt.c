int mySqrt(int x) {
    if (x < 2) return x;  // Handle 0 and 1 edge cases

    int beg = 1, end = x;
    while (beg <= end) {
        int mid = beg + (end - beg) / 2;
        long sq = (long) mid * mid;  // Use long to avoid overflow

        if (sq == x) {
            return mid;
        } else if (sq < x) {
            beg = mid + 1;
        } else {
            end = mid - 1;
        }
    }
    return end;  // Return the largest integer whose square is <= x
}
