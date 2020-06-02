package a01164474;

import a01164474.data.music.AudioFile;
import a01164474.data.music.CompactDisk;
import a01164474.data.music.VinylRecordAlbum;

/**
 * Project: Lab1
 * @author Nathan de Souza - A01164474
 */
public class Lab1 {

	public static void main(String[] args) {

				
		AudioFile audio = new AudioFile( "Togheter", "Marshmello", "Togheter.mp3", 1.5);
		CompactDisk disk = new CompactDisk( "Togheter", "Marshmello", 15);
		VinylRecordAlbum vinyl = new VinylRecordAlbum( "Togheter", "Marshmello", 3, 3);
		
		String path = "hard disk";
		audio.setFileName("Love.mp3");
		audio.save(path, audio.getFileName());
		audio.deleted(path, audio.getFileName());
		audio.play();		
		disk.play();
		vinyl.play();
		System.out.println("\n" + audio.toString());
		System.out.println(disk.toString());
		System.out.println(vinyl.toString());
		
	}

}
