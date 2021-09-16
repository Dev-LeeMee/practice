number = int(input("몇 단? : "))
times = [1,3,5,7,9]
for turns in times:
    answer = number * turns
    if answer<50:
        print(number, 'x', turns, '=', answer)

#마지막 라인(line6) 더 심플하게 만드는 방법
#print(f'{number} x {turns} = {answer}')
