package adv4;

public class CD extends Item {
	private String artist;
	private int numofTracks;
	
	public CD(String title, int playingTime, String comment, String artist, int numofTracks) {
		super(title, playingTime, false, comment);
		this.artist = artist;
		this.numofTracks = numofTracks;
	}
	
	public void print(){
		System.out.print("CD:");
		super.print();
		System.out.println(artist);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
