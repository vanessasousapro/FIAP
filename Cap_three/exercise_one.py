# você deve elaborar um algoritmo implementado em Python em que o usuário informe quantos alimentos consumiu naquele dia e depois possa informar o número de calorias de cada um dos alimentos. Como não estudamos listas ainda, você deve se preocupar em armazenar todas as calorias digitadas, mas deve exibir o total de calorias.

quantidade_alimentos = int(input("Por favor, informe quantos alimentos você consumiu hoje: "))
total_calorias = 0
for alimento in range(1, quantidade_alimentos + 1, 1):
    caloria = int(input(f"Informe a quantidade de calorias do {alimento} alimento."))
    total_calorias = total_calorias + caloria

print(f"Foram consumidas {total_calorias} calorias ao longo do dia")