package a01164474.data.music;

import a01164474.data.MusicMedia;

/**
 * Project: Lab1
 * @author Nathan de Souza - A01164474
 */
public class CompactDisk extends MusicMedia {

	private int numberOfTracks;
	
	public CompactDisk() {
		super();		
	}
	
	/**
	 * @param numberOfTracks
	 */
	public CompactDisk(String title, String artirst, int numberOfTracks) {
		super(title, artirst);
		setNumberOfTracks(numberOfTracks);
	}
	public int getNumberOfTracks() {
		return numberOfTracks;
	}

	public void setNumberOfTracks(int numberOfTracks) {
		if(numberOfTracks > 0){
			this.numberOfTracks = numberOfTracks;
		} else {
			
		}
	}

	@Override
	public void play() {
		System.out.println("The CD from artist " + getArtist() + " is being played.");
	}

	@Override
	public String toString() {
		return "CompactDisk [numberOfTracks=" + numberOfTracks + ", getArtist()=" + getArtist() + ", getTitle()="
				+ getTitle() + "]";
	}

}
