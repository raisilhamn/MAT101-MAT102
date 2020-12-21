def deleteDigit(digit, bilangan):
    digit1 = list(map(int, str(digit)))
    bilangan1 = list(map(int, str(bilangan)))
    a = set(digit1).difference(bilangan1)
    strings = [str(integer) for integer in a]
    a_string = "".join(strings)
    a_integer = int(a_string)
    return a_integer


def ambilKembar(bilangan1, bilangan2):
    array1 = [int(x) for x in str(bilangan1)]
    array2 = [int(x) for x in str(bilangan2)]
    panjang1 = len(array1)
    panjang2 = len(array2)
    kembar = []
    for i in range(panjang1):
        for j in range(panjang2):
            if array1[i] == array2[j]:
                kembar.append(array1[i])
    d = list(dict.fromkeys(kembar))
    strings = [str(integer) for integer in d]
    a_string = "".join(strings)
    a_integer = int(a_string)
    return a_integer


print(deleteDigit(12345, 23))
print(ambilKembar(23456, 13478))
