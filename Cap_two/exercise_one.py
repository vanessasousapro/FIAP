# Verificar se os batimentos cardíacos por minuto se encontram na faixa adequada. Para isso, você deve solicitar que o usuário informe o seu número de BATIMENTOS POR MINUTO (BPM) e a IDADE. A partir disso o programa deve verificar e exibir uma mensagem informando se os batimentos do usuário encontra-se DENTRO da faixa adequada, ACIMA da faixa adequada ou ABAIXO da faixa adequada, de acordo com o site Tua Saúde.

#IDADE BPM
# Até 2 anos batimentos 120 a 140
# De 8 até 17 anos batimentos 80 a 100
# Adulto sedentário de 18 até 60 batimentos 70 a 80
# Idoso 50 a 60

print("VERIFICADOR DE FREQUÊNCIAS CARDÍACAS")
idade = int(input("Por favor, informe a sua idade: "))
bpm = int(input("Por favor, informe seus batimentos por minuto: "))

if idade <= 2:
    if bpm >= 120 and bpm <= 140:
        print("Frequência cardíaca adequada.")
    else:
        print("Frequência cardíaca inadequada")
elif idade >= 8 and idade <= 17:
    if bpm >= 80 and bpm <= 100:
        print("Frequência cardíaca adequada.")
    else:
        print("Frequência cardíaca inadequada")
elif idade >= 18 and idade <= 60:
    if bpm >= 70 and bpm <= 80:
        print("Frequência cardíaca adequada.")
    else:
        print("Frequência cardíaca inadequada")
elif idade >= 60:
    if bpm >= 50 and bpm <= 60:
        print("Frequência cardíaca adequada.")
    else:
        print("Frequência cardíaca inadequada")
else:
    print("Não existem dados para a idade indicada")