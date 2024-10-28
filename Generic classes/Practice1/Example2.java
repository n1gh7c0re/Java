//  Параметризованный класс с несколькими типами
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}

public class Example2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("One", 1);

        // Проверка экземпляра Pair
        if (pair instanceof Pair) {
            System.out.println("pair is an instance of Pair");
        }

        // Проверка типов внутри Pair
        if (pair.getKey() instanceof String) {
            System.out.println("The key in pair is a String");
        }

        if (pair.getValue() instanceof Integer) {
            System.out.println("The value in pair is an Integer");
        }
    }
}
