import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class study05 {
	public static void main( String[] args ) throws IOException{
		//“SPAM”という単語を 10 回表示するプログラムを作成しなさい。
//		for( int i = 0 ; i < 10 ; i++ )
//		    System.out.print( "SPAM" );
		//九九、三の段（ 3 ～ 27 の 3 の倍数）を表示するプログラムを作成しなさい。
//		for( int i = 1 ; i <= 9 ; i++ )
//		    System.out.print( ( 3 * i ) + " " );
		//2 の 1 乗から 8 乗までを計算し表示するプログラムを作成しなさい。
//		int x = 1;
//		for( int n = 1 ; n <= 8 ; n++ )
//		{
//		    x *= 2;
//		    System.out.println( "2の" + n + "乗=" + x );
//		}
		//7 の階乗を計算し、表示するプログラムを作成しなさい。
//		int x = 1;
//		for( int i = 2 ; i <= 7 ; i++ )
//		    x *= i;
//		System.out.println( x );
		//整数を 10 回入力し、平均値を求めるプログラムを作成しなさい。
//		BufferedReader br = new BufferedReader(
//                new InputStreamReader( System.in ) );
//		int sum = 0;
//		for( int i = 0 ; i < 10 ; i++ )
//		{
//		int value = Integer.parseInt( br.readLine() );
//		sum += value;
//		}
//		System.out.println( "平均は" + ( sum / 10 ) );
		//整数、0 か 1 を 10 回入力する。これを対戦成績と考え、0 を負け、1 を勝ちとして、勝ちの総数、負けの総数を表示するプログラムを作成しなさい。
//		BufferedReader br = new BufferedReader(
//                new InputStreamReader( System.in ) );
//		int wins = 0;
//		for( int i = 0 ; i < 10 ; i++ )
//		{
//		int result = Integer.parseInt( br.readLine() );
//		if( result == 1 )
//		wins += 1;
//		}
//		System.out.println( "勝ち" + wins + "回、負け" + ( 10 - wins ) + "回" );
		//次のプログラムを作成しなさい
			//巨人、阪神戦で毎回の得点を入力する。（１回～９回）
			//入力が終わったら、それぞれの得点とどちらが勝ったかを表示する。
//		BufferedReader br = new BufferedReader(
//                new InputStreamReader( System.in ) );
//		int giants = 0;
//		int tigers = 0;
//		for( int game = 1 ; game <= 9 ; game++ )
//		{
//		System.out.print( game + "回表、巨人の得点は？" );
//		giants += Integer.parseInt( br.readLine() );
//		System.out.print( game + "回裏、阪神の得点は？" );
//		tigers += Integer.parseInt( br.readLine() );
//		}
//		System.out.println( "巨人：" + giants + "点, 阪神：" + tigers + "点" );
//		if( giants > tigers )
//		System.out.println( "巨人の勝ち" );
//		else if( giants < tigers )
//		System.out.println( "阪神の勝ち" );
//		else
//		System.out.println( "引き分け" );
		
		//自然数（正の整数）を 10 回入力し、最大値を求めるプログラムを作成しなさい。
//		BufferedReader br = new BufferedReader(
//                new InputStreamReader( System.in ) );
//		int max_value = 0;
//		for( int i = 0 ; i < 10 ; i++ )
//		{
//		int value = Integer.parseInt( br.readLine() );
//		if( value > max_value )
//		max_value = value;
//		}
//		System.out.println( "最大値=" + max_value );
		//整数を 10 回入力し、最大値と最小値を求めるプログラムを作成しなさい。
		BufferedReader br = new BufferedReader(
                new InputStreamReader( System.in ) );
		int max_value = 0, min_value = 0;
		for( int i = 0 ; i < 10 ; i++ )
		{
		int value = Integer.parseInt( br.readLine() );
		
		if( i == 0 )
		{
		max_value = value;
		min_value = value;
		}
		else
		{
		if( value > max_value )
		    max_value = value;
		
		if( value < min_value )
		    min_value = value;
		}
		}
		
		System.out.println( "最大値=" + max_value + " 最小値=" + min_value );
		
		//個数を示す数値を入力し、その個数分だけ‘*’を表示するプログラムを作成しなさい。
		
		//個数を示す数値を入力し、その個数分だけ 0 ～ 9 の数字を表示するプログラムを作成しなさい。数字は 0, 1, 2, 3, , の順に表示し、9 の次は 0 に戻るものとします。
		
		//数値を繰り返し入力し、合計が 100 を超えたら入力を止めて合計を表示するプログラムを作成しなさい。
		
		//ストライク・カウントを数えるプログラムを作成しなさい。
			//１球ごとにストライクかボールかを入力する。
			//３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。
		
		//前の問題に次の修正を加えなさい。
			//１球ごとにストライク、ボール、ファウルの何れかを入力する。（残念ながらヒットにはなりません）
			//ファウルの場合、２ストライクまではストライクにカウントするが、３ストライクにはならない。
			//３ストライクまたは４ボールになったら入力を止め、ストライクとボールのカウントを表示する。
		
		//入力された数が素数かどうかを判定するプログラムを作成しなさい。
		
		//2 以上の数値を入力し、素因数分解した結果を表示しなさい。
		
		//九九表（一の段～九の段）を表示するプログラムを作成しなさい。
		
		//数値を繰り返して入力し、0 が入力されたら入力を止め、それまでの合計を表示するプログラムを作成しなさい。
		
		//数値を繰り返して入力し、0 が入力されたら入力を止め、平均値を表示するプログラムを作成しなさい。
		
		//サイズを示す数値を入力し、何等かの文字で例のような三角形を表示するプログラムを作成しなさい。
		
		//サイズを示す数値を入力し、そのサイズの×印を何等かの文字で表示するプログラムを作成しなさい
		
		//フィボナッチ数列を表示するプログラムを作成しなさい。

		//最初の２つの項を 0、1 とし、1000 まで（ 1000 以下の項）を表示するものとします。
		
		
	}

}
