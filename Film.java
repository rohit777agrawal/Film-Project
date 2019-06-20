import java.util.Scanner;

public class Film {
	
	private String filmName;
	private String directorName;
	private int releaseYear;
	
	public Film(){
		filmName = "";
		directorName = "";
		releaseYear = 1890;
				
	}

	public String getFilmName() {
		return filmName;
	}

	public void setFilmName(String filmName) {
		this.filmName = filmName;
	}

	public String getDirectorName() {
		return directorName;
	}

	public void setDirectorName(String directorName) {
		this.directorName = directorName;
	}
	
	public void setReleaseYear(int releaseYear){
		@SuppressWarnings("resource")
		Scanner keyboard = new Scanner(System.in);
		boolean flag = true;
		do{
			if (releaseYear >= 1890){
				this.releaseYear = releaseYear;
				flag = false;
			}
			else{
				System.out.println("Year of release should be more than 1889! Try again");
				System.out.println("What is the release date?");
				releaseYear = keyboard.nextInt();
			}
		}while(flag);
	}
	public int getReleaseYear(){
		return releaseYear;
	}

	@Override
	public String toString() {
		return "Film" + "\nName of the Film: " + this.filmName + "\nName of the Director(s): " + this.directorName + "\nYear of Release: " + this.releaseYear;
		//return "filmName=" + filmName + ", directorName=" + directorName + ", releaseYear=" + releaseYear;
	}

	public boolean equals(Object otherObject){
		boolean isEqual = false;
		
		if (otherObject != null && otherObject instanceof Film){
			Film otherFilm = (Film) otherObject;
			if(this.filmName.equals(otherFilm.filmName) && this.directorName.equals(otherFilm.directorName) && this.releaseYear == otherFilm.releaseYear){
				isEqual = true;
			}
		}
		return isEqual;
	}

	
	
	

}
