dicionario = {
    "Yoda": "Mestre Jedi",
    "Mace Windu": "Mestre Jedi",
    "Anakin Skywalker": "Cavaleiro Jedi",
    "R2-D2": "Dróide",
    "Dex": "Balconista"
}

print(dicionario)

dicionario.pop("Yoda") #Remove pela chave (Remove chave e valor)
print(dicionario)

dicionario.popitem() #Remove o último item do dicionário (Remove chave e valor)
print(dicionario)

dicionario.clear() #Remove todos os itens do dicionário (Retorna um dicionário vazio {})
print(dicionario)