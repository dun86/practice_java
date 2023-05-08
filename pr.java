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

  }
}

