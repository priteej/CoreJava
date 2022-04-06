import java.util.Scanner;

public class EvenNumber {

	public static void main(String[] args) {
	Scanner input =new Scanner(System.in);
	
	System.out.println("Enter Number n:");
	int n=input.nextInt();
	
	System.out.println("Enven numbers are:");
	
for(int i=0;i<=n;i++)
{
	
	if(i%2==0)
	{
		System.out.println(i);
	}
}
	}

}
