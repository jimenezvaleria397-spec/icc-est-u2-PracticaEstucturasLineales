package utils;

import java.util.Stack;

public class StackSorter {
    public void sorStack(Stack<Integer> stack){
        Stack<Integer> auxiliar = new Stack<>();
        while(!stack.isEmpty()){
            int valor= stack.pop();
            while(!auxiliar.isEmpty() && auxiliar.peek() < valor){
                stack.push(auxiliar.pop());
            }
            auxiliar.push(valor);
        }
        while(!auxiliar.isEmpty()){
            stack.push(auxiliar.pop());
        }
    }
    
}
