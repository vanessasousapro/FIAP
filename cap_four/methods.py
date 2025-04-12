#valores fora de ordem
valores = [1, 7, 7, 19, 3, 2, 11, 15, 6, 1, 5, 3.5]

#exibição da lista
print(f"A lista foi criada assim: {valores}")

#contagens de elementos 1
contagem = valores.count(1)
print(f"A contagem de números 1 na lista foi de {contagem}")

#Invertendo a lista
valores.reverse()
print(f"A lista invertida é {valores}")

#Ordenando a lista (Crescente = do menor para o maior)
valores.sort()
print(f"A lista em ordem crescente é {valores}")

#Ordenando a lista (Decrescente = do maior para o menor)
valores.sort(reverse=True)
print(f"A lista em ordem decrescente é {valores}")

#Tamanho da lista
quantidade = len(valores)
print(f"A quantidade de elementos na lista é de {quantidade}")

# Soma dos elementos
#Para que essa função funcione é necessário que a lista tenha apenas items numéricos em sua composição.
soma = sum(valores)
print(f"A soma dos valores da lista é {soma}")
