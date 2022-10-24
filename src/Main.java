import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        MyListOfIntegers nums = new MyListOfIntegers(
                new int[] {2, 4, 6});

        for (int i : nums) {
            for (int j : nums) {
                System.out.println(i + " " + j);
            }
        }

//        Iterator<Integer> iter1 = nums.iterator();
//        Iterator<Integer> iter2 = nums.iterator();
//        System.out.println(iter1.next());
//        System.out.println(iter2.next());
//        System.out.println(iter2.next());
//        System.out.println(iter1.next());
//        System.out.println(iter1.next());

//        MyIterator nums = new MyIterator(5);
//        MyIterator nums2 = new MyIterator(3);
//
//        System.out.println(nums.next());
//        System.out.println(nums.next());
//        System.out.println(nums2.next());
//        System.out.println(nums.next());

//        while (nums.hasNext()) {
//            System.out.println(nums.next());
//        }
//        System.out.println(nums.next());  // 0
//        System.out.println(nums.next());  // 1
//        System.out.println(nums.next());  // 2


//        List<Integer> myList = new ArrayList<>();
//        myList.add(1);
//        myList.add(2);
//        myList.add(3);
//
//        for (int i : myList) {
//            for (int j : myList) {
//                System.out.println(i + " " + j);
//            }
//        }
    }
}