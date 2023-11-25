import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class RightJoinOperation<K, V1, V2> implements JoinOperation<DataRow<K, V1>, DataRow<K, V2>, JoinedDataRow<K, V1, V2>> {

    @Override
    public Collection<JoinedDataRow<K, V1, V2>> join(Collection<DataRow<K, V1>> leftCollection, Collection<DataRow<K, V2>> rightCollection) {
        List<JoinedDataRow<K, V1, V2>> resultCollection = new ArrayList<>();

        for(DataRow<K, V2> right : rightCollection) {
            boolean isMatchFound = false;

            for (DataRow<K, V1> left : leftCollection) {
                if (right.getId() == left.getId()) {
                    isMatchFound = true;
                    resultCollection.add(new JoinedDataRow<K, V1, V2>(right.getId(), left.getValue(), right.getValue()));

                }
            }
            if (!isMatchFound) {
                resultCollection.add(new JoinedDataRow<K, V1, V2>(right.getId(), null, right.getValue()));
            }
        }

        return resultCollection;
    }
}
