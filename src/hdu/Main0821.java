package hdu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main0821 {

	static int pick(int[] peaches) {
		int length = peaches.length;
		int[] list = new int[length];
		List<Integer> result = new ArrayList<Integer>(); 
		for (int i = 0; i < length; i++) {
			list[i] = 1;
			for (int j = 0; j < i; j++) {
				if (peaches[j] < peaches[i] ) {
					list[i] = list[j] + 1;
					if (result.isEmpty()) {
						result.add(list[j]);
					}
					if (!result.contains(list[i])) {
						result.add(list[i]);
					}
				}
			}
		}
		int max = list[0];
		for (int i = 0; i < length; i++) {
			if (list[i] > max) {
				max = list[i];
			}
		}
		return max;

    }
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int trees = Integer.parseInt(in.nextLine().trim());
        int[] peaches = new int[trees];
        for (int i = 0; i < peaches.length; i++) {
            peaches[i] = Integer.parseInt(in.nextLine().trim());
        }
        System.out.println(pick(peaches));
	}

}
