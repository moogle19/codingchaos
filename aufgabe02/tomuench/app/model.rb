class Model

  def initialize()
    @rectangles = Array.new
  end

  def square_in_rectangle(height, width)
    max = [height, width].max()
    min = [height, width].min()

    if min > 0
      @rectangles << min
      self.square_in_rectangle(max-min, min)
    end
    return @rectangles
  end
end


