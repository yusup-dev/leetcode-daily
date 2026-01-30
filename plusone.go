package main

import "fmt"

func plusOne(digits []int) []int {

	for i := len(digits) - 1; i >= 0; i-- {
		i2 := digits[i] + 1

		if i2 < 10 {
			digits[i] = i2
			break
		} else if i2 == 10 {
			digits[i] = 0
			continue
		}
	}
	return digits
}

func main() {

	digits := []int{9}

	fmt.Print(plusOne(digits))

	/*
			- backward
			-
		- total := value + 1
		- jika total > 10 maka
	*/
}
