package example;

import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class HelloWorld {

	protected static void writeFiles(){
		try {
      			FileWriter myWriter = new FileWriter("/tmp/file.txt");
      			myWriter.write("Hello world!");
      			myWriter.close();
    		} catch (IOException e) {
      			System.err.println("An error occurred.");
      			e.printStackTrace();
    		}
		try {
                        FileWriter myWriter = new FileWriter("/tmp/file.xml");
                        myWriter.write("<text>Hello world!</text>");
                        myWriter.close();
                } catch (IOException e) {
                        System.err.println("An error occurred.");
                        e.printStackTrace();
                }
		try {
                        FileWriter myWriter = new FileWriter("/tmp/file.json");
                        myWriter.write("{ \"text\": \"Hello world!\"}");
                        myWriter.close();
                } catch (IOException e) {
                        System.err.println("An error occurred.");
                        e.printStackTrace();
                }
		try {
                        FileWriter myWriter = new FileWriter("/tmp/file.csv");
                        myWriter.write("row,content\n");
			myWriter.write("1,Hello world!\n");
                        myWriter.close();
                } catch (IOException e) {
                        System.err.println("An error occurred.");
                        e.printStackTrace();
                }

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world");

		writeFiles();
	}

}
