# Criação de uma lista vazia
# Geralmente criamos uma lista vazia quando é desejável que o usuário insira dados dela ao longo do funcionamento do programa. Ou quando é necessário extrair dados de outro lugar como por exemplo um banco de dados ou um arquivo de texto.
jedi = []

# Criação de uma lista com os Jedi: Yoda, Luke, Obi-Wan, Anakin
# Cada nome é um item da lista
jedi = ["Yoda", "Luke", "Obi-Wan", "Anakin"]

# Exibição de uma posição específica na lista
# Índice é o número que representa a posição de um item dentro da estrutura
# Índice começa valendo zero
print(jedi[1])

# Exibição dos últimos elementos da lista (Indices negativos)
# De tras pra frente o último elemento sempre será o (-1)
print(jedi[-1])

# Sub espaços dentro de uma lista
print(jedi[1:3])

# Exibição de cada item da lista
for nome in jedi:
    print(nome)
