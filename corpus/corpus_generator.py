import random
import math
import csv


class ProblemGenerator:
    @staticmethod
    def random():
        ls = [ProblemGenerator.find_average(),
              ProblemGenerator.find_median(),
              ProblemGenerator.rectangular_volume(),
              ProblemGenerator.simplify_ratio(),
              ProblemGenerator.solve_for_x(),
              ProblemGenerator.multiply_2_digit(),
              ProblemGenerator.multiply_3_digit(),
              ]
        return ls[random.randint(0, len(ls) - 1)]

    @staticmethod
    def find_average():
        ls = []
        for _ in range(random.randint(6, 12)):
            ls.append(random.randint(1, 100))
        avg = str(sum(ls)/len(ls))
        if len(avg.split(".")[1]) > 1:
            return ProblemGenerator.find_average()
        return "Find the average (to one decimal place): " + str(ls).replace("[", "").replace("]", ""), avg

    @staticmethod
    def find_median():
        primes = [3, 5, 7, 11, 13, 17]
        i = primes[random.randint(0, len(primes) - 1)]
        ls = []
        for _ in range(i):
            ls.append(random.randint(1, 100))
        lsx = sorted(ls)
        lsx = lsx[math.floor(len(ls)/2)]
        return "Find the median: " + str(ls).replace("[", "").replace("]", ""), str(lsx)

    @staticmethod
    def rectangular_volume():
        prisms = ["an aquarium",
                  "a kitchen sink",
                  "a minifridge",
                  "a computer case",
                  "a microwave",
                  "an amazon package",
                  "a game console"
                  ]
        i = random.randint(0, len(prisms) - 1)
        x = random.randint(12, 32)
        y = random.randint(24, 48)
        z = random.randint(6, 24)
        return "The dimensions of " + prisms[i] + " measure to "\
               + str(x) + " in. long, " + str(y) + " in. wide, and " + str(z) + " in. deep. " + \
               "What is the volume of the prism in cubic inches?", str(x*y*z)

    @staticmethod
    def simplify_ratio():
        primes = [2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73]
        while True:
            num = primes[random.randint(0, len(primes) - 1)]
            den = primes[random.randint(0, len(primes) - 1)]
            if num != den:
                r = random.randint(2, 35)
                return "Simplify the following ratio: " + str(num*r) + "/" + str(den*r), str(num) + "/" + str(den)

    @staticmethod
    def solve_for_x():
        m = random.randint(-32, 32)
        x = random.randint(-32, 32)
        b = random.randint(-64, 64)
        y = ((m*x) + b)
        s = "Solve for x: " + str(y) + " = " + str(m) + "x"
        if b == 0:
            return s, str(x)
        elif b > 0:
            return s + " + " + str(abs(b)), str(x)
        elif b < 0:
            return s + " - " + str(abs(b)), str(x)

    @staticmethod
    def multiply_2_digit():
        a = random.randint(10, 99)
        b = random.randint(10, 99)
        return "Multiply: " + str(a) + " x " + str(b), str(a*b)

    @staticmethod
    def multiply_3_digit():
        a = random.randint(100, 999)
        b = random.randint(100, 999)
        return "Multiply: " + str(a) + " x " + str(b), str(a*b)


ls = []
with open("/Volumes/CoreBlue/Programming/Projects/swe_group4/corpus/problems.csv", mode='w') as corpus:
    write_guy = csv.writer(corpus)
    write_guy.writerow(["problem", "solution"])
    for _ in range(1000):
        temp = ProblemGenerator.random()
        write_guy.writerow(list(temp))
        print("\"" + temp[0] + "\", \"" + temp[1] + "\",")
