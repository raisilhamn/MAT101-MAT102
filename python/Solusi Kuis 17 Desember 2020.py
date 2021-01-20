berapatahun = int(input('input tahun yang diinginkan= '))


def tabungan(berapatahun):
    simpanan = 0
    for i in range(berapatahun):
        simpanan = (simpanan + 1000) * 10 / 11
    return simpanan


print("Rp", tabungan(berapatahun), ",-")
