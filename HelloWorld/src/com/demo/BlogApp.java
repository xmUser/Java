package com.demo;
import java.util.Scanner;
public class BlogApp {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in); 
        System.out.println("请输入字符串："); 
        while (true) { 
                String line = s.nextLine(); 
                if (line.equals("exit")) break; 	//输入 exit 后方可结束
                System.out.println(">>>" + line); 
        } 
	}
}
