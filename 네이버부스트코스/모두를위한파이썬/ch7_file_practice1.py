xfile=open('FOR LOOP practice.py')
count=0
for line in xfile:
    count=count+1
    print('Line Count: ', count)

#indent: 위와 같이 하면 라인별로 다 프린트 되고
#아래와 같이 하면 총 라인 갯수만 프린트 됨.

xfile=open('FOR LOOP practice.py')
count=0
for line in xfile:
    count=count+1
print('Line Count: ', count)
