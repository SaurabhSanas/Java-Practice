public class CustomHashTable {
    int size;
    HashEntry[] table;
    public int hashCode(String key) {
        int hash = 0;
        for(int i = 0; i < key.length(); i++) {
            hash = 22 * hash + key.charAt(i) % size;

        }
        return hash;
    }
    public void put(String key, String value) {
        int hashCode = hashCode(key);
        if(table[hashCode] != null) {
            table[hashCode] = new HashEntry(key, value);
        }
    }
}

class HashEntry{
    String key;
    String value;
    HashEntry next;
    HashEntry(String key, String value) {
        this.key = key;
        this.value = value;
        this.next = null;
    }
}