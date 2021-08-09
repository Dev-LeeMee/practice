xfile=open('ch6_string_practice.py')
whole=xfile.read()
print(len(whole))


#아래 코드로 짜면 왜 작동이 안되지? 왜 굳이 read 기능을 넣어야 하는거지?
xfile=open('ch6_string_practice.py')
print(len(xfile))
