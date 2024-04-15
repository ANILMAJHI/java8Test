import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMarge {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		String filePath1 = "E:\\java doc\\java program\\java8\\file1.txt";
		String filePath2 = "E:\\java doc\\java program\\java8\\file2.txt";
		String filePath4 = "E:\\java doc\\java program\\java8\\file4.txt";
		
		PrintWriter pw=new PrintWriter(filePath4);
		BufferedWriter bw=new BufferedWriter(pw);
		
		FileReader fr1=new FileReader(filePath1);
		BufferedReader br1=new BufferedReader(fr1);
		FileReader fr2=new FileReader(filePath2);
		BufferedReader br2=new BufferedReader(fr2);
		
		String line1=br1.readLine();
		String line2=br2.readLine();
		
		while(line1!=null)
		{
			pw.println(line1);
			line1=br1.readLine();
			
		}
		while(line2!=null)
		{
			pw.println(line2);
			line2=br2.readLine();
			
		}
		pw.flush();
		pw.close();
		br1.close();
		br2.close();
		
	}

}
