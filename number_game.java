public class number_game {
  public static void main(String[] args) {
    /*1〜10までの数字のうち偶数のみを昇順で表示させる*/
    for (int i = 2; i <= 10; i += 2) {
      System.out.println(i);
    }
    
    /*偶数の個数計算と偶数の合計を計算！*/
    int count = 0; // 偶数の数をカウントする変数を初期化
    int sum = 0; // 偶数の合計を計算する変数を初期化
    
    for (int i = 1; i <= 10; i++) {
        if (i % 2 == 0) { // iが偶数の場合
            count++; // 偶数の数を1つ増やす
            sum += i; // 偶数の合計にiを加算する
        }
    }
    
    System.out.println("偶数の数: " + count);
    System.out.println("偶数の合計: " + sum);
    
    //1〜10までの整数をカンマ区切りで横並びで表示させる
    for (int i = 1; i <= 10; i++) {
    if (i != 10) { // iが10でない場合
        System.out.print(i + ", "); // カンマをつけて数字を表示する
    } else { // iが10の場合
        System.out.println(i); // カンマなしで数字を表示する
    }
    }
    
    }
}


for (int i = 2; i <=10; i +=2){
    System.out.println(i);
}

int count =0;
int sum=0;
for(int i =1; 1 <=10; i++){
    if (1 % 2 ==0){
        count++
        sum +=i
    }
}
System.out.println(count)
System.out.println(sum)
