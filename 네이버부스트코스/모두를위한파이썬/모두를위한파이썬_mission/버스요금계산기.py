age = input("연령을 입력하세요")
fare = input("카드 또는 현금을 입력하세요")
def bus(age,fare):
    if fare == "카드":
        if age < 8:
            return "무료"
        elif 8 <= age < 14:
            return "450원"
        elif 14 <= age < 20:
            return "720원"
        elif 20 <= age < 75:
            return "1200원"
        else:
            return "무료"
    if fare == "현금":
        if age < 8:
            return "무료"
        elif 8 <= age < 14:
            return "450원"
        elif 14 <= age < 20:
            return "1000원"
        elif 20 <= age < 75:
            return "1300원"
        else:
            return "무료"

print("나이: ", age)
print("지불유형: ", fare)
print("버스요금: ", bus(age,fare)
