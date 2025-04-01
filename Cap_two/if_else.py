#Uma universidade realizará um competição acadêmica. Para essa competição, só serão aceitos estudantes que sejam maiores de idade.
#Crie um programa que receba o RM e a idade de um aluno, e exiba uma mensagem confirmando o cadastro apenas caso o estudante seja maior de idade. Caso um aluno seja menor e informe ter autorização dos pais, o cadastro deve ser realizado e o e-mail deve ser enviado para os responsáveis. Caso contrário, o cadastro não será feito....

rm = input("Insira seu RM: ")
idade = int(input("Insira sua idade: "))

if idade >= 18:
    print(f"Seu cadastro foi realizado, aluno de RM {rm}!")
    print("Mais detalhes serão enviados para o e-mail cadastrado!")
else:
    autorizacao = input("Você tem autorização dos seus pais? S- SIM, N- NÃO: ")
    if autorizacao == "S":
        print(f"Sua participação foi autorizada, aluno de RM {rm}")
        print("Mais informações serão enviadas para o e-mail dos responsáveis")
    else:
        print("Sua participação foi negada, pois você não é maior de idade.")