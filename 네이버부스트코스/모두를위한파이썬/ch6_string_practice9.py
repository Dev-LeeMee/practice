data='서울시 문화본부 culturalpolicy@seoul.go.kr Fri 7/23/2021 5:34 PM'
atsign=data.find('@')
print(atsign)

blank=data.find(' ', atsign)
print(blank)

host=data[atsign+1:blank]
print(host)
