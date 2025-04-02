# Você foi procurado por um aluno do curso de Produção Multimídia do FIAP ON para desenvolver um trabalho em parceria: um serviço em que as pessoas possam usar um stúdio profissional para gravar seus vídeos para o YouTube com máxima qualidade. O serviço ganha dinheiro por meio de um sistema de assinaturas e de Bônus calculado por uma porcentagem sobre o faturamento que o canal do cliente obteve ao longo do ano.
# Sua tarefa é criar um algoritmo que receba o tipo de assinatura do cliente, o faturamento anual dele e que calcule e exiba qual o valor do bônus que o cliente deve pagar a vocês. A tabela a baixo mostra a porcentagem de acordo com cada nível de assinatura:
# Nível Basic -> 30%
# Nível Silver -> 20%
# Nível Gold -> 10%
# Nível Platinum -> 5%

#INPUT -> Assinatura do cliente e Faturamento anual.
faturamento_anual = float(input("Por favor, informe seu faturamento anual: "))
tipo_assinatura = input("Por favor, informe o seu tipo de assinatura: \nBasic\nSilver\nGold\nPlatinum\n")
bonus = 0

#PROCESSAMENTO -> Bônus calculado por uma porcentagem sobre o faturamento.
if tipo_assinatura.upper() == "BASIC":
    bonus = faturamento_anual * 0.3
elif tipo_assinatura.upper() == "SILVER":
    bonus = faturamento_anual * 0.2
elif tipo_assinatura.upper() == "GOLD":
    bonus = faturamento_anual * 0.1
elif tipo_assinatura.upper() == "PLATINUM":
    bonus = faturamento_anual * 0.05
else:
    print("Tipo de assinatura inválida")

#OUTPUT -> valor do bônus que o cliente deve pagar
print(f"Para um faturamento anual de {faturamento_anual} o bônus é de {bonus}")


