
import java.util.Scanner;
public class Demo {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		
		Film filmArray[]=new Film[10];
		int numberOfFilms = 0;
		int option;
		
		do {
			System.out.println("Press 1 to create a film");
			System.out.println("Press 2 to create a foreign film");
			System.out.println("Press 3 to create a Bollywood film");
			System.out.println("Press 4 to increase the maximum number of subtitles");
			System.out.println("Press 5 to increase the maximum number of songs");
			System.out.println("Press 6 to increase the maximum number of secondary languages");
			System.out.println("Press 7 to view all films");
			System.out.println("Press 8 to end the program");
			option = keyboard.nextInt();
			keyboard.nextLine();
			
			if(option == 1) {
				System.out.println("Enter the name of the film");
				String name = keyboard.nextLine();
			
				System.out.println("Enter the name of the director");
				String director = keyboard.nextLine();
						
				System.out.println("Enter the year released");
				int year = keyboard.nextInt();
						
				Film currentFilm = new Film();
				currentFilm.setFilmName(name);
				currentFilm.setDirectorName(director);
				currentFilm.setReleaseYear(year);
						
				if(numberOfFilms < filmArray.length) {
					filmArray[numberOfFilms] = currentFilm;
					numberOfFilms++;
				}
				else {
					System.out.println("There is no more space to add films");
				}
			}
			
			else if(option == 2) {
				ForeignFilm currentForeignFilm = new ForeignFilm();
				System.out.println("Enter the name of the foreign film");
				String name = keyboard.nextLine();
			
				System.out.println("Enter the name of the director");
				String director = keyboard.nextLine();
						
				System.out.println("Enter the year released");
				int year = keyboard.nextInt();
				keyboard.nextLine();
				
				System.out.println("Enter the language");
				String language = keyboard.nextLine();
				
				String subtitle;
				do{
					System.out.println("Enter the subtitle or none to stop entering");
					subtitle = keyboard.nextLine();
					currentForeignFilm.setSubtitleArray(subtitle);
				}while(!subtitle.equals("none"));
				
				System.out.println("Enter the translation");
				String translation = keyboard.nextLine();
				
				
				
				currentForeignFilm.setFilmName(name);
				currentForeignFilm.setDirectorName(director);
				currentForeignFilm.setReleaseYear(year);
				currentForeignFilm.setLanguage(language);
				currentForeignFilm.setTranslation(translation);
				
				if(numberOfFilms < filmArray.length) {
					filmArray[numberOfFilms] = currentForeignFilm;
					numberOfFilms++;
				}
				else {
					System.out.println("There is no more space to add films");
				}
			}
			
			else if(option == 3) {
				BollywoodFilm currentBollywoodFilm = new BollywoodFilm();
				System.out.println("Enter the name of the Bollywood film");
				String name = keyboard.nextLine();
			
				System.out.println("Enter the name of the director");
				String director = keyboard.nextLine();
						
				System.out.println("Enter the year released");
				int year = keyboard.nextInt();
				
				System.out.println("Enter the language");
				String language = keyboard.nextLine();
				keyboard.nextLine();
				String subtitle;
				do{
					System.out.println("Enter the subtitle or none to stop entering");
					subtitle = keyboard.nextLine();
					currentBollywoodFilm.setSubtitleArray(subtitle);
				}while(!subtitle.equals("none"));
				
		
				System.out.println("Enter the translation");
				String translation = keyboard.nextLine();
				String song;
				do {
					System.out.println("Enter the songs or none to stop entering");
					song = keyboard.nextLine();
					currentBollywoodFilm.setSong(song);
				}while(!song.equals("none"));
				String secondaryLanguage;
				do {
					System.out.println("Enter the secondary language or none to stop entering");
					secondaryLanguage = keyboard.nextLine();
					currentBollywoodFilm.setSecondaryLanguage(secondaryLanguage);
				}while(!song.equals("none"));
				
				currentBollywoodFilm.setFilmName(name);
				currentBollywoodFilm.setDirectorName(director);
				currentBollywoodFilm.setReleaseYear(year);
				currentBollywoodFilm.setLanguage(language);
				currentBollywoodFilm.setTranslation(translation);
				
				if(numberOfFilms < filmArray.length) {
					filmArray[numberOfFilms] = currentBollywoodFilm;
					numberOfFilms++;
				}
				else {
					System.out.println("There is no more space to add films");
				}
				
			}
			else if (option ==4) {
				
				System.out.println("Enter the number of subtitles");
				int newNumberOfSubtitle = keyboard.nextInt();
				ForeignFilm.setNumberOfSubtitle(newNumberOfSubtitle);
			}
			else if (option ==5) {
				System.out.println("Enter the number of songs");
				int newNumberOfSong = keyboard.nextInt();
				BollywoodFilm.setNumberOfSong(newNumberOfSong);
			}
			else if (option ==6) {
				System.out.println("Enter the number of secondary languages");
				int newNumberOfLanguage = keyboard.nextInt();
				BollywoodFilm.setNumberOfLanguage(newNumberOfLanguage);
			}
			else if(option == 7) {
				
				for (int i = 0; i<numberOfFilms; i++){
					System.out.println(filmArray[i].toString());
				}
			}
			
			else if(option == 8) {
				System.out.println("Goodbye!");
			}
			
			else {
				System.out.println("Error!");
			}
			
			
		}while (option !=8);	
	}
	
	

	
}

