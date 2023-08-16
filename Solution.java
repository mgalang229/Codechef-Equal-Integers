import java.util.Scanner;

//change class to 'Main'
public class Solution {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int T = 1;
		T = fs.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int x = fs.nextInt(), y = fs.nextInt();
			if (x <= y) {
				System.out.println(y - x);
			} else {
				int ans = ((x - y) + 2 - 1) / 2;
				ans += (y + 2 * ans - x);
				System.out.println(ans);
			}
		}
		fs.close();
	}
}
