/*swicth文やつ条件の値がcaseの値と一致するとき、処理が実行されます。*/

class pr {
  public static void main(String[] args) {
    int n = 1;

    // switch文を用いて、変数nの値に応じて条件分岐をしてください
    switch (n) {
      case 1:
        System.out.println("大吉です");
        break;
      case 2:
        System.out.println("吉です");
        break;
    }

    // 変数namesに、配列を代入してください
    String[]names = {"にんじゃわんこ","ひつじ仙人","ベイビーわんこ"};

    // インデックス番号が0の要素を出力してください
    System.out.println(names[0]);

    // インデックス番号が2の要素を出力してください
    System.out.println(names[2]);
    
    names[0] ="配列の内容の更新";
    
    System.out.println(names[0]);
    
    // for文を用いて、「私の名前は◯◯です」と出力してください
    for (int i = 0; i < names.length; i++) {
      System.out.println("私の名前は" + names[i] + "です");
    }
    
    for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
  }
}

