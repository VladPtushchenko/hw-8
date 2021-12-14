import java.util.Objects;
class MyArrayList<E>{
    private static final int DEFAULT_CAPACITY = 10;
    transient Object[] elementData;
    private int size=0;

    public MyArrayList() {
        elementData = new Object[DEFAULT_CAPACITY];
    }

    private void growMyArray() {
        Object [] newArray = new Object[elementData.length * 2];
        System.arraycopy(elementData, 0, newArray, 0, size - 1);
        elementData = newArray;
    }

    public void add(E element) {
        if (size+1 == elementData.length)
            growMyArray();
        elementData[size] = element;
        size++;
    }


    public void remove(int index) {
        Object [] newArray = new Object[elementData.length];
        System.arraycopy(elementData, 0, newArray, 0, index);
        System.arraycopy(elementData, index+1, newArray, index, elementData.length - index-1);
        elementData = newArray;
        size--;
    }

    public void clear() {
        for (Object es : elementData)
            es = null;
        size = 0;
    }

    public Object size() {
        return size;
    }


    public E get(int index) {
        Objects.checkIndex(index, size);
        return (E)elementData[index];
    }
}
