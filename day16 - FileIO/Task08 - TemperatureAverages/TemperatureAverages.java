import java.io.*;

public class TemperatureAverages {

	private double sumOfLineAverages = 0;
	private int lineCount = 0;
	private double fileAverage = 0;
	
	public static void main(String[] args){
	
		TemperatureAverages testTemp = new TemperatureAverages();
		
		testTemp.run();
		
	}
	
	public void run(){
		
		File file = new File("testTable.csv");
		readLinesFromTable(file);
		System.out.println(String.format("The avagerage for the while table is: %.2f", this.fileAverage));
		
	}
	
	public void readLinesFromTable(File file){
		try (BufferedReader reader = new BufferedReader(new FileReader(file))){
			String line;
			while((line = reader.readLine()) != null){
				System.out.println(getLineAverage(line));
			}
		} catch (FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	public String getLineAverage(String line){
		String[] values = splitLine(line);
		try {
			return String.format("Average of line = %.2f", getAverage(values));
		} catch (NumberFormatException e){
			return "Error reading input from the table";
		}	
	}
	
	public String[] splitLine (String line){
		String[] splitLine = line.trim().split(",");
		return splitLine;
	}

	public double getAverage(String[] values){
		double total = 0;
		for(String value : values){
			total += getNumberValue(value);
		}
		double average = total/values.length;	
		
		updateFileAverage(average);
		return average;
	}
	
	public int getNumberValue(String value){
		return Integer.parseInt(value.trim());
	}
	
	public void updateFileAverage(double itemTotal){
		this.lineCount++;
		this.sumOfLineAverages += itemTotal;
		this.fileAverage = this.sumOfLineAverages / this.lineCount;
	}
}