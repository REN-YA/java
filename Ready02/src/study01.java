
public class study01 {
	public static void main(String[] args) {
		//＊を使用した逆三角形を作成
		for(int i=0; i<5; i++){
		  for(int j=0; j<i; j++){
		     System.out.print(" ");
		  }
		  for(int k=0; k<(5-i)*2-1; k++){
		     System.out.print("*");
		  }
		      System.out.print("\n");
		}
	}

}
