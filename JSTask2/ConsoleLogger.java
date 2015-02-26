import java.text.SimpleDateFormat;
import java.util.Date;

public class ConsoleLogger implements IMyLogger{

	@Override
	public void log(int level, String message) {
		Date date = new Date();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd'T'hh:mm:ssZ");
		
		if(level == 1){
			System.out.println("INFO::" + ft.format(date) + "::" + message);
		} else if(level == 2){
			System.out.println("WARNING::" + ft.format(date) + "::" + message);
		} else {
			System.out.println("PLSCHECKFFS::" + ft.format(date) + "::" + message);
		}
		
	}

}
