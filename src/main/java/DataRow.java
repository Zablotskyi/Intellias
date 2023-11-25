public class DataRow<K, V> {
    private K id;
    private V value;

    public DataRow(K id, V value) {
        this.id = id;
        this.value = value;
    }

    public K getId() {
        return id;
    }

    public V getValue() {
        return value;
    }
}
