import sys

bilangan = input()
faktor = 0
if int(bilangan) == 1:
    print(' 1 bukanlah bilangan prima')
    sys.exit()

for i in range(1, int(bilangan) + 1):
    if int(bilangan) % i == 0:
        faktor = faktor + 1

if faktor <= 2:
    print(str(bilangan) + " adalah bilangan prima")
else:
    print(str(bilangan) + " bukanlah bilangan prima")
