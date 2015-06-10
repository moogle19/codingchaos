class Fizzbuzz
  def initialize
    @fizz = "Fizz"
    @buzz = "Buzz"
  end
  def render(number)
    return "#{@fizz}#{@buzz}" if (number % 3) == 0 && (number % 5)  == 0
    return @fizz if number % 3  == 0
    return @buzz if number % 5  == 0
    return number.to_s
  end

  def render_and_print(number)
    puts self.render(number)
  end
end