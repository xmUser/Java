package com.demo;

public class Post {
	private long id;
    private String title;
    private String content;
    
    public static int count = 0;
    
    public static int getCount(){
        return count;
    }
    
    public Post(String title, String content) {
    	count++;
    	this.title = title;
        this.content = content;
        this.id = count;
        System.out.println("Post.id: " + this.id);
        System.out.println("Post.title: " + this.title);
        System.out.println("Post.content: " + this.content);
    }
}
