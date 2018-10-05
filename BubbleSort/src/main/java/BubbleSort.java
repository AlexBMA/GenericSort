import java.util.Comparator;

public class BubbleSort implements Sort, SortSupport {


    private Swapper swapper = null;
    private Comparator comparator = null;

    public void sort(Sortable collection) {

    }

    public void setSwapper(Swapper swapper) {
        this.swapper = swapper;
    }

    public void setComparator(Comparator comparator) {
        this.comparator = comparator;
    }
}
