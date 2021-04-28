//jj904
//Stack and Queue
//Find MinValue through Stack
//Supply: push(), pop(), min()

import java.util.Stack;

class NodeWithMin {
    int value;
    int min;

    NodeWithMin(int v, int min){
        value = v;
        this.min = min;
    }
}

class StackWithMin extends Stack <NodeWithMin>{
    public int min(){
        if(this.isEmpty()){
            return Integer.MAX_VALUE;
        }else{
            return peek().min;
        }
    }
    public void push(int value){
        int newMin = Math.min(value, min());
        super.push(new NodeWithMin(value, newMin));
    }
}

public class Stack_Min {
    public static void main(String[] args) {
        StackWithMin stack = new StackWithMin();
        stack.push(3);
        stack.push(5);
        stack.push(1);
        stack.push(2);
        System.out.println("min value: " + stack.min());
        System.out.println("pop: " + stack.pop().value);
        System.out.println("pop: " + stack.pop().value);
        System.out.println("min value: " + stack.min());
    }
}

