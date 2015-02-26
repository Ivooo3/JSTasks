import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileLogger implements IMyLogger{

	@Override
	public void log(int level, String message) {
		File file = new File("testFile");
		Date date = new Date();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd'T'hh:mm:ssZ");
		try {
			file.createNewFile();
			PrintWriter write = new PrintWriter(file);
			if(level == 1){
				write.println("INFO::" + ft.format(date) + "::" + message);
			} else if(level == 2){
				write.println("WARNING::" + ft.format(date) + "::" + message);
			} else {
				write.println("PLSCHECKFFS::" + ft.format(date) + "::" + message);
			}
			write.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
