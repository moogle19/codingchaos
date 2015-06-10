require_relative 'model'

if ARGV.count() == 2
  m = Model.new

  puts m.square_in_rectangle(ARGV[0].to_i, ARGV[1].to_i)

end