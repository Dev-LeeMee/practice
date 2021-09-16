#merging lists
a=[1,2,3]
b=[4,5,6]
c=a+b
print(c)

#arranging lists in order
friends=['peter', 'sally', 'david']
friends.sort()
print(friends)

#built-in functions & lists
numbers=[1,2,3,4,5,6]
print(len(numbers))
print(max(numbers))
print(min(numbers))
print(sum(numbers))
print(sum(numbers)/len(numbers))

#append, sum & lists
userlist= list()
while True:
    inp=input('Enter a number: ')
    if inp== 'done': break
    value=float(inp)
    userlist.append(value)

average=sum(userlist)/len(userlist)
print('Average: ', average)

#spliting a list
abc='with three words'
done=abc.split()
print(done)
print(done[1])

for word in done:
    print(word)

#split: space(default)가 아니라 세미콜론을 split의 기준으로 설정하기

order=['first;second;third']
thing=order.split()
print(thing)

order=['first;second;third']
thing=order.split(';')
print(thing)
