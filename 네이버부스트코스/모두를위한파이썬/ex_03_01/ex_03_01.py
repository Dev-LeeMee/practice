h = input ("Enter Hours: ")
r = input ("Enter Rate: ")
hr = float(h)
rt = float(r)

if hr > 40:
    # print("overtime")
    reg = 40 * rt
    otp = (hr-40) * (rt*1.5)
    p = reg + otp
else:
    # print("regular")
    p = hr * rt

print("Pay:", p)
