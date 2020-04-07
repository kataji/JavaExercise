package adv4;

public class MP3 extends Item {
	
	private String song;
	private int numofSongs;
	
	
	public MP3(String title, int playingTime, String comment, String song, int numofSongs) {
		super(title, playingTime, false, comment);
		this.song = song;
		this.numofSongs = numofSongs;
	}

	public void print(){
		System.out.print("MP3:");
		super.print();
		System.out.println(song);
	}
}
