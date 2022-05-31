//【練習問題】分岐
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class study04 {
	public static void main( String[] args ) throws IOException{
		//int 型の変数 x、y にそれぞれ数値を入力し、x が y より大きい場合に、“xはyより大きい。”という文を表示するプログラムを作成しなさい。
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		int x = Integer.parseInt(br.readLine());
//		int y = Integer.parseInt(br.readLine());
//		if(x>y);
//		System.out.println("xはyより大きい。");
		
		//２つの整数値を入力し、大きい方（小さくない方）の数を表示するプログラムを作成しなさい。
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		int x = Integer.parseInt(br.readLine());
//		int y = Integer.parseInt(br.readLine());
//		if(x>y)
//			System.out.println(x);
//		else
//			System.out.println(y);
		
		//int 型の変数 x、y にそれぞれ数値を入力し、x が ｙ より大きい場合には“xはyより大きい”、x が y より小さい場合には“xはyより小さい”と表示するプログラムを作成しなさい。
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		int x = Integer.parseInt(br.readLine());
//		int y = Integer.parseInt(br.readLine());
//		if(x>y)
//			System.out.println("xはyより大きい");
//		else if(x<y)
//			System.out.println("xはyより小さい");
		
		//int 型の変数 x、y にそれぞれ数値を入力し、x が ｙ より大きい場合には“xはyより大きい”、x が y より小さい場合には“xはyより小さい”、x と y が等しい場合には“xとyは等しい”と表示するプログラムを作成しなさい。
//		BufferedReader br = new BufferedReader(
//					new InputStreamReader(System.in));
//		int x = Integer.parseInt(br.readLine());
//		int y = Integer.parseInt(br.readLine());
//		if(x>y)
//			System.out.println("xはyより大きい");
//		else if(x<y)
//			System.out.println("xはyより小さい");
//		else 
//			System.out.println("xとyは等しい");
				
		//正の整数値を入力し、それが偶数か奇数かを判定するプログラムを作成しなさい。
			//※ 	奇数、偶数の判定には除算の余りを利用する。
//		BufferedReader br = new BufferedReader(
//					new InputStreamReader(System.in));
//		int x = Integer.parseInt(br.readLine());
//		if((x%2)==0)
//			System.out.println("偶数です");
//		else 
//			System.out.println("奇数です");
		

		//整数値を入力し、以下の４つの分類から該当するものを表示するプログラムを作成しなさい。
			//“正の偶数”、“正の奇数”、“負の偶数”、“負の奇数”
			//※ 	負の数であっても、2 で割り切れれば偶数、そうでなければ奇数とする。
			//※ 	0 は“正の偶数”であるとする。
//		BufferedReader br = new BufferedReader(
//				new InputStreamReader(System.in));
//		int x = Integer.parseInt(br.readLine());
//		if( ( x % 2 ) == 0 )
//		{
//		    if( x >= 0 )
//		        System.out.println( "正の偶数" );
//		    else
//		        System.out.println( "負の偶数" );
//		}
//		else
//		{
//		    if( x >= 0 )
//		        System.out.println( "正の奇数" );
//		    else
//		        System.out.println( "負の奇数" );
//		}
		

		
		//試験の点数を入力し、対応する成績を表示するプログラムを３種類作成しなさい。
			//試験は 100 点満点（ 0 点～ 100 点）とし、点数と成績の対応を以下のようにします
		//ケース1
//		BufferedReader br = new BufferedReader(
//                new InputStreamReader( System.in ) );
//
//		int score = Integer.parseInt( br.readLine() );
//		
//		if( score >= 60 )
//		System.out.println( "合格" );
//		else
//		System.out.println( "不合格" );
		//ケース2
//		BufferedReader br = new BufferedReader(
//                new InputStreamReader( System.in ) );
//
//		int score = Integer.parseInt( br.readLine() );
//		
//		if( score >= 80 )
//		System.out.println( "たいへんよくできました。" );
//		else if( score >= 60 )
//		System.out.println( "よくできました。" );
//		else
//		System.out.println( "ざんねんでした。" );
		//ケース3
//		BufferedReader br = new BufferedReader(
//                new InputStreamReader( System.in ) );
//
//		int score = Integer.parseInt( br.readLine() );
//		
//		if( score >= 80 )
//		System.out.println( "たいへんよくできました。" );
//		else if( score >= 60 )
//		System.out.println( "よくできました。" );
//		else
//		System.out.println( "ざんねんでした。" );
		
		
		//中間試験と、期末試験の点数（それぞれ 0 ～ 100 点）を入力し、次の条件に従って合格、不合格を判定するプログラムを作成しなさい。
//		BufferedReader br = new BufferedReader(
//					new InputStreamReader(System.in));
//		int score1 = Integer.parseInt( br.readLine() );
//		int score2 = Integer.parseInt( br.readLine() );
//
//		if( score1 >= 60 && score2 >= 60 )
//		    System.out.println( "合格" );
//		else if( ( score1 + score2 ) >= 130 )
//		    System.out.println( "合格" );
//		else if( ( score1 + score2 ) >= 100 && ( score1 >= 90 || score2 >= 90 ) )
//		    System.out.println( "合格" );
//		else
//		    System.out.println( "不合格" );
//		
		
		//曜日と、午前、午後、夜間の区別を入力し、病院が開いているか、休診であるかを表示するプログラムを作成しなさい。
//		BufferedReader br = new BufferedReader(
//                new InputStreamReader( System.in ) );
//
//		System.out.println( "曜日を選択してください" );
//		System.out.print( "0=日曜、1=月曜、2=火曜、3=水曜、4=木曜、5=金曜、6=土曜" );
//		int day = Integer.parseInt( br.readLine() );
//		
//		System.out.println( "時間帯を選択してください" );
//		System.out.print( "0=午前、1=午後、2=夜間" );
//		int zone = Integer.parseInt( br.readLine() );
//		
//		boolean bopen = true;
//		
//		if( day == 0 )
//		bopen = false;
//		else if( zone == 0 && ( day == 2 || day == 5 ) )
//		bopen = false;
//		else if( zone == 1 && day == 6 )
//		bopen = false;
//		else if( zone == 2 && ( day == 3 || day == 6 ) )
//		bopen = false;
//		
//		if( bopen )
//		System.out.println( "診療しています。" );
//		else
//		System.out.println( "休診です。" );
		
		//整数値 x, y を入力し、以下の条件に該当する場合、そうであることを示す文を表示しなさい。
		BufferedReader br = new BufferedReader(
                new InputStreamReader( System.in ) );

		int x = Integer.parseInt( br.readLine() );
		int y = Integer.parseInt( br.readLine() );
		
		if( x < y && ( x % 2 ) == 0 && ( y % 2 ) == 0 )
		System.out.println( "xはyより小さく、かつ、xとyは共に偶数である。" );
		
		if( x == y && x < 0 )
		System.out.println( "xとyは等しく、かつ、負の数である。" );
		
		if( x < y || ( x % 2 ) == 0 )
		System.out.println( "xはyより小さい、または、xは偶数である。" );
		
		if( ( x <= 10 || x >= 100 ) && ( y >= 10 && y <= 100 ) )
		System.out.println( "xは10以下または100以上で、かつ、yは10以上かつ100以下である。" );
		
		if( ! ( x < 0 && y < 0 ) )
		System.out.println( "xもyも負の数である、ではない。" );
				
		//月を表す数値を入力し、その月の初めから年末までにある祝日を表示するプログラムを作成しなさい。
		BufferedReader br = new BufferedReader(
                new InputStreamReader( System.in ) );

		System.out.println( "何月ですか？" );
		int month = Integer.parseInt( br.readLine() );
		
		switch( month )
		{
		case 1:
		System.out.println("元日" );
		System.out.println("成人の日");
		case 2:
		System.out.println("建国記念の日");
		case 3:
		System.out.println("春分の日");
		case 4:
		System.out.println("昭和の日");
		case 5:
		System.out.println("憲法記念日");
		System.out.println("みどりの日");
		System.out.println("こどもの日");
		case 6:
		case 7:
		System.out.println("海の日");
		case 8:
		case 9:
		System.out.println("敬老の日");
		System.out.println("秋分の日");
		case 10:
		System.out.println("体育の日");
		case 11:
		System.out.println("文化の日" );
		System.out.println("勤労感謝の日");
		case 12:
		System.out.println("天皇誕生日");
		}
		
		//好きな鮨（すし）を選択させ、それに対応したメッセージを表示する、鮨占いプログラムを作成しなさい。
		
		
		//月を表す数値を入力し、その月の日数を表示するプログラムを作成しなさい。2 月は 28 日とします。
			//また、1 ～ 12 以外の数値が入力された場合に、“入力が間違っています”と表示しなさい。
		
		
	
	}

}
