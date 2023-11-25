public class JoinedDataRow<K, V1, V2> {

    private K id;
    private V1 value1;
    private V2 value2;

    public JoinedDataRow(K id, V1 value1, V2 value2) {
        this.id = id;
        this.value1 = value1;
        this.value2 = value2;
    }

    public K getId() {
        return id;
    }

    public V1 getValue1() {
        return value1;
    }

    public V2 getValue2() {
        return value2;
    }

}
