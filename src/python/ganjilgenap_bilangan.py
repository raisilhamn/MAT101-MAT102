from collections import Counter

ganjil = 0
genap = 0
bilangan = int(input("Masukkan bilangan : "))
digit = list(map(int, str(bilangan)))
digitDobel = Counter(digit)

for i in digit:
    if digit[i] % 2 == 0:
        genap += 1
    else:
        ganjil += 1
print("genap sejumlah ", genap)
print("ganjil sejumlah ", ganjil)
digitbaru = list(dict.fromkeys(digit))

for i in digitDobel:
    print(str(i), "muncul", digitDobel[i], "kali")

print(digitbaru)
