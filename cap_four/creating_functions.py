def velocidade_media():
    distancia = float(input("Por favor informe a distância percorrida: "))
    tempo = float(input("Por favor informe o tempo utilizado na viagem: "))
    vm = distancia / tempo
    print(f"A velocidade média foi de {vm}")

velocidade_media()