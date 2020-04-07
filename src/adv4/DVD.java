package adv4;

public class DVD extends Item {
	
	private String director;

	public DVD(String title, int playingTime, String comment, String director) {
		super(title, playingTime, false, comment);
		this.director = director;
	}

	public void print(){
		System.out.print("DVD:");
		super.print();
		System.out.println(director);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
