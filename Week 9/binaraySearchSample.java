public class binaraySearchSample {
    public static void main(String[] args) {
        int[] a = { 4, 6, 7, 12, 24, 45, 67 };
        int index = binarySearch(a, 45);
        System.out.println(index);
    }

    public static int binarySearch(int[] nums, int a) {
        boolean found = false;
        int first = 0;
        int last = nums.length - 1;
        // while(!found) this condition alone gives us an infinite loop if the number is
        // not in the list
        while (first <= last) {

            int mid = (first + last) / 2;
            if (a == nums[mid]) {
                found = true;
                return mid;
            }
            if (a > nums[mid])
                first = mid + 1;
            else
                last = mid - 1;
        }
        return -1;
    }
}