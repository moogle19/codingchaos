package main

import (
	"flag"
	"fmt"
)

func main() {
	price := flag.Float64("p", 13.37, "Price")
	money := flag.Float64("m", 47.11, "Money")

	flag.Parse()

	side := 1.0
	has := *money
	for {
		needed := side * side * *price
		if needed <= has {
			has -= needed
		} else {
			fmt.Println(side - 1)
			return
		}
		side += 1.0
	}
}
