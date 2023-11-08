package test;

public class Test { //基本的にmainメソッドで実行できます。コードを書かない設問に関しては、心の中で呟く程度でOKです。
					//配列、ループ構造は1からコードを書く必要があります。
	
	//Chapter1 Java基礎
	
	/*1.クラス宣言に含めることができるものは？
	 * A. メソッド
	 * B. フィールド
	 * C. インポート宣言
	 * D. パッケージ宣言
	 * E. コンストラクタ 
	 * */
	
	/*2.次のうち、インポート宣言をしなくても自動的にインポートされるものは？
	 * A. java.langパッケージ
	 * B. java.langパッケージのうち、StringクラスとSystemクラスの2つのみ
	 * C. 同じパッケージに属するクラス
	 * D. サブパッケージに属するクラス
	 * */
	
	/*3.次のプログラムをコンパイル、実行した時の結果は？　※実行コマンドは、java Main java one two
	 * public class Main {
	 *	   public static void main(String[]  args) {
	 *			System.out.println(args[0] + " " + args[1]);
	 *	   }
	 * }
	 * */
	
	//---------------------------------------------------------//
	
	//Chapter２ データ型
	/*
	 * 1.次のプログラムを実行した結果のエラーを解消してください。
	 * 
	 * public class Main {
		public static void main(String[] args) {
			int val = 7;
			bool flg = true;
			if(flg == true) {
				do {
					System.out.println(val);
				}while(val > 10);
			}
		}
	}
	 *
	 * 2.次のコードのうち、コンパイルエラーになるものを選べ。また、その理由も述べよ。
	 * 
	 * A. int a = 0x10B;
	 * B. int b = 0827;
	 * 
	 * 3.次のコードのうち。コンパイルエラーになる式を選べ。また、理由も述べよ。
	 * 
	 * A. int a = 123_456_789;
	 * B. int b = 5________2;
	 * C. int c = 123_456_789_;
	 * D. int d = 0x_52;
	 * E. int e = 3_.1415F;
	 * 
	 * 4.次の空欄を埋め、コンソールにNULLと表示させたい。空欄に入るコードを選べ。
	 * 
	 * public class Main {
		public static void main(String[] args) {
			(                    )
			System.out.println(obj);
		}
	}
	 * A. Object obj = null;
	 * B. Object obj = false;
	 * C. Object obj = NULL;
	 * D. Object obj = "";
	 * E. 全て違う。
	 * 
	 * 
	 * 5.空欄に記述できるコードを選べ。
	 * 
	 * public class Main {
		public static void main(String[] args) {
			int a = 1;
			int b = 2;
			(                    )
			int c = b;
		}
	}
	 *A. System.out.println(a); 
	 *B. System.out.println(b + 2); 
	 *C. System.out.println(c); 
	 *D. System.out.println(d); 
	 * 
	 * */
	
	//---------------------------------------------------------//
	
	//Chapter3 演算子と判定構造
	
	/*1.次のプログラムをコンパイル、実行した時の結果を選べ。
	 * 
	 * public class Main {
		public static void main(String[] args) {
			int a = 3;
			int b = a += 5;
			System.out.println(a + b);
		}
	}
	 *A. 8
	 *B. 10
	 *C. 16
	 *D.コンパイルエラー
	 *
	 *2.次のプログラムをコンパイル、実行した時の結果を選べ。
	 *
	 *public class Main {
		public static void main(String[] args) {
			int num = -10;
			System.out.println(10 * -num);
		}
	}
	 *A. 100
	 *B. -100
	 *C. コンパイルエラー
	 *D. 例外が吐かれる
	 *
	 *3.次のコードのコンパイルした時の結果を選べ。
	 *※インクリメント、デクリメントに関する問題。前置、後置の知識が必要。
	 *
	 *public class Main {
		public static void main(String[] args) {
			int a = 10;
			int b = a++ + a + a-- - a-- + ++a;
			System.out.println(b);
		}
	}
	A. 7
	B. 32
	C. 33
	D. コンパイルエラー
	
	4.次のプログラムを実行した時、「yes」と表示したい。正しいコードを選べ。※三項演算子の問題。
	public class Main {
		public static void main(String[] args) {
			String a = "A";
			String b = "B";
			String c = (             );
			System.out.println(c);
		}
	}
	 * 
	 * A. a.equals(b) ? "yes" : "no"
	 * B. a.equals(b) ? "no" : "yes" 
	 * B. a.equals(b) : "no" : "yes" 
	 * B. a.equals(b) : "yes" : "no" 
	 * 
	 * 5. 次のプログラムをコンパイル、実行した結果を選べ。
	 * 
	 * public static void main(String[] args) {
			String a = 10;
			String b = 10;
			if (10 < a && 10 < ++b) {
			    a++;
			}
			System.out.println(a + b);
		}
	}
	 *A. 21
	 *B. 20
	 *C. 22
	 *C. コンパイルエラー
	 *
	 *6.次のプログラムをコンパイル、実行した結果を選べ。 ※if文の{}が省略された場合の挙動。
	 *
	 *public class Main {
		public static void main(String[] args) {
			if(false) 
				System.out.println("A");
				System.out.println("B");
		}
	}
	 *A. "A"だけが表示される
	 *B. "B"だけが表示される
	 *C. 両方表示される
	 *D. コンパイルエラー、あるいは例外
	 * */
	
	
	
