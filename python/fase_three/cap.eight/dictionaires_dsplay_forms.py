from wsgiref.validate import check_status

dicionario = {
    "Yoda": "Mestre Jedi",
    "Mace Windu": "Mestre Jedi",
    "Anakin Skywalker": "Cavaleiro Jedi",
    "R2-D2": "Dróide",
    "Dex" : "Balconista"
}

#print(dicionario["Dex"])
print(dicionario.get("Vanessa")) #Prevenção De Erros

print(dicionario.keys())

for chave in dicionario.keys():
    print(chave)