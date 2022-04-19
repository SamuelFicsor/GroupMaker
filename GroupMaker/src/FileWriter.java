import java.io.*;

public class FileWriter 
	{
    public static void main(String [] args) 
    	{
        // The name of the file to open.
        String file = "groups.txt";

        try {
            // Assume default encoding.
            FileWriter fileWriter = new FileWriter(file, true);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Note that write() does not automatically
            // append a newline character.
            bufferedWriter.write("Hello there,");
            bufferedWriter.write(" here is some text.");
            bufferedWriter.newLine();
            bufferedWriter.write("We are writing");
            bufferedWriter.write(" this text to the file.");

            // Always close files.
            bufferedWriter.close();
        	}
        
        catch(IOException ex) 
        	{
            System.out.println("Error writing to file '" + file + "'");
            // Or we could just do this:
            // ex.printStackTrace();
        	}
    	}
	}

    © 2022 GitHub, Inc.

    Terms
    Privacy
