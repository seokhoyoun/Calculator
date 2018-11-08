import java.util.Scanner; 

public class StringCalculator {
	public static void main(String[] args) {
		System.out.print("값을 입력하세요 : " );
		Scanner scanner = new Scanner(System.in);
		String value = scanner.nextLine();
		
		System.out.print("입력 값 : " + value);
		String[] values = value.split(" "); 
		int first = Integer.parseInt(values[0]);
		int result = 0;
		int i = 1;
		
				while(i<values.length) {
					String symbol = values[i];
					int second = Integer.parseInt(values[i+1]);
				result = Calculator.calculate(result, second, symbol);
				i = i + 2;
				}
			
	}
				
} 