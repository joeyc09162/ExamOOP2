import java.io.*;
public class Question2{
	public static void main(String[] args)	throws IOException{
		//txtCopy("Source.txt", "Dest.txt");
		//editFile("Dest.txt");
		//updateFile("Dest.txt");
		int i;
		FileReader f=new FileReader("Source.txt");
		BufferedReader b=new BufferedReader(f);
		while((i=b.read())!=-1){
			System.out.println((char)i);
		}
		b.close();
	}
}
