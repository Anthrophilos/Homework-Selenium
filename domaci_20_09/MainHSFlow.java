package domaci_20_09;

import java.util.Scanner;

/*Happy path klasa, Sad path klasa(proizvoljno netacan username/password)
i u Mainu pozivate jednu ili drugu klasu.*/
public class MainHSFlow {

	public static void main(String[] args) throws InterruptedException {

		Scanner scanner = new Scanner(System.in);
		HappyFlow hF1 = new HappyFlow();
		SadFlow sF1 = new SadFlow();

		

		
		scanner.close();
	}

}
