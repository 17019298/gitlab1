package JavaIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;

//Reading input from two files and storing it in a third file
public class Lab_Q2 {
public static void main(String[] args) throws FileNotFoundException, IOException {

        try( FileReader r= new FileReader("one.txt"))
		{
		
		 char c[]= new char[22];
		   r.read(c); 
		   FileReader r1= new FileReader("data.txt");
		   char c1[]= new char[28];
			  r1.read(c1);
		  FileWriter w= new FileWriter("newData.txt"); // create a new file if it doesnot exist
		  w.write(c);
		   w.write(c1); //write array data to file 
		   System.out.println(c);
		   System.out.print(c1);
		   w.flush(); // push data to file 
	
}}}
