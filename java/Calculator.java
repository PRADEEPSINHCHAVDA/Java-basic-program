import java.util.Scanner;
public class Calculator{
	int x,y,ans;
	void add()
{
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the value of x and y");
	x=obj.nextInt();
	y=obj.nextInt();
	ans=x+y;
	System.out.println("the answer is"+ans);
}
	void sub()
{
	Scanner obj=new Scanner(System.in);
	System.out.println("enter the value of x and y");
	x=obj.nextInt();
	y=obj.nextInt();
	ans=x-y;
	System.out.println("the answer is"+ans);
}
	public static void main(Strings args[])
{
	Scanner obj=new Scanner(System.in);
	Calculator calcObj=new Calculator();
	int choice;
	while(true)
{

	System.in.println("1-----addition");
	System.in.println("2-----subtraction");
	System.in.println("3-----exit");
	System.in.println("Enter the choice");
	choice=obj.nextInt();
	switch(choice)
{
	case 1:calcObj.add();
		break;
	case 2:calcObj.sub();
		break;
	case 3:System.exit(0);

}
}
}
}