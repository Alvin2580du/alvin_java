package per.alvin.Java.Javastudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.math.*;


public class ArrayProcess {
    public static void main(String[] args) {
        int[] ary = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};//要分割的数组
        int splitSize = 4;//分割的块大小
        Object[] subAry = splitAry(ary, splitSize);//分割后的子块数组

        for(Object obj: subAry){//打印输出结果
            int[] aryItem = (int[]) obj;
            for(int i = 0; i < aryItem.length; i++){
                System.out.print(aryItem[i] + ", ");
            }
            System.out.println();
        }
        int[][] ary1 = {{1,2,3}, {1,3}};
        int[] res;
        res = deepFlatten(ary1);
        System.out.println(Arrays.toString(res));

    }

    /**
     * splitAry方法<br>
     * @param ary 要分割的数组
     * @param subSize 分割的块大小
     * @return
     *
     */
    private static Object[] splitAry(int[] ary, int subSize) {
        int count = ary.length % subSize == 0 ? ary.length / subSize: ary.length / subSize + 1;

        List<List<Integer>> subAryList = new ArrayList<List<Integer>>();

        for (int i = 0; i < count; i++) {
            int index = i * subSize;
            List<Integer> list = new ArrayList<Integer>();
            int j = 0;
            while (j < subSize && index < ary.length) {
                list.add(ary[index++]);
                j++;
            }
            subAryList.add(list);
        }

        Object[] subAry = new Object[subAryList.size()];

        for(int i = 0; i < subAryList.size(); i++){
            List<Integer> subList = subAryList.get(i);
            int[] subAryItem = new int[subList.size()];
            for(int j = 0; j < subList.size(); j++){
                subAryItem[j] = subList.get(j).intValue();
            }
            subAry[i] = subAryItem;
        }

        return subAry;
    }

    public static int[][] chunk(int[] numbers, int size) {
        return IntStream.iterate(0, i -> i + size).limit((long) Math.ceil((double) numbers.length / size))
                .mapToObj(cur -> Arrays.copyOfRange(numbers, cur, cur + size > numbers.length ? numbers.length : cur + size))
                .toArray(int[][]::new);
    }

    public static <T> T[] concat(T[] first, T[] second) {
        return Stream.concat(Stream.of(first), Stream.of(second)).toArray(i -> (T[]) Arrays.copyOf(new Object[0], i, first.getClass()));
    }

    public static long countOccurrences(int[] numbers, int value) {
        // 计算数组中某个值出现的次数。
        return Arrays.stream(numbers).filter(number -> number == value).count();
    }
    //    数组扁平化。
    public static int[] deepFlatten(Object[] input) {
        return Arrays.stream(input).flatMapToInt(o -> {
                    if (o instanceof Object[]) {
                        return Arrays.stream(deepFlatten((Object[]) o));
                    }
                    return IntStream.of((Integer) o);}).toArray();
    }
}