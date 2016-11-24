import java.io.*;

public class Cp{
	public static void main(String...args){
		Cp copy = new Cp();
		copy.run(args);
	}
	
	private void run(String[] args){
		if(args.length != 2){
			System.out.println("You must provide two arguments.");
			return;
		}
		
		File source = new File(args[0]);
		File destination = new File(args[1]);	
		
		if(!isSourceValid(source)){
			return;
		}
			
		overwrite(source, destination);	
			
	}
	
	private boolean isSourceValid(File source){
		if(!source.exists()){
			System.out.println("Source file doesn't exist");
			return false;
		}
		
		if(source.isDirectory()){
			System.out.println("Source file is a directory");
			return false;
		}
		
		return true;
	}
	
	private void overwrite(File source, File destination){
		if(!confirmOverWrite(destination))
			return;
		
		try(BufferedReader in = new BufferedReader(new FileReader(source));
			PrintWriter out = new PrintWriter(destination)
		){
			String buffer;
			while((buffer = in.readLine()) != null){
				out.write(buffer);
                out.println();
			}
			
			System.out.println("File copy successful");
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	private boolean confirmOverWrite(File destination){
		if(destination.exists() && !destination.isDirectory()){
			System.out.println(String.format("Do you wish to overwrite %s? (Y/N)",destination.getName()));
			String response = System.console().readLine();

			if(response.toUpperCase().equals("Y"))
				return true;
			
			return false;
		}
		
		try{
			destination.createNewFile();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		return true;
	}
	
}