import java.io.IOException;
public class study09 {
	public static void main (String[] args) throws IOException{
		//以下の Animal クラスを継承したクラス（派生クラス）、Cat を作成しなさい。

		//Cat はメンバー・メソッド Sleep を持つ。
			//Sleep を実行すると“スースー”という文字列を表示する。
			//次のプログラムを作成しなさい。
		//Cat クラスのインスタンスを作成する。
			//public のメンバー変数、Name、Age に名前、年齢を設定する。
			//ShowProfile を実行する。
			//Sleep を実行する。
		
		//前問に加え Animal クラスを継承したクラス、Dog を作成しなさい。
			//Dog はメンバー・メソッドRunを持つ。
			//Run を実行すると“トコトコ”という文字列を表示する。
			//次のプログラムを作成しなさい。
		//Cat クラスと Dog クラスのインスタンスを作成する。
			//それぞれのメンバー変数、Name、Age に名前、年齢を設定する。
			//それぞれの ShowProfile を実行する。
			//Cat のインスタンスの Sleep を実行する。
			//Dog のインスタンスの Run を実行する。
		
		//前問の Animal クラスに以下のメンバー・メソッドを追加しなさい。
		//public void Speak()
		//{
		//System.out.println( "......" );
		//}
		//Dog クラス、Cat クラスに Speak メソッドをオーバーライドするメソッドを追加しなさい。 
		//Dog では“ワンワン”、Cat では“ニャー”という文字列を表示します。
		//次のプログラムを作成しなさい。
			//Cat クラスと Dog クラスのインスタンスを作成する。
			//それぞれのメンバー変数、Name、Age に名前、年齢を設定する。
			//それぞれの ShowProfile を実行する。
			//それぞれの Speak を実行する。
		
		//前問で作成したクラスを使用して、次のプログラムを作成しなさい。
			//Animal クラスの配列を作成する。要素数は 4。
			//配列の偶数番目（ 0 と 2 ）には Cat クラスのインスタンス、奇数番目（ 1 と 3 ）には Dog クラスのインスタンスを設定する。
			//配列の総ての要素の Speak メソッドを実行する。
	}
}