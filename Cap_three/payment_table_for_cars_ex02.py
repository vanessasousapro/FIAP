# A compra de um veículo pode ser realizada parcelada. Crie um programa que receba o valor de um carro e mostre uma tabela com os seguintes dados: preço final, quantidade de parcelas e valor da parcela. Considere o seguinte:

# a) O preço final para compra à vista tem um desconto de 20%.

# b) A quantidade de parcelas pode ser 6, 12, 18, 24, 30, 36, 42, 48, 54 e 60.

# 6   -> 3%
# 12  -> 6%
# 18  -> 9%
# 24  -> 12%
# 30  -> 15%
# 36  -> 18%
# 42  -> 21%
# 48  -> 24%
# 54  -> 27%
# 60  -> 30%

# Observação: Na saída do programa, utilize estrutura de repetição para apresentar a listagem.

# Entrada do valor do carro
valor_carro = float(input("Informe o valor do carro: R$ "))

# Cálculo do valor à vista com 20% de desconto
preco_vista = valor_carro * 0.8
print("\n--- TABELA DE CONDIÇÕES DE PAGAMENTO ---")
print(f"\nÀ vista: R$ {preco_vista:.2f} (com 20% de desconto)\n")

# Lista de opções de parcelas
opcoes_parcelas = [6, 12, 18, 24, 30, 36, 42, 48, 54, 60]

# Cabeçalho da tabela
print(f"{'Parcelas':>10} | {'Preço Final':>15} | {'Valor da Parcela':>20}")
print("-" * 50)

# Loop com estrutura if para aplicar o percentual correspondente
for parcelas in opcoes_parcelas:
    if parcelas == 6:
        percentual = 3
    elif parcelas == 12:
        percentual = 6
    elif parcelas == 18:
        percentual = 9
    elif parcelas == 24:
        percentual = 12
    elif parcelas == 30:
        percentual = 15
    elif parcelas == 36:
        percentual = 18
    elif parcelas == 42:
        percentual = 21
    elif parcelas == 48:
        percentual = 24
    elif parcelas == 54:
        percentual = 27
    elif parcelas == 60:
        percentual = 30
    else:
        percentual = 0  # segurança

    preco_final = valor_carro * (1 + percentual / 100)
    valor_parcela = preco_final / parcelas
    print(f"{parcelas:>10}x | R$ {preco_final:>12.2f} | R$ {valor_parcela:>17.2f}")
