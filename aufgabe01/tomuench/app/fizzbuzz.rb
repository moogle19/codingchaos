class Fizzbuzz
  def initialize
    @fizz = "Fizz"
    @buzz = "Buzz"
  end
  def render(number)
    return number.to_s if number == 0
    return "#{@fizz}#{@buzz}" if (number % 15)  == 0
    return @fizz if number % 3  == 0
    return @buzz if number % 5  == 0
    return number.to_s
  end

  def render_and_print(number)
    puts self.render(number)
  end
end