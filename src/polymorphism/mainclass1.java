package polymorphism;

class Animal{
	void noise()
	{
		System.out.println("some noise");
	}
}
class cat extends Animal
{
	void noise()
	{
		System.out.println("meow meow");
	}
}
class dog extends Animal
{
	void noise()
	{
		System.out.println("bow bow");
	}
}
class snake extends Animal
{
	void noise()
	{
		System.out.println("bus bus");
	}
}
class stimulator
{
	static void ansim(Animal a1)
	{
		a1.noise();
	}
}
public class mainclass1 {
      public static void main(String[] args)
      {
    	  cat c1=new cat();
    	  dog d1=new dog();
    	  snake s1=new snake();
    	  
    	  stimulator.ansim(c1);
    	  stimulator.ansim(d1);
    	  stimulator.ansim(s1);
      }
}
