import java.util.Scanner;

public class Input {
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
}
