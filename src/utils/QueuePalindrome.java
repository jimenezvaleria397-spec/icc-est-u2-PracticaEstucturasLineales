package utils;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class QueuePalindrome {
    public boolean isPalindrome(String text){
        Queue<Character> cola = new LinkedList<>();
        Stack<Character> pila = new Stack<>();
        for (char letra: text.toCharArray()){
            cola.offer(letra);
            pila.push(letra);
        }
        while (!cola.isEmpty()){
            char desdeCola = cola.poll();
            char desdePila = pila.pop();
        }
        }
        
    return true;
    }
    
}
