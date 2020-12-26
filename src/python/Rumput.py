class rumpun:
    def __init__(self):
        self.rumput = []
        self.genrumput()
        self.banyakrumput = 1

    def mainProgram(self, masukan):

        self.banyakrumput = 0
        for i in range(0, len(self.rumput)):

            if self.rumput[i] == -1:
                continue
            else:
                self.banyakrumput += 1
                self.genrumput()

        print('total rumput = ', self.rumpun.banyakrumput, '\n')
        self.mati()
        self.umurRumpun()

    def umurRumpun(self):
        for i in range(0, len(self.rumput)):
            if self.rumput[i] == -1:
                continue
            else:
                self.rumput[i] += 1

    def mati(self):
        p = -1
        q = 2
        for i in range(0, len(self.rumput)):
            if self.rumput[i] == q:
                self.rumput[i] = p

    def genrumput(self):
        for i in range(len(self.rumput), len(self.rumput) + 1):
            self.rumput.append(0)


masukan = int(input('masukkan tahun = '))
Rumpun = rumpun()
for i in range(0, masukan + 1):
    Rumpun.mainProgram(masukan)
