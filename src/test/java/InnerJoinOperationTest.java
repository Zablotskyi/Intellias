import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;

public class InnerJoinOperationTest {
    public Collection<DataRow<Integer, String>> leftCollection = new ArrayList<>();
    public Collection<DataRow<Integer, String>> rightCollection = new ArrayList<>();
    public InnerJoinOperation<Integer, String, String> innerJoinOperation = new InnerJoinOperation<>();

    @Before
    public void setUp() {
        DataRow<Integer, String> dataRow1 = new DataRow<>(0, "Ukraine");
        DataRow<Integer, String> dataRow2 = new DataRow<>(1, "Germany");
        DataRow<Integer, String> dataRow3 = new DataRow<>(2, "France");
        DataRow<Integer, String> dataRow4 = new DataRow<>(0, "Kyiv");
        DataRow<Integer, String> dataRow5 = new DataRow<>(1, "Berlin");
        DataRow<Integer, String> dataRow6 = new DataRow<>(3, "Budapest");

        leftCollection.add(dataRow1);
        leftCollection.add(dataRow2);
        leftCollection.add(dataRow3);

        rightCollection.add(dataRow4);
        rightCollection.add(dataRow5);
        rightCollection.add(dataRow6);
    }
//innerJoinOperation.join(leftCollection, rightCollection);
    @Test
    public void innerJoin_whenValidCollectionsPresent() {
        int counter = 0;
        for (JoinedDataRow<Integer, String, String> obj : innerJoinOperation.join(leftCollection, rightCollection)) {
            Assert.assertEquals(counter, (int) obj.getId());
            counter++;
        }
    }
}