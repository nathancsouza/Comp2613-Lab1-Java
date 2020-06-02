package a01164474.data.music;

import a01164474.data.MusicMedia;

/**
 * Project: Lab1
 * @author Nathan de Souza - A01164474
 */
public class VinylRecordAlbum extends MusicMedia {

	public static final int STANDARD_WEIGHT = 2;
	private int numberOfTracks;
	private int weight;
	
	/**
	 * 
	 */
	public VinylRecordAlbum() {
		super();
	}

	/**
	 * @param title
	 * @param artist
	 */
	public VinylRecordAlbum(String title, String artist, int numberOfTracks, int weight) {
		super(title, artist);
		setNumberOfTracks(numberOfTracks);
		setWeight(weight);
	}	

	public int getNumberOfTracks() {
		return numberOfTracks;
	}
	
	public static int getStandardWeight() {
		return STANDARD_WEIGHT;
	}

	public void setNumberOfTracks(int numberOfTracks) {
		if(numberOfTracks > 0){
			this.numberOfTracks = numberOfTracks;
		} else {
			
		}
	}
	
	public void setWeight(int weight) {
		if(weight > STANDARD_WEIGHT) {
			this.weight = weight;
		} else {
			System.err.println("Weight < than STANDARD_WEIGHT");
		}
	}	

	@Override
	public void play() {
		System.out.println("The Vinyl from artist " + getArtist() + " is being played.");
	}

	@Override
	public String toString() {
		return "VinylRecordAlbum [numberOfTracks=" + numberOfTracks + ", weight=" + weight + ", getArtist()="
				+ getArtist() + ", getTitle()=" + getTitle() + "]";
	}

}
