package a01164474.data.music;

import a01164474.data.MusicMedia;
import a01164474.io.FileManager;

/**
 * Project: Lab1
 * @author Nathan de Souza - A01164474
 */
public class AudioFile extends MusicMedia implements FileManager {

	private String fileName;
	private double FileSize;
	
	public AudioFile() {
		super();
	}
	
	
	
	/**
	 * @param fileName
	 * @param fileSize
	 */
	public AudioFile(String title, String artirst, String fileName, double fileSize) {
		super(title, artirst);
		setFileName(fileName);
		setFileSize(fileSize);
	}
	
	public String getFileName() {
		return fileName;
	}

	public double getFileSize() {
		return FileSize;
	}
	
	public void setFileName(String fileName) {
		if(fileName != null && !fileName.isEmpty()){
			this.fileName = fileName;
		} else {
			
		}
	}
	
	public void setFileSize(double fileSize) {
		if(fileSize > 0.0){
			FileSize = fileSize;
		} else {
			
		}
	}

	@Override
	public void save(String path, String fileName) {
		System.out.println("The audio file " + fileName + " has been saved in " + path + ".");
	}

	@Override
	public void deleted(String path, String fileName) {
		System.out.println("The audio file " + fileName + " has been deleted from " + path);
	}

	@Override
	public void play() {
		System.out.println("The audio file " + fileName + " is being played.");
	}



	@Override
	public String toString() {
		return "AudioFile [fileName=" + fileName + ", FileSize=" + FileSize + ", getArtist()=" + getArtist()
				+ ", getTitle()=" + getTitle() + "]";
	}
	
	

}
