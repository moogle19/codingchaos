package main

import (
	"flag"
	"fmt"
	"strconv"
)

func main() {
	upTo := flag.Int("to", 100, "count up to value")
	flag.Parse()
	fmt.Print(fizzBuzz(*upTo))

}

func fizzBuzz(upTo int) string {
	ret := ""
	for i := 1; i <= upTo; i++ {
		if i%3 == 0 || i%5 == 0 {
			if i%3 == 0 {
				ret += "Fizz"
			}
			if i%5 == 0 {
				ret += "Buzz"
			}
		} else {
			ret += strconv.Itoa(i)
		}
		ret += "\n"
	}
	return ret
}
