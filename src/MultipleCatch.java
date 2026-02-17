import java.util.Scanner;

public class MultipleCatch {
    
       public static void main(String args[])
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter no of elements in array");
	int N=sc.nextInt();
	int arr[]=new int [N];
	System.out.println("Enter the elements of the array");
	for(int i=0;i<N;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("Index enter");
	int index=sc.nextInt();
	System.out.println("Enter divisor");
	int divisor=sc.nextInt();
	try{
		int z=arr[index]/divisor;
	}
	catch (ArithmeticException e)
        {
            System.out.println("Divide by zero error");
        }
	catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println("Invalid index");
	}
	}
    
}
