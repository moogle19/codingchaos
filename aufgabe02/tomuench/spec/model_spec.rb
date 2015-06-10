require_relative '../app/model'
describe 'Model' do

  describe '#square_in_rectangle' do
    it '3 to 5' do
      m = Model.new
      expect(m.square_in_rectangle(5,3)).to eq([3, 2, 1, 1])
    end

    it '5 to 3' do
      m = Model.new
      expect(m.square_in_rectangle(5,3)).to eq([3, 2, 1, 1])
    end

  end
end