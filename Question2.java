import java.io.*;
public class Question2{
	public static void main(String[] args){
		txtCopy("Source.txt", "Dest.txt");
		editFile("Dest.txt");
		updateFile("Dest.txt");
	}
	public static void txtCopy(String a,String b) {
		FileReader fr;
		FileWriter fw;
		BufferedReader bf;
		String data ="";
		
		try{
			fr = new FileReader(a);
			bf = new BufferedReader(fr); 
			fw = new FileWriter(b);
			while((data=bf.readLine())!=null) {
				fw.write(data);
			}
			fr.close();
			fw.close();
		} catch(IOException e) {
			System.out.println(e);
		}
		
	}
}