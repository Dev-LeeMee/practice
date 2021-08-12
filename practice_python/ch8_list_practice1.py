#double split

line='from stephen.marquard@uct.ac.za Sat Jan 5 01:14 2008'
words=line.split()
email=words[1]
pieces=email.split('@')
print(pieces[1])
