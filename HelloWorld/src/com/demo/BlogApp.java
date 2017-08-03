package com.demo;
import java.util.Scanner;
public class BlogApp {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in); 
        System.out.println("ÇëÊäÈë×Ö·û´®£º"); 
        while (true) { 
                String line = s.nextLine(); 
                if (line.equals("exit")) break; 	//ÊäÈë exit ºó·½¿É½áÊø
                System.out.println(">>>" + line); 
        } 
	}
}
