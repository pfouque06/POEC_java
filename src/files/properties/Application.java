package files.properties;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;

public class Application {

	private static String fileSizeInMiB(File file) {
		return (double) file.length() / (1024* 1024) + " MiB";
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
			System.out.println();
			System.out.println("-----file properties----");
			File file = new File("monfichier.txt");
			
			if (file.exists()) 
				System.out.println("- le fichier "+file+" existe");
			else
				System.out.println("- le fichier "+file+" existe");

			if (file.isDirectory())
				System.out.println("- le File "+file.getName()+" est un répertoire");
			else
				System.out.println("- le File "+file.getName()+" n'est pas un répertoire");
			
			if (file.isFile()  )
				System.out.println("- le File "+file.getName()+" est un fichier");
			else
				System.out.println("- le File "+file.getName()+" n'est pas un fichier");
			
			if (file.isAbsolute()  )
				System.out.println("- le path de File "+file.getName()+" est absolu");
			else {
				System.out.println("- le path de File "+file.getName()+" est relatif au repertoire: " + file.getAbsolutePath().substring(0, file.getAbsolutePath().lastIndexOf("\\") ));
			}

			URL resource = Application.class.getResource("/");
			String resourceDir = resource.getPath();
			//String resourceDir = this.getClass().getResource("/").getPath();
			System.out.println("- le classPath: "+ resourceDir.substring(0, resourceDir.lastIndexOf("/bin")));
			System.out.println("- le working directory : "  + new File("").getAbsolutePath());

			System.out.println();
			System.out.println("taille du fichier : ");
			System.out.println("- " + fileSizeInByte(file));
			System.out.println("- " + fileSizeInKiB(file));
			System.out.println("- " + fileSizeInMiB(file));
			
			System.out.println();
					
			FileReader fileR = new FileReader(file);
			int car;
			while ((car = fileR.read())!= -1 )
				System.out.print((char) car);
			System.out.println();
			fileR.close();
			
			System.out.println();
			System.out.println("-----bufferedreader----");
			BufferedReader br = new BufferedReader(new FileReader(new File("monautrefichier.txt")));
			String line;
			while ((line = br.readLine()) != null) 
				System.out.println(line);
			br.close();

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	}
