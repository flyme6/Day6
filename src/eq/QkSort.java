package eq;

public class QkSort {
    /**
     * 快速查找, 设定最后一个数字，为key，
     * 从前往后比较，移动数设为i，找出比key大的值，
     * 从后往前比较，移动数设为j，找到比key小的值。
     * 如果 i == j， 把key值和 i所指出对应的数值作为交换。
     * 否则，i和j所对应的值作交换。进行下一次循环。
     *
     * @param a
     * @param begin
     * @param end
     * @return
     */
    static int split(int[] a, int begin, int end) {
        int key = a[end];
        int i = begin - 1;
        int j = end;
        while (true) {
            while (a[++i] < key) ;
            while (j > i && a[--j] > key) ;
            if (j == i) {
                a[end] = a[i];
                a[i] = key;
                return i;
            } else {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
    }

    static void quickSortInternal(int[] a, int begin, int end) {
        if (begin >= end) return;
        int position = split(a, begin, end);
        quickSortInternal(a, begin, position - 1);
        quickSortInternal(a, position + 1, end);
    }

    static void quickSort(int[] a) {
        quickSortInternal(a, 0, a.length - 1);
    }

    static void print(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]);
            System.out.print("\t");
        }
    }

    static int searchSort(int a[], int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int a[] = {66, 77, 44, 33, 55, 99};

        print(a);
        System.out.println();
        quickSort(a);
        print(a);
        System.out.println();
    }
}
