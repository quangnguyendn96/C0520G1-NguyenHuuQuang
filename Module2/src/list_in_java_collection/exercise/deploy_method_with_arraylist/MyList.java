package list_in_java_collection.exercise.deploy_method_with_arraylist;

import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    public Object elements[];

    MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    MyList(int capacity) {
        if (capacity > 0) {
            elements = new Object[capacity];
        } else {
            System.out.println("Nhập sai độ dài mảng");
        }
    }

    public void add(E element, int index) {
        if (index > elements.length) {
            System.out.println("Wrong Index");
        } else if (elements.length == size) {
            ensureCapa(10);
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;

        }
    }

    public int getSize() {
        return this.size;
    }

    public void clear() {
        size = 0;
//for(int  = 0; i < size; i++){
        for (Object object : elements) {
            object = null;
        }
    }

    public boolean add(int index, E element) {
        if (elements.length == size) {
            ensureCapa(10);
        }
        elements[size] = element;
        size++;
        return true;
    }

    public void add(E element) {
        elements[size] = element;
        size++;
//        return true;
    }

    public void ensureCapa(int minCapacity) {
        int newSize = elements.length + minCapacity;
        elements = Arrays.copyOf(elements, newSize);
    }
    public E get(int index){
        return (E) elements[index];
    }
    public int indexOf(E element){
        int index = -1;
        for(int i = 0; i < size; i++){
            if(this.elements[i].equals(element)){
                return i;
            }
        }
        return index;
    }
    public boolean contains(E element){
        return this.indexOf(element) >=0;
    }
    public MyList<E> clone(){
        MyList<E> myList = new MyList<>();
        myList.elements =Arrays.copyOf(this.elements,this.size);
        myList.size = this.size;
        return myList;
    }
}
