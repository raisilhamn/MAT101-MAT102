import random


class Sapi:
    def __init__(self, jeniskelamin):
        self.umur = 0
        self.subur = False
        self.jeniskelamin = jeniskelamin
        self.mati = False

    @staticmethod
    def getProbmati(umur):
        probma = 0
        if umur == 0:
            probma = 1
        elif umur == 1:
            probma = 2
        elif umur == 2:
            probma = 2
        elif umur == 3:
            probma = 3
        elif umur == 4:
            probma = 3
        elif umur == 5:
            probma = 4
        elif umur == 6:
            probma = 5
        elif umur == 7:
            probma = 6
        elif umur == 8:
            probma = 9
        elif umur > 8:
            probma = 10
        return probma

    def setMati(self, getProbmati):
        if getProbmati == 10:
            self.mati = True
        elif getProbmati == 0:
            self.mati = False
        else:
            hasil = random.randint(0, 9)
            self.mati = hasil < getProbmati
        return self.mati

    def masaSubur(self):
        if not self.mati:
            if self.jeniskelamin == "betina":
                if 3 <= self.umur <= 7:
                    self.subur = True
                else:
                    self.subur = False
            else:
                self.subur = False
        return self.subur

    def melahirkan(self, suburr):
        self.subur = suburr
        if not self.mati:
            if self.subur:
                if self.jeniskelamin == "betina":
                    jeniskell = random.randint(0, 100)
                    return jeniskell
                else:
                    jeniskell = 101
                    return jeniskell
            else:
                jeniskell = 101
                return jeniskell
        else:
            jeniskell = 101
            return jeniskell

    def nambahUmur(self):
        self.umur += 1
        return self.umur


jantan = int(5)
betina = int(10)
tahun = int(input("Masukkan siklus tahun : "))
kandang = []
jumlahmati = 0
jumlahlahir = 0
jumlahjantan = 0
jumlahbetina = 0

for a in range(jantan):
    kandang.append(Sapi("jantan"))
for b in range(betina):
    kandang.append(Sapi("betina"))

for i in range(tahun):
    n = i + 1
    jumlahtahunini = 0
    jumlahbetinatahunini = 0
    jumlahjantantahunini = 0
    print(" =========== tahun ke ", n, " =========== ")
    for j in range(len(kandang)):
        probmati = kandang[j].getProbmati(kandang[j].umur)
        kandang[j].mati = kandang[j].setMati(probmati)
        subur = kandang[j].masaSubur()
        if subur:
            jumlahlahir += 1
            jeniskel = kandang[j].melahirkan(subur)
            if jeniskel < 60:
                kandang.append(Sapi("betina"))
            elif 60 <= jeniskel <= 100:
                kandang.append(Sapi("jantan"))
        if not kandang[j].mati:
            kandang[j].nambahUmur()
            jumlahtahunini += 1
            if kandang[j].jeniskelamin == "jantan":
                jumlahjantantahunini += 1
            else:
                jumlahbetinatahunini += 1
    print("Jumlah sapi tahun ini : ", jumlahtahunini)
    print("Jumlah sapi jantan tahun  ini : ", jumlahjantantahunini)
    print("Jumlah sapi betina tahun ini : ", jumlahbetinatahunini)

new_kandang = []
for o in range(len(kandang)):
    if not kandang[o].mati:
        new_kandang.append(kandang[o])
    if kandang[o].mati:
        jumlahmati += 1
for p in range(len(new_kandang)):
    if kandang[p].jeniskelamin == "jantan":
        jumlahjantan += 1
    else:
        jumlahbetina += 1

print(" =================== ")
print("Populasi sapi : ", len(new_kandang))
print("Jumlah jantan akhir : ", jumlahjantan)
print("Jumlah betina akhir : ", jumlahbetina)
print("Jumlah sapi mati : ", jumlahmati)
