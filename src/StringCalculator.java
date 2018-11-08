import java.util.Scanner; 

public class StringCalculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("값을 입력하세요 : " );
		String value = scanner.nextLine();
		String[] values = value.split(" "); 
		
		System.out.println("입력 값 : " + value);
		int first = Integer.parseInt(values[0]);
		int result = first;
		int i = 1;
		
				while(i<values.length) {
					String symbol = values[i];
					int second = Integer.parseInt(values[i+1]);
				result = Calculator.calculate(result, second, symbol);
				i = i + 2;
				}
				Output.print(result);
			
	}
				
} 