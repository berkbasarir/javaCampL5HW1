package javaCampL5HW1.core.loggers;

public class EmailLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Email gönderildi: " + message);
		
	}

}
