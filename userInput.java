/**
 * @(#)userInput.java
 *
 *
 * @author 
 * @version 1.00 2017/2/23
 */

import java.io.*;
public class userInput {

    public static int readInt() {
    	DataInputStream z = new DataInputStream(System.in);
    	String g;
    	try{
    		g=z.readLine();
    	}
    	catch(IOException e){g="0";}
    	
    	int g2 = Integer.parseInt(g);
    	
    	return g2;
    }
    
    public static float readFloat(){
    	DataInputStream z = new DataInputStream(System.in);
    	String g;
    	try {
    		g=z.readLine();
    	}
    	catch (IOException e){g="0";}
    	
    	float g2 = Float.parseFloat(g);
    	
    	return g2;
    }
    
    public static String readString(){
    	DataInputStream z = new DataInputStream(System.in);
    	String g;
    	try{
    		g=z.readLine();
    	}
    	catch (IOException e){g=" ";}
    	
    	return g;
    }
    
    public static byte readByte(){
    	DataInputStream z = new DataInputStream(System.in);
    	String g;
    	try{
    		g=z.readLine();
    	}
    	catch (IOException e){g="0";}

    	byte g2 = Byte.parseByte(g);

    	return g2;
    	}

    public static short readShort(){
    	DataInputStream z = new DataInputStream(System.in);
    	String g;
    	try{
    		g=z.readLine();
    	}
    	catch (IOException e){g="0";}

    	short g2 = Short.parseShort(g);

    	return g2;
    }

    public static long readLong(){
    	DataInputStream z = new DataInputStream(System.in);
    	String g;
    	try{
    		g=z.readLine();
    	}
    	catch(IOException e){g="0";}

    	long g2 = Long.parseLong(g);

    	return g2;
    }

    public static double readDouble(){
    	DataInputStream z = new DataInputStream(System.in);
    	String g;
    	try{
    		g=z.readLine();
    	}
    	catch(IOException e){g="0";}

    	double g2 = Double.parseDouble(g);

    	return g2;
    }

    public static char readChar(){
    	DataInputStream z = new DataInputStream(System.in);
    	String g;
    	try{
    		g=z.readLine();
    	}
    	catch(IOException e){g=" ";}

    	char g2 = g.charAt(0);

    	return g2;
    }    
    
}