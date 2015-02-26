import java.util.Scanner;


public class Example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int level = 0;
		String message = "";
		
		while (level < 1 || level > 3) {
			System.out.println("Input loggin level and message: ");
			level = sc.nextInt();
			message = sc.next();
		}	
		
		ConsoleLogger console = new ConsoleLogger();
		console.log(level, message);
		
		FileLogger fileLogger = new FileLogger();
		fileLogger.log(level, message);
	}

}
