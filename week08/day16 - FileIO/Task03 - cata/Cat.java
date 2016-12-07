import java.io.*;

public class Cat {

	public static void main (String [] args){	
		Cat testCat = new Cat();
		if(args.length < 1){
            System.out.println("No arguments entered");
            return;
		}

        testCat.run(args[0]);
	}
	
	public void run(String filePath){	
		File file = new File(filePath);

        try{
            if(fileIsValid(file))
                printFileContents(file);
        }	
        catch(IOException e)	{
            System.out.println(e.getMessage());
        }
	}

    private boolean fileIsValid(File file) throws IOException{
        if(!file.exists())
            throw new IOException(String.format("File %s does not exist.", file.getName()));        

		if(file.isDirectory())
            throw new IOException("Directory already exists");
		
        return true;
    }
	
	public void printFileContents (File file){
		try(BufferedReader reader = new BufferedReader(new FileReader(file))){
			printBufferedOutput(reader);
		} 
        catch (FileNotFoundException e){
			e.printStackTrace();
		} 
        catch (IOException e){
			e.printStackTrace();	
		}
	}

    private void printBufferedOutput(BufferedReader reader) throws IOException{
        String output;
        while((output = reader.readLine()) != null){
            System.out.println(output);
        }
    }
}