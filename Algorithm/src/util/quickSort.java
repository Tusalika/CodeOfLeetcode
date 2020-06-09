package util;


public class quickSort {
    int[] a = {65, 8, 89, 45, 78, 41, 23, 64, 58, 96, 19, 36, 44, 47, 16, 56, 95};

    //    public static void main(String[] args) {
////        int[] a = {65, 8, 89, 45, 78, 41, 23, 64, 58, 96, 19, 36, 44, 47, 16, 56, 95};
//
//    }
    public static void main(String[] args) {
        new quickSort();
    }

    public quickSort() {
        quick(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public int getMiddle(int[] list, int low, int high) {
        int tmp = list[low];
        while (low < high) {
            while (low < high && list[high] >= tmp) {
                high--;
            }
            list[low] = list[high];
            while (low < high && list[low] <= tmp) {
                low++;
            }
            list[high] = list[low];
        }
        list[high] = tmp;
        return low;
    }

    public void _quickSort(int[] list, int low, int high) {
        if (low < high) {
            int middle = getMiddle(list, low, high);
            _quickSort(list, low, middle - 1);
            _quickSort(list, middle + 1, high);

        }
    }

    public void quick(int[] a2) {
        if (a2.length > 0) {
            _quickSort(a2, 0, a2.length - 1);
        }
    }
}
