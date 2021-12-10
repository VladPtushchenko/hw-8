class MyStack<E>{
    public MyStack(){
    }

    private static class Node<E> {
        E element;
        Node<E> next;
        Node<E> prev;

        Node(E element) {
            this.element = element;
        }
    }

    private int size=0;
    private Node<E> head;
    private Node<E> tail;

    public boolean isEmpty() {
        return size==0;
    }

    public void push(E value) {
        Node<E> newNode = new Node<>(value);
        if(head == null){
            head = newNode;
        }else{
            Node<E> node  = tail;
            newNode.next = node;
            node.prev = newNode;
        }
        tail = newNode;
        size++;
    }

    public void remove(int index){
        if (isEmpty()||(index>size+1)){
            throw new IndexOutOfBoundsException();
        }
        Node<E> x = head;
        for (int counter = 0; counter < index; counter++) {
            x = x.next;
        }
        x.prev.next = x.next;
        x.next.prev = x.prev;
        size--;
    }

    public void clear(){
        if(head == null){
            System.out.println ("Empty");
        }else{
            head=null;
            tail=null;
            size=0;
        }
    }

    public int size(){
        return size;
    }
    public E peek(){
        return tail.element;
    }

    public E poll(){
        E lastElement = tail.element;
        tail.element = null;
        tail = tail.prev;
        tail.next=null;
        size--;
        return lastElement;
    }

}
