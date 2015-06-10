require 'cinch'

class Bot

  def start
    bot = Cinch::Bot.new do
      configure do |c|
        c.server = "irc.freenode.org"
        c.channels = ["#codingchaos"]
        c.nick = "tomuench_bot"
      end

      on :message, "!say" do |m|
        m.reply "hello!"
      end
    end

    bot.start
  end
end