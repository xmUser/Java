package com.demo;

public class HelloWorld {
	public static void main(String[] args){
		int[] arrNum = {2,44,56,12,345};
		for (int i : arrNum) {
		    System.out.println(i);
		}
		
		Post post = new Post("demo", "��ð���");
		
		int con = Post.getCount();
		System.out.println(post.count);
		
		int n = sumOfNumbers();
		System.out.println(n);
		
		Engine myEngine = new Engine(180);
		
		Car myCar = new Car(0xffffff, 100, myEngine);
		System.out.println(myEngine.power);
	}
	public static int sumOfNumbers() {
	    int sum = 0;
	    for(int i = 0; i <= 100; i++) {
	        sum += i;
	    }
	    return sum;
	}
}
