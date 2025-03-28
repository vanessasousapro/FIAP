#Uma universidade realizará um competição acadêmica. Para essa competição, só serão aceitos estudantes que sejam maiores de idade.
#Crie um programa que receba o RM e a idade de um aluno, e exiba uma mensagem confirmando o cadastro apenas caso o estudante seja maior de idade.

rm = input("Por favor, insira o seu RM: ")
idade = int(input("Por favor, insira a sua idade: "))

if idade >= 18:
    print(f"Seu cadastro foi realizado, aluno de RM {rm}")
    print("Os detalhes serão enviados para o seu e-mail")
else:
    print("Sua participação foi negada, pois você não é maior de idade.")