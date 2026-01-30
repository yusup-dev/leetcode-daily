package main

import "fmt"

/*

- make a "set" variable map with type int and bool
- looping nums1
- store nums1 in set variable
- make a "result" variable for store interaction result with type array
- make a variable "used" with type int and bool
- looping nums2
- check nums2 exist in set and not exists in used (to avoid duplicate)
- if not exist, append to result
- mark num in used with true to indicate already added

*/

func interaction(nums1 []int, nums2 []int) []int {

	set := make(map[int]bool)

	for _, num := range nums1 {
		set[num] = true
	}

	result := []int{}
	used := make(map[int]bool)

	for _, num := range nums2 {
		if set[num] && !used[num] {
			result = append(result, num)
			used[num] = false
		}
	}

	return result
}

func main() {
	fmt.Println(interaction([]int{1, 2, 3}, []int{2, 5, 2}))
}
