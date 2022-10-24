import java.util.Iterator;

public class MyListOfIntegers implements Iterable<Integer> {
    private final int[] myNums;

    public MyListOfIntegers(int[] ints) {
        myNums = ints;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new MyListIterator();
    }

    private class MyListIterator implements Iterator<Integer> {
        int currIndex = 0;

        @Override
        public boolean hasNext() {
            return currIndex < myNums.length;
        }

        @Override
        public Integer next() {
            return myNums[currIndex++];
        }
    }
}
