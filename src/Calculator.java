import java.util.Scanner;

public class Calculator {
	public static void main(String [] args) {
		System.out.print("첫 번째값을 입력하세요 : ");
			
		Scanner scanner = new Scanner(System.in);
		int first = scanner.nextInt();
		
		System.out.println("첫 번째 값 : " + first);
	
		System.out.print("두 번째 값을 입력하세요 : ");
		int second = scanner.nextInt();
		
		System.out.println("두 번째 값 : "+ second+ "\n");
		
		
		
		System.out.println("덧셈 결과 : "+ (first+second));
		System.out.println("뺄셈 결과 : "+ (first-second));
		System.out.println("곱셈 결과 : "+ (first*second));
		System.out.println("나누기 결과 : "+ (first/second));
	}
}
