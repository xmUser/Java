package com.demo;
import java.util.Scanner;
public class BlogApp {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in); 
        System.out.println("�������ַ�����"); 
        while (true) { 
                String line = s.nextLine(); 
                if (line.equals("exit")) break; 	//���� exit �󷽿ɽ���
                System.out.println(">>>" + line); 
        } 
	}
}
