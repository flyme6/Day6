package eq;

public class SeqSearch {
    /**
     * 顺序查找。
     * 在数组中查找所要查找的数，把数组循环一遍，找出与所要查找的数相等，即返回值。否则，返回-1，以来标识数组中无所要找的数
     * @param ia
     * @param key
     * @return
     */
    private static int seqSearch (int [] ia, int key){
        for (int i = 0; i < ia.length; i++) {
            if (key == ia[i]) {
                System.out.print("第"+i+"次查到");
                return ia[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int [] ia = {25, 69, 89, 12, 32, 56};
        System.out.println(seqSearch(ia,69));
        System.out.println(seqSearch(ia,26));
    }
}
