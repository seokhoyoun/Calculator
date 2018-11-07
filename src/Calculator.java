import java.util.Scanner;

public class Calculator{
	
	static int getFirst(Scanner scanner) {
		System.out.print("1) ");
		int first = scanner.nextInt();
		return first;
	}
	
	static int getSecond(Scanner scanner) {
		System.out.print("2) ");
		int second = scanner.nextInt();
		return second;
	}
	
	static String getSymbol(Scanner scanner) {
		System.out.print("연산기호) ");
		String symbol = scanner.next();
		
			return symbol;
		
	}
	
	static int calculate(int first, int second, String symbol) {
		int result = 0;
		
			if(symbol.equals("+"))
				result = first + second;
			else if(symbol.equals("-"))
				result = first - second;
			else if(symbol.equals("*"))
				result = first * second;
			else if(symbol.equals("/"))
				result = first / second;
			else {
				System.out.println("사용할 수 없는 기호입니다.");
			}
				return result;
			
			
		
		
		
	}
	
	static void print(int result) {
		System.out.println("결과 : " + result);
		
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int first = getFirst(scanner);
		int result = first;
			while(true) {
				String symbol = getSymbol(scanner);
					if(symbol.equals("quit")) {
							System.out.println("종료");
								break;	
										}
						int second = getSecond(scanner);
		
			result = calculate(result,second,symbol);
			
		print(result);
		}
	}
}