
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("         _____________                                                         _____________");
		System.out.println("       /_\\#|__|#|__|#/_\\       #                                     #       /_\\#|__|#|__|#/_\\");
		System.out.println("      |###/ __   __ \\###|      #                                     #      |###/ __   __ \\###|");
		System.out.println("      |___|  @\\ /@  |___|      #######################################      |___|  @\\ /@  |___|");
		System.out.println("      |###|    ¿    |###|      #                                     #      |###|    ¿    |###|");
		System.out.println("      |___| \\  -  / |___|      #           JUEGO CHUPIGUAY           #      |___| \\  -  / |___|");
		System.out.println("      |###|\\__   __/|###|      #                                     #      |###|\\__   __/|###|");
		System.out.println("       |__|   ! !   |__|       #       Claudia Aragones-Chaves       #       |__|   ! !   |__|");
		System.out.println("      / \\#|    V    |#/ \\      #            y Luis Crespo            #      / \\#|    V    |#/ \\");
		System.out.println("     /                   \\     #                                     #     /                   \\");
		System.out.println("    |     |    _    |     |    #######################################    |     |    _    |     |");
		System.out.println("   _|___ |    | |    | ___|_   #                                     #   _|___ |    | |    | ___|_");
		System.out.println("  |_|_|_|-----+ +-----|_|_|_|  #                                     #  |_|_|_|-----+ +-----|_|_|_|");
        System.out.println();


		System.out.println("Para comenzar pulse cualquier tecla por favor...");
		Scanner scanner = new Scanner(System.in);
		scanner.next();

		GameController game = new GameController();
		game.fight();
		game.fight();
		game.fight();
		game.fight();
		
	}
}