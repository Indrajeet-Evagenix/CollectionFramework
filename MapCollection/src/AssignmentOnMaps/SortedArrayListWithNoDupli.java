package AssignmentOnMaps;

import java.util.ArrayList;
import java.util.Collections;

/*12.Write a program to merge two sorted array of
number such that new array is sorted array and 
there should be no duplicate in new array.*/
public class SortedArrayListWithNoDupli {
	void addEle(ArrayList<Integer> al4,ArrayList<Integer> al3){
		al4.add(10);
		al4.add(50);
		al4.add(44);
		al4.add(30);
		al3.add(10);
		al3.add(78);
		al3.add(30);
		al3.add(10);
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> al1=new ArrayList<>();
		ArrayList<Integer> al2=new ArrayList<>();
		ArrayList<Integer> al3=new ArrayList<>();
		SortedArrayListWithNoDupli a=new SortedArrayListWithNoDupli();
		a.addEle(al1, al2);
		Collections.sort(al1);
		Collections.sort(al2);
		System.out.println(al1);
		System.out.println(al2);
		for(int i=0;i<al1.size();i++){
			if(al3.contains(al1.get(i)))
						al3.add(al1.get(i));
			else 
				al3.add(al1.get(i));
			}
		for(int i=0;i<al2.size();i++){
			if(!al3.contains(al2.get(i)))
				al3.add(al2.get(i));
		}
			System.out.println(al3);
	}

}
