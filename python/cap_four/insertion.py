#Lista Original
jedi = ["Yoda", "Luke", "Obi-Wan", "Anakin"]
print(f"A lista original contém: \n {jedi}")

# Inserção no fim da lista
jedi.append("Luminara")
print(f"Após a inserção a lista contém: \n {jedi}")

#Inserção no fim da lista com input
jedi.append(input("Insira o nome de um Jedi: "))
print(f"Após a inserção a lista contém: \n {jedi}")

#Inserção em posição
jedi.insert(1, "Cebolinha")
print(f"Após a inserção na posição indicada a lista contém: \n {jedi}")