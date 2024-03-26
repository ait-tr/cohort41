package compareObj.comparator;

import java.util.Comparator;

public class PairComparator implements Comparator<Pair> {


    @Override
    public int compare(Pair pair1, Pair pair2) {
        int compareResult = pair1.getOurString().compareTo(pair2.getOurString());
        if (compareResult == 0) {
        compareResult = pair1.getOurInteger() - pair2.getOurInteger();}

        return compareResult;
    }
}
