import java.util.ArrayList;

public class TestCollections {

    public static void main(String[] args) {

        // test MyArrayList
        System.out.println("test MyArrayList");
        MyArrayList<String> myArrayList = new MyArrayList<>();
        System.out.println(myArrayList.size());
        myArrayList.add("first");
        myArrayList.add("second");
        myArrayList.add("third");
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.get(0));
        System.out.println(myArrayList.get(1));
        System.out.println(myArrayList.get(2));
        myArrayList.remove(1);
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.get(0));
        System.out.println(myArrayList.get(1));
        myArrayList.clear();
        System.out.println("Size after clear():" + myArrayList.size());
        System.out.println("-------");

        //test MyLinkedList
        System.out.println("test MyLinkedList");
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        System.out.println(myLinkedList.size());
        myLinkedList.add("first");
        myLinkedList.add("second");
        myLinkedList.add("third");
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.get(2));
        myLinkedList.remove(1);
        System.out.println(myLinkedList.size());
        System.out.println(myLinkedList.get(0));
        System.out.println(myLinkedList.get(1));
        myLinkedList.clear();
        System.out.println("Size after clear():" + myLinkedList.size());
        System.out.println("-------");

        //test MyQueue
        System.out.println("test MyQueue");
        MyQueue<String> myQueue = new MyQueue<>();
        System.out.println(myQueue.size());
        myQueue.add("first");
        myQueue.add("second");
        myQueue.add("third");
        System.out.println("size:"+myQueue.size());
        System.out.println("peek:"+myQueue.peek());
        System.out.println("poll:"+myQueue.poll());
        System.out.println("size:"+myQueue.size());
        System.out.println("peek:"+myQueue.peek());
        System.out.println("size:"+myQueue.size());
        myQueue.remove(0);
        System.out.println("peek after remove(0):"+myQueue.peek());
        System.out.println("size after remove(0):"+myQueue.size());
        myQueue.clear();
        System.out.println("Size after clear():" + myQueue.size());
        System.out.println("-------");

        //test MyStack
        System.out.println("test MyStack");
        MyStack<String> myStack = new MyStack<>();
        System.out.println(myStack.size());
        myStack.push("first");
        myStack.push("second");
        myStack.push("third");
        System.out.println("size:"+myStack.size());
        System.out.println("peek:"+myStack.peek());
        System.out.println("pop:"+myStack.pop());
        System.out.println("size:"+myStack.size());
        System.out.println("peek:"+myStack.peek());
        myStack.remove(0);
        System.out.println("peek after remove(0):"+myStack.peek());
        System.out.println("size after remove(0):"+myStack.size());
        myStack.clear();
        System.out.println("Size after clear():" + myStack.size());
        System.out.println("-------");

        //test MyHashMap
        System.out.println("test MyHashMap");
        MyHashMap myHashMap = new MyHashMap();
        System.out.println(myHashMap.size());
        myHashMap.put("1", 1);
        myHashMap.put("2",2);
        myHashMap.put("3",3);
        System.out.println("size:"+myHashMap.size());
        System.out.println("get('1'):"+myHashMap.get("1"));
        myHashMap.remove("1");
        System.out.println("get('1'):"+myHashMap.get("1"));
        System.out.println("size:"+myHashMap.size());
        myHashMap.clear();
        System.out.println("Size after clear():" + myHashMap.size());
        System.out.println("-------");

    }

}
