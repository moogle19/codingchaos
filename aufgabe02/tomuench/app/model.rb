class Model

  def initialize()
    @rectangles = Array.new
  end

  def square_in_rectangle(height, width)
    max = get_max(height, width)
    min = get_min(height, width)

    if min > 0
      @rectangles << min
      self.square_in_rectangle(max-min, min)
    end
    return @rectangles
  end

  private
  def get_min(height, width)
    if height > width
      return width
    else
      return height
    end
  end

  def get_max(height, width)
    if height > width
      return height
    else
      return width
    end
  end
end


