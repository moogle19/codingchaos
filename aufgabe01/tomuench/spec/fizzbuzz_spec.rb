require_relative '../app/fizzbuzz'
describe 'Fizzbuzz' do

  describe '#render' do
    it 'mod 3 expect Fizz' do
      f = Fizzbuzz.new
      expect(f.render(12)).to eq("Fizz")
    end

    it 'mod 5 expect Fizz' do
      f = Fizzbuzz.new
      expect(f.render(10)).to eq("Buzz")
    end

    it 'mod 3 and 5 expect Fizz' do
      f = Fizzbuzz.new
      expect(f.render(15)).to eq("FizzBuzz")
    end

    it 'mod X expect Fizz' do
      f = Fizzbuzz.new
      expect(f.render(2)).to eq(nil)
    end
  end

  describe '#render_and_print' do

    it 'Fizz' do
      f = Fizzbuzz.new
      f.render_and_print(3)
    end

    it 'Buzz' do
      f = Fizzbuzz.new
      f.render_and_print(5)
    end

    it 'FizzBuzz' do
      f = Fizzbuzz.new
      f.render_and_print(15)
    end
  end
end