



public class Human {
	String name = null;
	 private int age;
	private int height;
	
	public Human()
	{
		age = 0;
		name = "No name";
		height = 0;
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
	
	
}
