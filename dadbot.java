import java.util.Scanner;
import java.lang.Math;
public class dadbot
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String var = keyboard.nextLine();
		String str = new String(var);

		if (var.contains("Im"))
		  {
		  String array1[]= str.split("Im");
		  String Joke = array1[1];
     	  System.out.println("Hi" + Joke + ", I'm Dadbot!");
		  }

    if (var.contains("I'm"))
		  {
		  String array1[]= str.split("I'm");
		  String Joke = array1[1];
     	  System.out.println("Hi" + Joke + ", I'm Dadbot!");
		  }

    if (var.contains("im"))
		  {
		  String array1[]= str.split("im");
		  String Joke = array1[1];
      	  System.out.println("Hi" + Joke + ", I'm Dadbot!");
		  }

    if (var.contains("i'm"))
		  {
		  String array1[]= str.split("i'm");
		  String Joke = array1[1];
      	  System.out.println("Hi" + Joke + ", I'm Dadbot!");
		  }

    if (var.contains("I am"))
		  {
		  String array1[]= str.split("I am");
		  String Joke = array1[1];
          System.out.println("Hi" + Joke + ", I'm Dadbot!");
		  }

    if (var.contains("i am"))
		  {
		  String array1[]= str.split("i am");
		  String Joke = array1[1];
   	      System.out.println("Hi" + Joke + ", I'm Dadbot!");
		  }

    if (var.contains("I AM"))
		  {
		  String array1[]= str.split("I AM");
		  String Joke = array1[1];
     	  System.out.println("Hi" + Joke + ", I'm Dadbot!");
		  }

    if (var.contains("IM"))
		  {
		  String array1[]= str.split("IM");
		  String Joke = array1[1];
      	  System.out.println("Hi" + Joke + ", I'm Dadbot!");
		  }

    if (var.contains("I'M"))
		  {
		  String array1[]= str.split("I'M'");
		  String Joke = array1[1];
      	  System.out.println("Hi" + Joke + ", I'm Dadbot!");
		  }
	}
}