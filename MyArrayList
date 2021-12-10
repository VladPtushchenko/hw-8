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
        elementData[size+1] = element;
        size++;
    }


    public void remove(int index) {
        for (int i = index; i<size; i++)
            elementData[i] = elementData[i+1];
        elementData[size] = null;
        size--;
    }

    public void clear() {
         final Object[] es = elementData;
        for (int to = size, i = size = 0; i < to; i++)
            es[i] = null;
    }

    public Object size() {
        return size;
    }


    public E get(int index) {
        Objects.checkIndex(index, size);
        return (E)elementData[index];
    }
}
