import java.util.Scanner;

public class Calculator{
	
	
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
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int first = Input.getFirst(scanner);
		int result = first;
			while(true) {
				String symbol = Input.getSymbol(scanner);
					if(symbol.equals("quit")) {
							System.out.println("종료");
								break;	
										}
						int second = Input.getSecond(scanner);
		
			result = calculate(result,second,symbol);
			
		Output.print(result);
		}
	}
}