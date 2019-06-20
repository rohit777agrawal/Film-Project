
public class BollywoodFilm extends ForeignFilm{
	private String [] songsArray;
	private String [] secondaryLanguageArray;
	private static int numberOfSong=20;
	private static int numberOfLanguage=5;
	private int songIndex;
	private int languageIndex;
	
	public BollywoodFilm() {
		super();
		this.songsArray = new String[numberOfSong];
		this.secondaryLanguageArray = new String[numberOfLanguage];
		this.songIndex = 0;
		this.languageIndex = 0;
	}
	
	public static void setNumberOfSong(int newNumberOfSong) {
		if(newNumberOfSong>numberOfSong) {
			numberOfSong=newNumberOfSong;
		}
	}
	public static int getNumberOfSong() {
		return numberOfSong;
	}
	public static void setNumberOfLanguage(int newNumberOfLanguage) {
		if(newNumberOfLanguage>numberOfLanguage) {
			numberOfLanguage=newNumberOfLanguage;
		}
	}
	public static int getNumberOfLanguage() {
		return numberOfLanguage;
	}
	public void setSong(String song) {
		if (songIndex < numberOfSong){
			songsArray[songIndex] = song;
			songIndex++;
		}
		else
		{
			System.out.println("The storage for number of songs is full !!");
		}
	}
	public String getSong() {
		String song = "";
		for (int index = 0; index<songIndex;index++) {
			song = song + "\n"+ songsArray[index];
		}
		return song;
	}
	public void setSecondaryLanguage(String secondaryLanguage) {
		if (languageIndex < numberOfLanguage){
			secondaryLanguageArray[languageIndex]=secondaryLanguage;
			languageIndex++;
		}
		else
		{
			System.out.println("The language storage is full !");
		}
	}
	public String getSecondaryLanguage() {
		String secondaryLanguage="";
		for (int index=0;index<languageIndex;index++) {
			secondaryLanguage = secondaryLanguage + "\n" + secondaryLanguageArray[index];
		}
		return secondaryLanguage;
	}
	
	public String toString() {
		return super.toString() + "\nSecondary Language: " + getSecondaryLanguage() +  "\nSongs" + getSong();
	}
	
}
