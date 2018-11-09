import java.util.Scanner;

class StringCalculator{
	public static void main(String[] args) {
		System.out.println("값을 입력 하세요.");
		Scanner scanner = new Scanner(System.in);
		String value = scanner.nextLine();
		System.out.println("입력 값 : " + value);
		
		String[] values = value.split(" ");
		int first = Integer.parseInt(values[0]);
		
		int result = first;
		for(int i = 1; i < values.length; i = i + 2) {
			String symbol = values[i];
			System.out.println("연산 기호 : " + symbol);
			
			int second = Integer.parseInt(values[i+1]);
			System.out.println("입력 값 : " + second);
			
		
			if(symbol.equals("+")) {
				result +=  second;
				System.out.println("결과 : "+ result);
			}
			else if(symbol.equals("-")) {
				result -= second;
				System.out.println("결과 : "+ result);
				
			}
			else if(symbol.equals("*")) {
				result *= second;
				System.out.println("결과 : "+ result);
				
			}
			else if(symbol.equals("/")) {
				result /= second;
				System.out.println("결과 : "+ result);
				
			}
			else
				System.out.println("사용할 수 없는 기호입니다.");
				
		}
		
		
	}
}