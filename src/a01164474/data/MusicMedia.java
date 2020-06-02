package a01164474.data;

/**
 * Project: Lab1
 * @author Nathan de Souza - A01164474
 */
public abstract class MusicMedia {

	private String title;
	private String artist;
	
	public MusicMedia() {
	}

	/**
	 * @param title
	 * @param artist
	 */
	public MusicMedia(String title, String artist) {
		super();
		setTitle(title);
		setArtist(artist);
	}
	
	/**
	 * @return the artist
	 */
	public String getArtist() {
		return artist;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		if(title != null && !title.isEmpty()) {
			this.title = title;
		} else {
			
		}
	}	

	/**
	 * @param artist the artist to set
	 */
	public void setArtist(String artist) {
		if(artist != null && !artist.isEmpty()) {
			this.artist = artist;
		} else {
			
		}
	}
	
	public abstract void play();

	@Override
	public String toString() {
		return "MusicMedia [title=" + title + ", artist=" + artist + "]";
	}
	
}
