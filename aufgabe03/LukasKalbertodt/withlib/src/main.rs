extern crate irc;

use irc::client::prelude::*;

fn main() {
    let config = Config {
        nickname: Some(format!("LukasInDaHood")),
        server: Some(format!("irc.freenode.net")),
        channels: Some(vec![format!("#codingchaos")]),
        .. Default::default()
    };
    let server = IrcServer::from_config(config).unwrap();
    server.identify().unwrap();
    for message in server.iter() {
        let msg = message.unwrap();
        println!("{}", msg.into_string());
        if let Some(m) = msg.suffix {
            if m.contains("!say") {
                server.send_privmsg("#codingchaos", "hello!");
            }
        }
    }
}
