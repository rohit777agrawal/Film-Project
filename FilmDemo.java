import java.util.Scanner;

public class FilmDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyboard = new Scanner(System.in);
		
		int option = 0;
		int countFilm = 0;
		
		Film[] online = new Film[10];
		
		do{
			System.out.println("Press 1: to add a film \n" 
					+ "Press 2: to look at the films \n"
					+ "Press 3: to end the program");
			
			option = keyboard.nextInt();
			keyboard.nextLine();
			
			if (option == 1){
				if (countFilm <10){
					Film newOnline = new Film();
					System.out.println("What is the name of the film?");
					newOnline.setFilmName(keyboard.nextLine());
					System.out.println("What is the name of the director of the film?");
					newOnline.setDirectorName(keyboard.nextLine());
					System.out.println("Which year did the film released?");
					newOnline.setReleaseYear(keyboard.nextInt());
					keyboard.nextLine();
					
					online[countFilm] = newOnline;
					countFilm++;
				}
				else{
					System.out.println("You have filled all 10 films!");
				}
			}
			else if(option == 2){
				for (int i = 0; i<countFilm; i++){
					System.out.println("Film " + (i+1) + ": Film name: " + online[i].getFilmName() + 
							", Director: " + online[i].getDirectorName() + 
							", Release Date: " + online[i].getReleaseYear());
				}
			}
			else if(option ==3){
				System.out.println("GoodBye!");
			}
			else{
				System.out.println("Error! Please choose a valid number!");
			}
		}while (option!= 3);

		keyboard.close();
	}

}
