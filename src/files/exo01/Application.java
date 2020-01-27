package files.exo01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Application {

	private static String fileSizeInMiB(File file) {
		return (double) file.length() / (1024 * 1024) + " MiB";
	}

	private static String fileSizeInKiB(File file) {
		return (double) file.length() / (1024) + " kiB";
	}

	private static String fileSizeInByte(File file) {
		return (double) file.length() + "byte";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Scanner scan = new Scanner(System.in);
			System.out.println();
			System.out.println("-----lyric store----");
			System.out.println();
			System.out.print("titre de la chanson : ");
			String title = scan.nextLine();
			String filename = title + ".lyrics.txt";
			File file = new File(filename);
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			System.out.println("paroles (CR termine le process) :");
			String lines;
			do {
				lines = scan.nextLine();
				if ( ! lines.isEmpty() ) {
					bw.write(lines);
					bw.newLine();
					bw.flush();
				}
			} while (! lines.isEmpty());
			bw.close();
			
			System.out.println();
			System.out.println("-----lyric store----");
			System.out.println();
			System.out.println("Les paroles de la chanson "+title+" sont :");
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
				
			}
			br.close();
			scan.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}