package adv4;

import java.util.ArrayList;

public class Database {
	
	private ArrayList<Item> listItem = new ArrayList<Item>();
	
	public void add(Item item){
		listItem.add(item);
	}
	
	public void list(){
		for(Item item : listItem){
			item.print();
		}
	}
	
	public static void main(String[] args) {
		Database db = new Database();
		db.add(new CD("CD1", 60, "comCD1", "a", 1));
		db.add(new DVD("DVD1", 120, "comDVD1", "b"));
		db.add(new MP3("MP31", 30, "comMP3", "song", 1));
		db.list();
	}

}
