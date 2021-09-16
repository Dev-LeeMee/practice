# Definition of dictionary
purse=dict()
purse['money']=2
purse['candy']=4
purse['tissue']=6
print(purse)

#Counting in dictionary
counts=dict()
name=['a', 'p', 'p', 'l', 'e']
for alphabet in name:
    if alphabet not in counts:
        counts[alphabet]=1
    else:
        counts[alphabet]=counts[alphabet]+1
print(counts)

#line11~15를 한줄로 요약하는 함수: get
counts=dict()
name=['b','a','n','a','n','a']
for alphabet in name:
    counts[alphabet]=counts.get(alphabet, 0)+1
print(counts)


#retrieving keys/values from a dictionary
#using list
dictionary={'ka':1, 'na':2, 'da':3}
print(list(dictionary))

#or using dictionary
print(dictionary.keys())
print(dictionary.values())

#or using items
print(dictionary.items())

#more about items
for aaa, bbb in dictionary.items():
    print(aaa, bbb)

