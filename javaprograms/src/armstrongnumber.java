import java.util.Scanner;

public class armstrongnumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num =sc.nextInt();//
		int originalnum=num;
		int sum=0;
		while(num!=0){
			int LastDigit=num%10;
			sum+=LastDigit*LastDigit*LastDigit;
			num=num/10;
		}
		if (originalnum==sum) {
			System.out.println("the given number" +sum + " is armstrong");
		}else {
			System.out.println("the given number is not armstrong");
		}
		sc.close();
		
	}

}
