def velocidade_media(distancia, tempo):
    vm = distancia / tempo
    print(f"A velocidade média foi de {vm}")

distancia = float(input("Por favor informe a distância percorrida: "))
tempo = float(input("Por favor informe o tempo utilizado na viagem: "))

velocidade_media(distancia, tempo)