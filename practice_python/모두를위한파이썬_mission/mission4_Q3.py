g_list=open('guest_book.py')

#guest book 내용
#김갑,123456789
#이을,010-1234-5678
#박병,010-5678-111
#최정,111-1111-1111
#정무,010-3333-3333

#제대로 적은 방명록의 조건은 다음과 같습니다
#1. 010 으로 시작함
#2. 번호가 - 로 구분이 되어 있음
#3. -를 포함하여 길이가 13임

for line in g_list:
    line=line.strip()
    name=line[:2]
    number=line[3:]

    if number.startswith('010') and len(number)==13 and number[3]=='-' and number[8]=='-':
        continue
    else:
        print('잘못 쓴 사람: ', name)
        print('잘못 쓴 번호: ', number)
        print(' ') #한줄씩 띄워주는 역할.

#질문: len은 0부터가 아니라 1부터 셈? A: Yes. 번호 세는 것이므로 1부터 셈.
#질문: 위 코드는 왜 안됨? A: 수정완료.
