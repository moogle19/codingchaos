fn main() {
    let args = std::env::args().collect::<Vec<_>>();
    let mut len : isize = args[1].parse().unwrap();
    let mut wid : isize = args[2].parse().unwrap();
    let mut res = Vec::new();

    while len > 0 && wid > 0 {
        let min = if len < wid {
            wid -= len;
            len
        } else {
            len -= wid;
            wid
        };
        res.push(min);
    }
    println!("{:?}", res);
}
