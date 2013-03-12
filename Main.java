package .geometria;
import java.io.*;


public class Main {
	public static void main( String args[] ){
		byte valorlido[] = new byte[200];
		try{
			System.in.read( valorlido );
			System.out.write( valorlido );
		} catch( IOException e ){
			System.out.println("Exceção: " + e );
		}
	}
}
