class Solution {
    public int findNumbers(int[] arr) {
        int even_digitcount = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0, d;
            while (arr[i] != 0) {
                count++;
                arr[i] = arr[i] / 10;
            }
            if (count % 2 == 0) {
                even_digitcount++;
            }
        }
        return even_digitcount;
    }
}