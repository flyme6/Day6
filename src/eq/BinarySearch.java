package eq;

public class BinarySearch {
    /**
     * 二分查找，必须是兑有序的数组，才能进行二分查找。
     * @param ia
     * @param key
     * @return
     */
    static int binarySearch(int[] ia, int key) {
        int low = 0;
        int hight = ia.length - 1;
        while (low <= hight) {
            int middle = (low + hight) / 2;
            if (ia[middle] == key) {
                System.out.printf("数字：%2d,第%2d次查到\n",ia[middle],middle+1);
                return middle;
            }
            if (ia[middle] > key) {
                hight = middle - 1;
            }
            if (ia[middle] < key) {
                low = middle + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] ia = {25, 29, 39, 42, 55, 66};
        System.out.println(binarySearch(ia,29));
        System.out.println(binarySearch(ia,27));
    }
}
