# Uma empresa de telefonia está realizando uma promoção, onde os clientes podem receber alguns bonus para navegação na internet com base em uma pontuação.
#1000 pontos -> 3gb de bônus
#500 pontos -> 1,5gb de bônus
#200 pontos -> 500mb de bônus
# Crie um programa que receba o número de pontos e informe ao cliente quantos bônus ele vai receber....

pontuacao = int(input("Por favor, informe a pontuação do usuário: "))

if pontuacao >= 1000:
    print("Você recebeu 3gb de bônus")
elif pontuacao >= 500:
    print("Você recebeu 1,5gb de bônus")
elif pontuacao >= 200:
    print("Você recebeu 500mb de bônus")
else:
    print("Você não tem pontuação suficiente para resgatar o bônus")