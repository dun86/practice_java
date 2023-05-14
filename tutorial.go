package main

import "fmt"

func main() {
	// 変数の宣言と初期化
	var x int = 5
	var y float64 = 7.8
	z := "Hello, World!"

	// 条件分岐
	if x < 10 {
		fmt.Println("x is less than 10")
	} else {
		fmt.Println("x is greater than or equal to 10")
	}

	// 繰り返し処理
	for i := 0; i < 5; i++ {
		fmt.Println(i)
	}

	// 配列の宣言と初期化
	var arr [3]int
	arr[0] = 1
	arr[1] = 2
	arr[2] = 3

	// スライスの宣言と初期化
	slice := []int{4, 5, 6}

	// マップの宣言と初期化
	m := map[string]int{
		"apple":  1,
		"banana": 2,
		"orange": 3,
	}

	// 出力
	fmt.Println(x, y, z)
	fmt.Println(arr)
	fmt.Println(slice)
	fmt.Println(m)
}
