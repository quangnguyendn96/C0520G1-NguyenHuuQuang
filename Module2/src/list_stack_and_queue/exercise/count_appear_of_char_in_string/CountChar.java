package list_stack_and_queue.exercise.count_appear_of_char_in_string;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountChar<K,V> {
    private K charactor;
    private V integer;

    public CountChar(){};

    public CountChar(K charactor, V integer) {
        this.charactor = charactor;
        this.integer = integer;

    }
    public K getCharactor() {
        return charactor;
    }

    public void setCharactor(K charactor) {
        this.charactor = charactor;
    }

    public V getInteger() {
        return integer;
    }

    public void setInteger(V integer) {
        this.integer = integer;
    }
}

