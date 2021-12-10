class MyHashMap<K,V>{
    private Node<K, V> head;
    private int size=0;
    private static class Node<K,V> {
        K key;
        V value;
        Node<K,V> next;

        Node(K key, V value) {
            this.key=key;
            this.value=value;
        }
    }
    public Node<K,V> findKey(K key){
        Node<K,V> x = head;
        do{
           if(x.key==key){
               return x;
           }
        }while ((x=x.next)!=null);
        return null;
    }
    public void put(K key, V value){
        if (findKey(key)!=null){
            System.out.println("Object with such key already exist");
        }else{
            if (isEmpty()){
                head = new Node<K,V>(key,value);
            }else {
                Node<K,V> oldHead=head;
                head = new Node<K,V>(key,value);
                head.next=oldHead;

            }
            size++;
        }
    }
    public void remove(K key){
        if (!isEmpty()){
           if (head.key==key){
              head=(head.next==null?null:head.next);
              size--;
           }else {
               Node<K,V> x = head;
               do{
                   if(x.next!=null&&x.next.key==key){
                       x.next = (x.next.next==null?null:x.next.next);
                       size--;
                   }
               }while ((x=x.next)!=null);
           }
        }
    }
    public V get(K key){
        Node<K,V> node=findKey(key);
        if (node!=null){
            return node.value;
        }else {
            return null;
        }
    }
    public void clear(){
        size=0;
        head=null;
    }

    public boolean isEmpty() {
        return size==0;
    }

    public int size() {
        return size;
    }
}
