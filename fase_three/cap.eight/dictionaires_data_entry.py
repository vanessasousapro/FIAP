funcionarios = {}

while input("Quer inserir um funcionário? S-Sim, N-Não ").upper() != "N":
    nome = input("Informe o nome do funcionario: ")
    funcao = input("Informe a função do funcionario: ")
    funcionarios.update({nome:funcao})

print(funcionarios)