number = int(input("몇 단? : "))
times = [1,3,5,7,9]
for turns in times:
    answer = number * turns
    if answer<50:
        print(number, 'x', turns, '=', answer)
