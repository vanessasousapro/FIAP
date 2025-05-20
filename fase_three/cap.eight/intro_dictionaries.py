#Criando as duas listas
personagens = []
categorias = []

#Executando um loop 10 vezes
for x in range(10):
    #Pedindo que o usuário informe um nome e colocando na lista de personagens
    personagens.append(input("Informe o nome do personagem: "))
    #Pedindo que o usuário informa a categoria e colocando n lista de categorias
    categorias.append(input("Informe a categoria do personagem:"))
#Executando um loop 10 vezes
for indice in range(10):
    #Exibindo a cada volta o que está contido em um índice de personagens e categorias
    print(f"O personagem {personagens[indice]} é um {categorias[indice]}")