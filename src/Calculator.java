import java.util.Scanner;

public class Calculator {
	public static void main(String [] args) {
		System.out.print("첫 번째값을 입력하세요 : ");
			
		Scanner scanner = new Scanner(System.in);
		int first = scanner.nextInt();
		
		System.out.println("첫 번째 값 : " + first);
		
		int result = first;
	
		while(true) {
		
		System.out.print("[ +, -, *, / , quit] 중 하나를 선택하세요 : ");
		
		String symbol = scanner.next();
		
		if("quit".equals(symbol)) {
			System.out.println("종료 되었습니다.");
			break;
		}
		System.out.print("다음 값을 입력하세요 : ");
		
		int second = scanner.nextInt();
		
		System.out.println("다음 값 : "+ second);
		
		
		
		if("+".equals(symbol)) {
			System.out.println("덧셈 결과 : "+ (result+second));
			result = result+second; }
		else if("-".equals(symbol))	{
			System.out.println("뺄셈 결과 : "+ (result-second));
			result = result-second; }
		else if("*".equals(symbol))	{
			System.out.println("곱셈 결과 : "+ (result*second));
			result = result*second;}
		else if("/".equals(symbol)) {
			System.out.println("나누기 결과 : "+ (result/second));
			result = result/second;}
		else
			System.out.println("사용할 수 없는 연산기호입니다.");
			
		}
	}
}
