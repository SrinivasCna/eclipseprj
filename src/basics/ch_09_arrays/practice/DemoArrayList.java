package basics.ch_09_arrays.practice;

import java.util.ArrayList;

public class DemoArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList();
		num.add(10);
		num.add(40);
		num.add(50);
		System.out.println(num);
		System.out.println(num.get(2));

	}

}
