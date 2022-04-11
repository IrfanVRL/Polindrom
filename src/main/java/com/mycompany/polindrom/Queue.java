/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polindrom;

/**
 *
 * @author irfan
 */
public class Queue {
    Node front;
    Node rear;
    int cnt;
    int size;

    public Queue(int size) {
        this.size = size;
        front =null;
        rear = null;
        cnt = 0;
    }
    
    void enqueue(char ch){
        if (!isFull()) {
            Node newNode = new Node(ch);
            if (isEmpty()) {
                front = newNode;
                rear = newNode;
            }else{
                rear.nextNode = newNode;
                rear  = newNode;
            }
            cnt++;
            
        }
    }
    
    char dequeue(){
        if (! isEmpty()) {
            char ch = front.harf;
            front = front.nextNode;
            cnt--;
            return ch;
        }else{
            return'+';
        }
    }
    
    boolean isEmpty(){
        return cnt ==0;
    }
    boolean isFull(){
        return cnt == size;
    }
    
    
    
}
