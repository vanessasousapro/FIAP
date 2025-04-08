#Na oferta de um produto de crédito aos clientes, três informações são muito importantes apresentar ao cliente: valor da dívida, a taxa de juros e o número de parcelas para pagamento do empréstimo contraído junto à Fintech. Faça um programa que receba o valor de uma dívida e mostre uma tabela com os seguintes dados:

#- Valor da dívida, valor do juros, quantidade de parcelas e valor da parcela.

#Os juros e a quantidade de parcelas seguem a tabela:
#1 parcela = 0% de juros
#3 parcelas = 10% de juros
#6 parcelas = 15% de juros
#9 parcelas = 20% de juros
#12 parcelas = 25% de juros

#Observação: Na saída do programa, utilize estrutura de repetição para apresentar a listagem.

# Entrada do valor da dívida
valor_divida = float(input("Informe o valor da dívida: R$ "))

print("\n--- TABELA DE CONDIÇÕES DE PAGAMENTO ---\n")
print(f"{'Qtd. Parcelas':>14} | {'Valor Juros (R$)':>18} | {'Valor da Dívida (R$)':>22} | {'Valor da Parcela (R$)':>24}")
print("-" * 84)

# Parcelas possíveis
parcelas_lista = [1, 3, 6, 9, 12]

# Estrutura de repetição para verificar cada parcela e aplicar os juros com if
for parcelas in parcelas_lista:
    if parcelas == 1:
        juros = 0
    elif parcelas == 3:
        juros = 10
    elif parcelas == 6:
        juros = 15
    elif parcelas == 9:
        juros = 20
    elif parcelas == 12:
        juros = 25

    valor_juros = valor_divida * (juros / 100)
    valor_total = valor_divida + valor_juros
    valor_parcela = valor_total / parcelas

    print(f"{parcelas:>14} | {valor_juros:>18.2f} | {valor_total:>22.2f} | {valor_parcela:>24.2f}")
