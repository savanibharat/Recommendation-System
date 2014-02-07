package com.MahoutInAction.Chapter1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author Savani Bharat
 * 
 */
public class DataConvert {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader(
				"src/com/MahoutInAction/Chapter1/rawdata.data"));
		BufferedWriter bw = new BufferedWriter(new FileWriter(
				"src/com/MahoutInAction/Chapter1/ProcesedData.csv"));

		processData(br, bw);

	}

	private static void processData(BufferedReader br, BufferedWriter bw)
			throws IOException {

		String line;

		try {

			while ((line = br.readLine()) != null) {
				if (line.contains(" ")) {
					System.out.println(line);
					String values[] = line.split(" ", -1);
					bw.write(values[0] + "," + values[1] + "," + values[2]
							+ "\n");
				}
			}
		}

		catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			br.close();
			bw.close();
		}
	}
}
