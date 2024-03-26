package compareObj.comparator;

import java.util.Comparator;

public class PairComparatorString implements Comparator<Pair> {


    @Override
    public int compare(Pair pair1, Pair pair2) {
        int compareResult = pair1.getOurString().compareTo(pair2.getOurString());
        return compareResult;
    }
}
