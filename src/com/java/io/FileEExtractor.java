package com.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileEExtractor {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String filePath1 = "E:\\java doc\\java program\\java8\\file1.txt";
		String filePath2 = "E:\\java doc\\java program\\java8\\file2.txt";
		String filePath3 = "E:\\java doc\\java program\\java8\\file3.txt";

		PrintWriter fr3 = new PrintWriter(filePath3);
		BufferedWriter br3 = new BufferedWriter(fr3);

		FileReader fe1 = new FileReader(filePath1);
		BufferedReader br1 = new BufferedReader(fe1);

		FileReader fe2 = new FileReader(filePath2);
		BufferedReader br2 = new BufferedReader(fe2);

		String strfile1 = br1.readLine();
		String strfile2 = br2.readLine();

		while ((strfile1 != null) || (strfile2 != null)) {
			if (strfile1 != null) {
				fr3.println(strfile1);
				strfile1 = br1.readLine();
			}

			if (strfile2 != null) {
				fr3.println(strfile2);
				strfile2 = br2.readLine();
			}
		}

		fr3.flush();
		fr3.close();
		br2.close();
		br3.close();
	}

}
