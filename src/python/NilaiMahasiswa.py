class Mahasiswa:
    def __init__(self, nama, nim):
        self.nama = nama
        self.nim = nim
        self.uts = 0
        self.uas = 0
        self.tugas = 0
        self.na = 0.0
        self.nh = 'E'

    def disp(self):
        print()
        print('nama   = ', self.nama)
        print('nim    = ', self.nim)
        print('uts    = ', self.uts)
        print('tugas  = ', self.tugas)
        print('uas    = ', self.uas)
        print('total  = ', self.na)
        print('huruf  = ', self.nh)


    def setUts(self, uts):
        self.uts = uts

    def setUas(self, uas):
        self.uas = uas

    def setTugas(self, tugas):
        self.tugas = tugas

    def hitungNilai(self):
        self.na = 0.3 * self.uts + 0.3 * self.tugas + 0.4 * self.uas
        if self.na < 45:
            self.nh = 'E'
        elif self.na < 55:
            self.nh = 'D'
        elif self.na < 65:
            self.nh = 'C'
        elif self.na < 75:
            self.nh = 'B'
        else:
            self.nh = 'A'


def initMahasiswa():
    nama = input('Nama = ')
    nim = input('Nim  = ')
    x = Mahasiswa(nama, nim)
    return x


def inputNilai(x):
    uts = int(input('input nilai uts = '))
    x.setUts(uts)

    tugas = int(input('input nilai tugas = '))
    x.setTugas(tugas)

    uas = int(input('input nilai uas = '))
    x.setUas(uas)

    x.hitungNilai()


jmlMhs = int(input("Masukkan jumlah mahasiswa yang ingin dihitung :"))
mhs = []
for i in range(jmlMhs):
    m = initMahasiswa()
    inputNilai(m)
    mhs.append(m)

for i in range(jmlMhs):
    mhs[i].disp()
