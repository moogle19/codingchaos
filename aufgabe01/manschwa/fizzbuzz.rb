puts "FizzBuzz"
puts "================================"

num = -1
while num < 0
  puts "Please enter a  number: "
  num = gets.to_i
end

puts

for e in (1..num) do
  if (e % 3 == 0 and e % 5 == 0)
    puts "FizzBuzz"
  elsif (e % 3 == 0)
    puts "Fizz"
  elsif (e % 5 == 0)
    puts "Buzz"
  else
    puts "#{e}"
  end
end
