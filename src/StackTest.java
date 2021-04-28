//jj904
//Stack and Queue
//Stack (implement)_LIFO
//Supply:
// L pop()_bring the data insert at last and remove
// L push()_stack new data on the top
// L peek()_see the last data
// L isEmpty_check if Stack is empty


package Stack_Queue;
import java.util.EmptyStackException;

class Stack<T>{
    class Node<T>{
        private T data;
        private Node<T> next;

        public Node(T data){
            this.data = data;
        }
    }
    private Node<T> top;
    public T pop(){
        if(top == null){
            throw new EmptyStackException();
        }
        T item = top.data;
        top = top.next;
        return item;
    }
    public void push(T item){
        Node<T> t = new Node<T>(item);
        t.next = top;
        top = t;
    }
    public T peek(){
        if(top == null){
            throw new EmptyStackException();
        }
        return top.data;
    }

    public boolean isEmpty(){
        return top == null;
    }
}

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.peek());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
        System.out.println(s.pop());
        System.out.println(s.isEmpty());
    }
}

