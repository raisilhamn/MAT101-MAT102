def deleteDigit(digit, bilangan):
    digit1 = list(map(int, str(digit)))
    bilangan1 = list(map(int, str(bilangan)))
    a = set(digit1).difference(bilangan1)
    strings = [str(integer) for integer in a]
    a_string = "".join(strings)
    a_integer = int(a_string)
    return a_integer


def deleteDigit2(bilangan1, bilangan2):
    array1 = list(map(int, str(bilangan1)))
    array2 = list(map(int, str(bilangan2)))
    panjang1 = len(array1)
    panjang2 = len(array2)
    kembar = []
    for i in range(panjang1):
        for j in range(panjang2):
            if array1[i] == array2[j]:
                kembar.append(array1[i])
    d = list(dict.fromkeys(kembar))
    temp = [str(integer) for integer in d]
    temp_string = "".join(temp)
    temp_int = int(temp_string)
    return temp_int


print(deleteDigit(12345, 23))
print(deleteDigit2(23456, 13478))
