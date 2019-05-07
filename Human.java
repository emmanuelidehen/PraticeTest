
import java.io.*;
import java.awt.print.*;
import java.util.stream.*;
import java.util.function.*;


public class Human {
	String name = null;
	int age;
	int height;
	
	public Human()
	{
		
	}
	
	public void spaek()
	{
		System.out.println("Hello my name is "+ name);
		System.out.println("my age is "+ age);
		System.out.println("I am  "+ height + " cm tall");
	}

	public void jump()
	{
		System.out.println("Hey look I can jump ");	
	}
	public void eating()
	{
		System.out.println("Hey "+ name + "look i'm eating");
	}
	
	public static void main() {
		
		Human emma = null;
		
		
		emma.age = 24;
		emma.height = 100;
		emma.name = "emmanuel";
		
		emma.spaek();
		emma.jump();
		emma.eating();
		
		
		
		
	}
	
}
