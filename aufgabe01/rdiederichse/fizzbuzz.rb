# works for n > 0
if __FILE__ == $0
   f = lambda { |i| 
      return "FIZZBUZZ" if ((i % 5) + (i % 3)) == 0
      return "FIZZ" if (i % 3) == 0
      return "BUZZ" if (i % 5) == 0
      return i
   }
   1.upto(ARGV[0].to_i) { |i| puts(f.call i)}
end
