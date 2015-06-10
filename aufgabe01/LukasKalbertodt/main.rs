fn main() {
    for i in 0..std::env::args().collect::<Vec<_>>()[1].parse().unwrap() {
        println!("{} ", match i {
            x if x % 3 == 0 && x % 5 == 0 => "FizzBuzz",
            x if x % 3 == 0 => "Fizz",
            x if x % 5 == 0 => "Buzz",
            x => { print!("{}", x); "" },
        });
    }
}
