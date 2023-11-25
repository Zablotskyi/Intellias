import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        DataRow<Integer, String> dataRow1 = new DataRow<>(0, "Ukraine");
        DataRow<Integer, String> dataRow2 = new DataRow<>(1, "Germany");
        DataRow<Integer, String> dataRow3 = new DataRow<>(2, "France");
        DataRow<Integer, String> dataRow4 = new DataRow<>(0, "Kyiv");
        DataRow<Integer, String> dataRow5 = new DataRow<>(1, "Berlin");
        DataRow<Integer, String> dataRow6 = new DataRow<>(3, "Budapest");

        List<DataRow<Integer, String>> leftCollection = new ArrayList<>();
        leftCollection.add(dataRow1);
        leftCollection.add(dataRow2);
        leftCollection.add(dataRow3);

        List<DataRow<Integer, String>> rightCollection = new ArrayList<>();
        rightCollection.add(dataRow4);
        rightCollection.add(dataRow5);
        rightCollection.add(dataRow6);

        InnerJoinOperation<Integer, String, String> innerJoinOperation = new InnerJoinOperation<>();

        System.out.println("InnerJoinOperation:");
        for (JoinedDataRow<Integer, String, String> obj : innerJoinOperation.join(leftCollection, rightCollection)) {
            System.out.println("data: " + obj.getId() + " / " + obj.getValue1() + " / " + obj.getValue2());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("leftJoinOperation:");

        LeftJoinOperation<Integer, String, String> leftJoinOperation = new LeftJoinOperation<>();

        for (JoinedDataRow<Integer, String, String> obj : leftJoinOperation.join(leftCollection, rightCollection)) {
            System.out.println("data: " + obj.getId() + " / " + obj.getValue1() + " / " + obj.getValue2());
        }
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("RightJoinOperation:");

        RightJoinOperation<Integer, String, String> rightJoinOperation = new RightJoinOperation<>();

        for (JoinedDataRow<Integer, String, String> obj : rightJoinOperation.join(leftCollection, rightCollection)) {
            System.out.println("data: " + obj.getId() + " / " + obj.getValue1() + " / " + obj.getValue2());
        }
    }
}
