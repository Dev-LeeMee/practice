name = input("학생 이름은?: ")
score = input("학생 점수는?: ")
def grader(a):
  if a>0 and a<60:
    return 'F'
  elif a<=64:
    return 'D'
  elif a<=69:
    return 'D+'
  elif a<=74:
    return 'C'
  elif a<=79:
    return 'C+'
  elif a<=84:
    return 'B'
  elif a<=89:
    return 'B+'
  elif a<=94:
    return 'A'
  elif a<=100:
    return 'A+'
  else:
    print("잘못된 입력입니다")
    
print("학생이름", name)
print("점수", score)
print("학점", grader(int(score))
