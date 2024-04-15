package com.java.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class WriterFile {

	public static void main(String[] args) throws IOException {

		String filePath = "E:\\java doc\\Anilfile.txt";
		FileWriter fw = new FileWriter(filePath);
		BufferedWriter bw = new BufferedWriter(fw);

		bw.write("This is the file for write a text file");
		bw.newLine();
		bw.write("new line for write somethings");
		bw.flush();
		bw.close();

		FileReader fr = new FileReader(filePath);
		BufferedReader br = new BufferedReader(fr);
		String str = br.readLine();
		while (str != null) {
			System.out.println(str);
			str = br.readLine();
		}
		br.close();

	}
}
