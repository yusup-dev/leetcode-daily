package main

import "fmt"

// map value is (map[1:2, 2:1])

func containsDuplicate(ints []int) bool {

	set := make(map[int]bool)

	for _, num := range ints {
		if set[num] == true {
			return true
		}
		set[num] = true
	}

	return false
}

func main() {

	fmt.Println(containsDuplicate([]int{1, 2, 3, 4, 5, 4}))

	set := make(map[int]int)

	set[1] = 2

	set[2] = 1

	fmt.Println(set)

}