	//---------------------------------------------------------//
	
	//Chapter4 配列
	
	/*1.配列の要素をすべて合計するプログラムを書け。
	 * 
	 * 2.配列の最大値を見つけるプログラムを書け。
	 * 
	 * 3.配列内の特定の要素を探すプログラムを書け。
	 * 
	 * 4.配列を逆順にするプログラムを書け。
	 * 
	 * 5.配列内の重複要素を見つけるプログラムを書いてください。
	 * 
	 * 6. 次のmainメソッドの中から、エラーが発生する箇所を選べ(発生しないことも考慮)。※エディタにコピペする前に考えてみて。
	 * 
	 * public class Main {
		public static void main(String[] args) {
			int[] a;
			int b[];
			int[][] c;
			int d[][];
			int[] e[];
			int[][] f[];
		}
	}
	 * 
	 * */
	
	//Chapter5 ループ構造　
	
	/*1. 1から10までの数字を印刷するプログラムを書け。
	 * 
	 * 2. 与えられた整数nまでの全ての偶数を印刷するプログラムを書け。※ここでは、n=10とする。
	 * 
	 * 3. 与えられた配列の各要素を印刷するプログラムを書け。※拡張for文で回答してください。
	 * 
	 * 4. 10から1までカウントダウンするプログラムを書け。
	 * 
	 * 5. 'n' 回 "Hello, World!" を印刷するプログラムを書け。ただし、'n' はユーザーが入力した回数です。※Scanneを使います。
	 * 
	 * */
	
	
	//---------------------------------------------------------//
	
	//Chapter6 メソッドとカプセル化

	/*1.メソッドとは？
	 * 
	 * 2.カプセル化とは？
	 * 
	 * 3. privateアクセス修飾子の役割は？
	 * 
	 * 4.メソッドが値を返さない場合のキーワードは？
	 * 
	 * 5.オーバーロードとは？
	 * 
	 * */
	
	//---------------------------------------------------------//
	
	//Chapter7 継承

	/*1. 次のAnimalクラスを継承するDogサブクラスを作成し、
	 * AnimalクラスのmakeSoundメソッドをオーバーライドして、
	 * 「Bark!」と印刷するようにコードを完成させよ。
	 * 
	 * class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}	

	 * 2. 次のBicycleクラスを継承するMountainBikeクラスを作成し、
	 * MountainBikeクラスにgear属性を追加せよ。
	 * また、MountainBikeクラスのコンストラクタを完成させ、
	 * gear属性を設定せよ。
	 * 
	 * class Bicycle {
    int speed;

    Bicycle(int startSpeed) {
        speed = startSpeed;
    }

    void applyBrake(int decrement) {
        speed -= decrement;
    }

    void speedUp(int increment) {
        speed += increment;
    }
}
	
	//---------------------------------------------------------//
	
	//Chapter8 例外処理

	/*1.次のプログラムは、整数の除算を行うメソッドdivideNumbersが含まれている。
	 * 0による除算を試みるとArithmeticExceptionが発生する。この例外をキャッチして、
	 * 「0で割れません。」というメッセージを印刷するようにtry-catchブロックを完成させよ。
	 * 
	 *public class ExceptionTest {
    public static int divideNumbers(int num1, int num2) {
        return num1 / num2;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        try {
            int result = divideNumbers(a, b);
            System.out.println("Result: " + result);
        } catch (________) { 
            System.out.println("________"); 
        }
    }
}

	 * 2.次のプログラムでは、ファイルからテキストを読み取る処理を行っている。
	 * ファイルが存在しない場合はFileNotFoundExceptionが発生する。
	 * この例外をキャッチして、「ファイルがない。」というメッセージを印刷するようにtry-catchブロックを完成させてください。
	 * 
	 * import java.io.FileReader;
import java.io.FileNotFoundException;

public class FileReadTest {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("nonexistentfile.txt");
            // 他のファイル読み取り処理
        } catch (________ e) { // <- ここを埋めてください
            System.out.println("________"); // <- ここを埋めてください
        }
    }
}
	 * */
	
	//---------------------------------------------------------//
	

}
