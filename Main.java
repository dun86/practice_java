public class Main {
  public static void main(String[] args) {
    int count = 0; // 偶数の個数をカウントする変数
    int sum = 0;   // 偶数の合計を計算する変数

    for(int i=1; i<=10; i++){
      if(i%2==0){
        count++;  // 偶数の個数をカウント
        sum += i; // 偶数の合計を計算
      }
    }

    System.out.println("偶数の個数は" + count + "個です。");
    System.out.println("偶数の合計は" + sum + "です。");


    for(int i = 1; i <= 10; i++) {
      System.out.print(i);
      if(i != 10) {
        System.out.print(",");


      }
    }

    int n = 10;

    for (int i = 1; i <= n; i++) {
      sum += i;
    }

    System.out.println("1から" + n + "までの和: " + sum);
  }
}