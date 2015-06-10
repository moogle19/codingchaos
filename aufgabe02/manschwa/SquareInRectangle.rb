puts "SquareInRectangle"
puts "============================="

width = ARGV[0].to_i
height = ARGV[1].to_i

big_square = width * height
sqrt = (Math.sqrt big_square).to_i
for e in sqrt.downto 1
  if e**2 <= big_square
    puts "#{e}"
    big_square = big_square - e**2
  end
  if big_square == e**2
    puts e
  end
end
