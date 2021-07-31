import java.util.scanner;
public class Sample{
 public static void main(Sting args[])
{
scanner obj=new scanner(System.in);
int choice;
while(true)
{
  System.out.println("1-----punjabi");
  
  System.out.println("2-----gujrati");

  System.out.println("3-----south indian");

  System.out.println("4-----exit");
   
   System.out.println("Enter your choice");
choice=obj.nextInt();
switch(choice)
{
 case 1:System.out.println("you have selected punjabi");
        break;
case 2:System.out.println("you have selected gujrati");
        break;
case 3:System.out.println("you have selected south indian");
        break;
case 4:System.exit(0);
        break;

}
}
}