package exo023;

import java.util.Scanner;

public class Exo028_GetDistanceAndTimeAndGiveSpeed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] nbrName = {"distance(m)","hours","minutes","seconds"};
		double[] nbr = new double[4];
		Scanner scan = new Scanner(System.in);
		String buffer = "";
		do {
			for (int index=0; index < nbr.length; index++) {
				
				do {
					System.out.print(nbrName[index] +" : ");
					buffer = scan.nextLine();
				} while (! (buffer.matches("-?\\d*[.]?\\d*"))); // wait double
				if (buffer.isEmpty())
					break;
				//nbr[index] = Integer.valueOf(buffer);
				nbr[index] = Double.valueOf(buffer);
			}

			if (buffer.isEmpty())
				break;
			
			System.out.println();
			// get distance :
			double distance = nbr[0];
			System.out.println("distance=" + distance + "m");
			// calculate total time :
			double time = nbr[1]*60*60 + nbr[2]*60 + nbr[3];
			System.out.println("time=" + time + "sec");

			System.out.println();
			// calculate speed :
			double speed = (double) distance / time;
			System.out.println("speed=" + String.format("%.2f",speed) + " m/s");
			System.out.println("speed=" + String.format("%.2f",speed/1000*3600) + " km/h");
			System.out.println("speed=" + String.format("%.2f",speed/1609.344*3600) + " ml/h");
					
			
			System.out.println();
			
		} while (!buffer.isEmpty());
		System.out.println("exiting...");
		scan.close();
	}

}
