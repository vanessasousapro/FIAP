# Crie um programa onde o professor digite notas de uma quantidade indeterminada de alunos. Quando ele terminar, exibir a média aritmética.

notas = []

while input("Deseja inserir uma nota? S - Sim, N - Não ").upper() != "N":
    notas.append(float(input("Por favor insira a nota:  ")))

media_aritmetica = sum(notas) / len(notas)

print(f"Para as notas digitadas a média aritmética é de {media_aritmetica}")