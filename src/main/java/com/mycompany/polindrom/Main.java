/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.polindrom;

import java.util.Scanner;

/**
 *
 * @author irfan
 */
public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(100);
        Queue queue = new Queue(100);
        Scanner sc = new Scanner(System.in);
        String kelime;

        System.out.println("kelime gir: ");
        kelime = sc.nextLine();
        int n = kelime.length();

        char[] harfler = kelime.toCharArray();
        int i = 0;
        while (i < n) {
            stack.push(harfler[i]);
            queue.enqueue(harfler[i]);
            i++;

        }
        boolean sonuc = true;

        while (!stack.isEmpty()) {
            if (stack.pop() != queue.dequeue()) {
                sonuc = false;
                break;

            }

        }
        if (sonuc) {
            System.out.println(kelime + " polindromdur");
        } else {
            System.out.println(kelime + " polindrom degildir");

        }

    }

}
