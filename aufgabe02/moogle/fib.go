package main

import (
	"flag"
	"fmt"
)

func main() {
	height := flag.Int("h", 5, "Height")
	width := flag.Int("w", 5, "Width")

	flag.Parse()
	var out []int
	for {
		val, newwidth, newheight := SquareInRectangle(*width, *height)
		out = append(out, val)
		width = &newwidth
		height = &newheight
		if *width == 0 || *height == 0 {
			break
		}
	}
	fmt.Println(out)
}

func SquareInRectangle(width int, height int) (int, int, int) {
	if width > height {
		return height, width - height, height
	} else {
		return width, width, height - width
	}
}
