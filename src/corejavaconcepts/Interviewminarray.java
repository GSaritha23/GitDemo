package corejavaconcepts;

public class Interviewminarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = new int[3][3];
		a[0][0] = 2;
		a[0][1] = 7;
		a[0][2] = 5;

		a[1][0] = 4;
		a[1][1] = 2;
		a[1][2] = 6;

		a[2][0] = 1;
		a[2][1] = 8;
		a[2][2] = 9;

		// System.out.println(a[1][1]);

		int min = a[0][0];
		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				if (a[i][j] < min) {
					min = a[i][j];
				}
			}

		}

		System.out.println(min);

	}

}
