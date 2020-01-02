package exo023;

import java.util.Arrays;
import java.util.Scanner;

public class Exo024_SwapSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// template sentence to convert : "python python is more popular than java java";
		Scanner scan = new Scanner(System.in);
		String buffer = "", str1 = "", str2 = "";
		String[][] swapStrings = {{"python", "java"},{"java", "python"}};
		
		do {
			System.out.println("input the string : ");
			buffer = scan.nextLine();
		//} while (!(buffer.matches("\\d*") || buffer.isEmpty()));
		//} while (!(buffer.matches("[a-zA-Z]*") || buffer.isEmpty()));
		} while (buffer.isEmpty());
		
		str1 = buffer;
		//System.out.println(str1);
		String[] wordStr1 = str1.split("\\s+");
		//System.out.println(Arrays.toString(wordStr1));
		String[] wordStr2 = str1.split("\\s+");
		for (String[] subString : swapStrings) {
			//System.out.println("search for " + subString[0]);
			for (int index = 0; index < wordStr1.length; index++) {
				if (wordStr1[index].equals(subString[0])) {
					//System.out.println("found on index : "+ index);
					wordStr2[index] = subString[1];
					//System.out.println(Arrays.toString(wordStr2));
				}
			}
		}
		// reconstruct result
		str2 = String.join(" ", wordStr2);
		System.out.println("New string:");
		System.out.println(str2);
		
		scan.close();
	}
			
//			{	
//			int index1 = str1.indexOf(subString[0],indexStart);
//			if (str1.indexOf(subString[0]) >= 0 ) {
//				indexStart = index1;
//				//str1.replaceAll(subString[0], subString[1]);
//				str2 = str1.replace(subString[0], subString[1]);
//				System.out.println(str2 + " " + indexStart + " " + index1);
//			}
//		}
//		System.out.println(str2);
			
}
