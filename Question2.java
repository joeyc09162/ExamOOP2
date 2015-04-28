import java.io.*;
import java.util.*;

public class Question2{
	public static void main(String[] args){
		txtCopy("Source.txt", "Dest.txt");
		editFile("Source.txt");
		updateFile("Dest.txt");
	}
	public static void editFile(String content){
		
	try{

		int  u;
		String line;
		String context;
		String context2="";
		String line2;
		FileReader fw=new FileReader(content);
		BufferedReader br=new BufferedReader(fw);
		while((context=br.readLine())!=null)
			context2+=context;
		context2=context2.replace("a", "");
		context2=context2.replace("e", "");
		context2=context2.replace("i", "");
		context2=context2.replace("o", "");
		context2=context2.replace("u", "");


			System.out.print(context2);

		
	}catch(Exception e){
		System.out.println(e.toString());
	}
	}

}

