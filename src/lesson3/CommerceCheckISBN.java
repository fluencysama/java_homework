package lesson3;
import java.util.Scanner;

public class CommerceCheckISBN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("请输入ISBN的前几位数");
		Scanner input = new Scanner(System.in);
		
		int num = input.nextInt();
		int num1=num;
		
		int result=0;
		int i=9;
		for(;i>0;i--) {
			result+=i*(num1%10)%11;
			num1/=10;
		}
		
		System.out.printf("%09d",num);
		
		if(result%11==10)
		System.out.printf("X");
		else
		System.out.println(result%11);
		
	}

}
