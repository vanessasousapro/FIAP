# Hora de decidir! Os colaboradores da sua equipe foram sorteados para ganharem um console de última geração cada um por conta do bom desempenho que tiveram nos últimos projetos. Por questão de logística, porém, a empresa pede que todos os 5 membros da equipe recebam o mesmo aparelho.
# Crie um algoritmo onde o usuário possa digitar o voto de cada um dos 5 membros da equipe e, ao final, exiba qual foi o sonsole escolhido e com quantos votos.
# As opções são: PLAYSTATION, XBOX e NINTENDO.

voto1 = input("Informe qual prêmio deseja ganhar: PLAYSTATION, XBOX ou NINTENDO ")
voto2 = input("Informe qual prêmio deseja ganhar: PLAYSTATION, XBOX ou NINTENDO ")
voto3 = input("Informe qual prêmio deseja ganhar: PLAYSTATION, XBOX ou NINTENDO ")
voto4 = input("Informe qual prêmio deseja ganhar: PLAYSTATION, XBOX ou NINTENDO ")
voto5 = input("Informe qual prêmio deseja ganhar: PLAYSTATION, XBOX ou NINTENDO")

playstation = 0
xbox = 0
nintendo = 0

if voto1.upper() == "PLAYSTATION":
    playstation = playstation + 1
elif voto1.upper() == "XBOX":
    xbox = xbox + 1
elif voto1.upper() == "NINTENDO":
    nintendo = nintendo + 1
else:
    print("O colaborador 1 digitou um console inexistente e seu voto será desconsiderado")

if voto2.upper() == "PLAYSTATION":
    playstation = playstation + 1
elif voto2.upper() == "XBOX":
    xbox = xbox + 1
elif voto2.upper() == "NINTENDO":
    nintendo = nintendo + 1
else:
    print("O colaborador 2 digitou um console inexistente e seu voto será desconsiderado")

if voto3.upper() == "PLAYSTATION":
    playstation = playstation + 1
elif voto3.upper() == "XBOX":
    xbox = xbox + 1
elif voto3.upper() == "NINTENDO":
    nintendo = nintendo + 1
else:
    print("O colaborador 3 digitou um console inexistente e seu voto será desconsiderado")

if voto4.upper() == "PLAYSTATION":
    playstation = playstation + 1
elif voto4.upper() == "XBOX":
    xbox = xbox + 1
elif voto4.upper() == "NINTENDO":
    nintendo = nintendo + 1
else:
    print("O colaborador 4 digitou um console inexistente e seu voto será desconsiderado")

if voto5.upper() == "PLAYSTATION":
    playstation = playstation + 1
elif voto5.upper() == "XBOX":
    xbox = xbox + 1
elif voto5.upper() == "NINTENDO":
    nintendo = nintendo + 1
else:
    print("O colaborador 1 digitou um console inexistente e seu voto será desconsiderado")

if playstation > xbox and playstation > nintendo:
    print("O console escolhido foi o playstation")
elif xbox > playstation and xbox > nintendo:
    print("O console escolhido foi o xbox")
elif nintendo > playstation and nintendo > xbox:
    print("O console escolhido foi o nintendo")
else:
    print("Houve um empate favor entrar em contato com a direção")


print(f"PLAYSTATION: {playstation}\nXBOX: {xbox}\nNINTENDO {nintendo}")