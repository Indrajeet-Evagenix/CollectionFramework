package Assignment15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Q1Main {

	public void setPlayer(ArrayList<Q1NumberPalyer> al) {

		al.add(new Q1NumberPalyer(1, "MSDhoni", "India", "Chennai Super Kings"));
		al.add(new Q1NumberPalyer(2, "KL Rahul", "India", "Kings X1 Punjab"));
		al.add(new Q1NumberPalyer(3, "Rohit Sharma", "India", "Mumbai Indians"));
		al.add(new Q1NumberPalyer(4, "DJBravo", "West Indies", "Mumbai Indians"));
		al.add(new Q1NumberPalyer(5, "Polard", "West Indies", "Mumbai Indians"));
		al.add(new Q1NumberPalyer(6, "Jos Buttler", "England", "Benglore"));
		al.add(new Q1NumberPalyer(7, "RJadeja", "India", "Chennai Super Kings"));
		al.add(new Q1NumberPalyer(8, "Ken Williamsom", "New Zeeland", "Delhi"));
		al.add(new Q1NumberPalyer(9, "Shikhar Dhawan", "India", "Delhi"));
		al.add(new Q1NumberPalyer(7, "Suresh Raina", "India", "Chennai Super Kings"));
	}

	public void find(ArrayList<Q1NumberPalyer> al, HashMap<String, Integer> hmap) {

		for (Q1NumberPalyer player : al) {
			String country = player.countryName;
			String teamPlayer = player.teamName;
			if (country.equalsIgnoreCase("india")) {
				if (hmap.containsKey(teamPlayer)) {
					int count = hmap.get(teamPlayer);
					hmap.put(teamPlayer, count + 1);
				} else {
					hmap.put(teamPlayer, 1);
				}
			}
		}
		Iterator<Map.Entry<String, Integer>> itr=hmap.entrySet().iterator();
		int max=0;
		while(itr.hasNext()) {
			int min=itr.next().getValue();
			if(max<min) {
				max=min;
			}
		}
//		System.out.println(max);
		
		for(Map.Entry<String, Integer> it:hmap.entrySet()) {
			if(it.getValue()==max) {
				System.out.println(it.getKey()+" = "+it.getValue());
			}
		}

	}

	public static void main(String[] args) {
		ArrayList<Q1NumberPalyer> al = new ArrayList<>();

		HashMap<String, Integer> hmap = new HashMap<>();

		Q1Main mn = new Q1Main();
		mn.setPlayer(al);
		mn.find(al, hmap);
//		System.out.println(al);
//		System.out.println(hmap);

	}

}
