
public class ForeignFilm extends Film {

	private String language;
	private String[] subtitleArray;
	private String translation;
	private static int numberOfSubtitle = 10;
	private int subtitleIndex;
	
	public ForeignFilm() {
		super();
		this.language = "";
		this.subtitleArray = new String[numberOfSubtitle];
		this.translation = "";
		this.subtitleIndex = 0;
	}

	public static int getNumberOfSubtitle() {
		return numberOfSubtitle;
	}

	public static void setNumberOfSubtitle(int newNumberOfSubtitle) {
		if (newNumberOfSubtitle > numberOfSubtitle){
			newNumberOfSubtitle = numberOfSubtitle;
		}
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getSubtitleArray() {
		String subtitle = "";
		for (int index =0; index < subtitleIndex; index++){
			subtitle = subtitle + "\n" + subtitleArray[index];
		}
		return subtitle;
	}

	public void setSubtitleArray(String subtitleArray) {
		if(subtitleIndex < numberOfSubtitle){
			this.subtitleArray[subtitleIndex] = subtitleArray;
			subtitleIndex++;
		}
		else
		{
			System.out.println("The storage of the subtitle is filled up!");
		}
	}

	public String getTranslation() {
		return translation;
	}

	public void setTranslation(String translation) {
		this.translation = translation;
	}

	@Override
	public String toString() {
		return super.toString() + "\nForeign Film" + "\nLanguage: " + language + "\nSubtitle Information: "+ getSubtitleArray() 
				+ "\nTranslation: " + this.translation;
				
	}
	
	public boolean equal(Object otherObject){
		boolean isEqual = false;
		
			if (otherObject != null && otherObject instanceof Film){
				Film otherFilm = (Film) otherObject;
				if(super.equals(otherFilm)){
					isEqual = true;
				}
			}
			return isEqual;
	}
	
	
	
	
}
