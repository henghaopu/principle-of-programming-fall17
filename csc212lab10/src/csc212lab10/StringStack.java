/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csc212lab10;

/**
 *
 * @author hpu
 */
public class StringStack {
    
    String[] stack;
    // be used to keep track of the array index pointing to the top of the stack
    int top; 
    
    public StringStack(int maxSize) {
        stack = new String[maxSize];
        // -1: no elements
        top = -1;
    }
    
    public boolean isEmpty() {
        return top == -1;
    }
    
    public boolean isFull() {
        return top == (stack.length - 1);
    }
    
    public void push(String s) {
        if (!this.isFull()) {
            // increment the top index
            top++;
            // assign the parameter s to the slot pointed to by the new top index
            stack[top] = s;
        }
    }
    
    public String peek() {
        if (!this.isEmpty()) {
            return stack[top];
        } else {
            return null;
        }
    }
    
    public String pop() {
        if (!this.isEmpty()) {
            // real programmer do this!
            String temp = stack[top--];
            return temp;
        } else {
            return null;
        }
    }
    
}
