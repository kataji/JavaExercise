package adv3;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	private HashMap<String, Integer> cities  = new HashMap<String, Integer>();
	private int[][] dists;
	
	public void addCity(String city, int size){
		cities.put(city, size);
	}
	public void initDistMatrix(int size){
		dists = new int[size][size];
	}
	public void addDist(int i, int j, int dist){
		dists[i][j] = dist;
	}
	public int size(){
		return cities.size();
	}
	
	public int distBetween(String city1, String city2){
		Integer index1 = cities.get(city1);
		Integer index2 = cities.get(city2);
		return dists[index1][index2];
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		Main cityDistTable = new Main();
		String city = in.next();
		while(!city.equals("###")){
			if(city.equals("Huzhou"))
				city = "SuZhou";
			cityDistTable.addCity(city, cityDistTable.size());
			city = in.next();
		}
		cityDistTable.initDistMatrix(cityDistTable.size());
		for(int i=0; i<cityDistTable.size(); i++){
			for(int j=0; j<cityDistTable.size(); j++){
				cityDistTable.addDist(i, j, in.nextInt());
			}
		}
		System.out.println(cityDistTable.distBetween(in.next(), in.next()));
	}

}