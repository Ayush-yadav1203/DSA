class Solution {
    public int findNthDigit(int n) {
        long digit = 1;
        long count = 9;
        long start = 1;

        // Step 1: skip blocks
        while (n > digit * count) {
            n -= digit * count;
            digit++;
            count *= 10;
            start *= 10;
        }

        // Step 2: find actual number
        long num = start + (n - 1) / digit;

        // Step 3: extract digit (no string)
        int index = (int)((n - 1) % digit);

        for (int i = 0; i < digit - index - 1; i++) {
            num /= 10;
        }

        return (int)(num % 10);
    }
}