//WAP to print your identity card details using scanner class
import java.util.Scanner;
class student 
{
void display()
{
Scanner sc=new Scanner(System.in);
System.out.println("This is for details of your id card from UPES");
System.out.println("enter your name:");
String name=sc.nextLine();
System.out.println("Enter the school you belong");
String school=sc.nextLine();
System.out.println("Enter the program name ");
String program=sc.nextLine();
System.out.println("enter the batch year");
String batch=sc.nextLine();

System.out.println("Your name is \n"+name+"+from the"+school+"attending the program"+program+"for the batch"+batch);
}
public static void main(String args[])
{
student a=new student();
a.display();
}
}

