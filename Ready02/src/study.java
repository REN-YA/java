
public class study {
	public static void main(String[] args) {
		//1〜100までの奇数の和を求める
		int sum = 0;
		for(int i = 0; i <= 100 ; i++ ) {
			if (i % 2 == 1) {
				sum += i;
			}
		}
		System.out.println(sum);
	}
}
