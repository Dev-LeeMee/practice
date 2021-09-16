import random
computer = random.choice(['가위', '바위', '보'])
player = input('가위 바위 보 중 하나를 입력하세요: ')

if computer == '가위':
    print('컴퓨터? 가위!')
    if player == '가위':
        print('플레이어? 가위!')
        print('무승부 ㅎㅎ')
    elif player == '바위':
        print('플레이어? 바위!')
        print('이겼다!')
    elif player == '보':
        print('플레이어? 보!')
        print('졌음.. 또르르..')
elif computer == '바위':
    print('컴퓨터? 바위!')
    if player == '가위':
        print('플레이어? 가위!')
        print('졌음.. 또르르..')
    elif player == '바위':
        print('플레이어? 바위!')
        print('무승부 ㅎㅎ')
    elif player == '보':
        print('플레이어? 보!')
        print('졌음.. 또르르..')
elif computer == '보':
    print('컴퓨터? 보!')
    if player == '가위':
        print('플레이어? 가위!')
        print('이겼다!')
    elif player == '바위':
        print('플레이어? 바위!')
        print('졌음.. 또르르..')
    elif player == '보':
        print('플레이어? 보!')
        print('무승부 ㅎㅎ')
