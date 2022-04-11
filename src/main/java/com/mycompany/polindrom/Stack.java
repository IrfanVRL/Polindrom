/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polindrom;

/**
 *
 * @author irfan
 */
public class Stack {
    Node top;
    int size;
    int cnt;

    public Stack(int size) {
        this.size = size;
        cnt = 0;
        top = null;
    }
    
    void push(char ch){
        if (!isFull()) {
            Node newNode = new Node(ch);
            if (isEmpty()) {
                top = newNode;
            }else{
               newNode.nextNode = top;
                top = newNode;
            }
            cnt++;
            
            
        }
    }
    char pop(){
        if (!isEmpty()) {
            char harf = top.harf;
            top = top.nextNode;
            cnt--;
           return harf;
        }
        else{
            return '-';
        }
   
    }
    
    boolean isEmpty(){
        return cnt ==0;
    }
    boolean isFull(){
        return cnt == size;
    }
    
    
    
    
    
}
