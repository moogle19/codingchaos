import sys

if __name__ == '__main__':
    number = int(sys.argv[1]) + 1
    for i in range(0, number):
        fizz = i % 3 == 0
        buzz = i % 5 == 0
        output = i
        if fizz:
            output = "Fizz"
            if buzz:
                output += "Buzz"
        elif buzz:
            output = "Buzz"
        print(output)
