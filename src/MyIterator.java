import java.util.Iterator;

public class MyIterator implements Iterator<Integer> {

    private final int max;
    int curr = 0;

    public MyIterator(int i) {
        this.max = i;
    }

    @Override
    public boolean hasNext() {
        return curr < max;
    }

    @Override
    public Integer next() {
        return this.curr++;
    }
}
