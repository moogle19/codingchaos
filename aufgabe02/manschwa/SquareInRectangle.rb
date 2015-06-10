puts "SquareInRectangle"
puts "============================="

width = ARGV[0].to_i
height = ARGV[1].to_i

if width >= height
  start = height
else
  start = width
end

big_square = width * height
sqrt = (Math.sqrt big_square).to_i
for e in start.downto 1
  while e**2 <= big_square
    puts "#{e}"
    big_square = big_square - e**2
  end
end
