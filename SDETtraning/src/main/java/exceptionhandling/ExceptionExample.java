package exceptionhandling;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;

public class ExceptionExample {

	/* Exception is recoverable
	 * Error is unrecoverable
	 * All exception are java classes
	 * All classes are inside java.lang
	 * Exception -> checked exception / runtime exception
	 * */
	public ExceptionExample() throws MalformedURLException{

		URL url;
		try {
			url = new URL("http://www.google.com");
			//URLConnection connection = url.openConnection();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

	}
	public static void main(String[] args) throws CustomException  {
		try {
			ExceptionExample obj=new ExceptionExample();
		} catch (MalformedURLException e) {
			throw new CustomException("invlid URL");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}