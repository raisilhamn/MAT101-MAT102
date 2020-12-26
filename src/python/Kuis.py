bilangan1 = int(input("Masukan bilangan yang ingin dicari faktor prima : "))


def primeFactor(n):
    arr1 = []
    arr2 = []
    for i in range(1, n + 1):
        if n % i == 0:
            arr1.append(i)
    for i in range(len(arr1)):
        faktor = 0
        n = arr1[i] + 1
        for j in range(1, n):
            if arr1[i] % j == 0:
                faktor += 1
        if faktor == 2:
            arr2.append(arr1[i])
    return arr2


print("primeFactor", primeFactor(bilangan1))

bilangan2 = int(input("Masukkan bilangan 1 common Factor :"))
bilangan3 = int(input("Masukkan bilangan 2 common Factor : "))


def commonFactor(m, n):
    arr3 = primeFactor(m)
    arr4 = primeFactor(n)
    arr5 = []
    for i in range(len(arr3)):
        for j in range(len(arr4)):
            if arr3[i] == arr4[j]:
                arr5.append(arr3[i])
    # arr5 = list(dict.fromkeys(arr5))
    return arr5


print("commonFactor ", commonFactor(bilangan2, bilangan3))
