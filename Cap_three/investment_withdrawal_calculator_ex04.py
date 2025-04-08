# Toda vez que um cliente realiza um resgate de uma aplicação financeira, o sistema deve calcular a alíquota de imposto de renda (IR) que deve ser aplicada sobre aquele resgate, levando em consideração o número de dias que o valor permaneceu aplicado, de acordo com a tabela abaixo:

# Até 180 dias = alíquota de 22,5% de IR
# De 181 a 360 dias = alíquota de 20% de IR
# De 361 a 720 dias = alíquota de 17,5% de IR.
# Acima de 720 dias = alíquota de 15% de IR.

# É o que acontece, por exemplo, com o Certificado de Depósito Bancário (CDB), uma aplicação de renda fixa comumente oferecida pelas Fintechs. Outros investimentos em renda fixa, como LCI e LCA, respectivamente, Letra de Crédito Imobiliário e Letra de Crédito do Agronegócio são isentos de imposto de renda. Escreva um programa que receba o tipo de investimento do qual se deseja realizar um resgate (1 para CDB, 2 para LCI e 3 para LCA), o valor a ser resgatado e o número de dias que esse valor permaneceu investido e, se for o caso, calcule o valor referente ao imposto de renda.

# Atenção! O programa deve consistir se o investimento fornecido é válido, ou seja, 1, 2 o 3.

# Entrada de dados
print("Tipos de investimento:")
print("1 - CDB (tributável)")
print("2 - LCI (isento)")
print("3 - LCA (isento)")

tipo = int(input("Informe o tipo de investimento (1, 2 ou 3): "))

# Verificação de tipo de investimento válido
if tipo != 1 and tipo != 2 and tipo != 3:
    print("Tipo de investimento inválido. Por favor, informe 1, 2 ou 3.")
else:
    valor_resgate = float(input("Informe o valor a ser resgatado (R$): "))
    dias = int(input("Informe o número de dias que o valor ficou investido: "))

    if tipo == 1:
        if dias <= 180:
            aliquota = 22.5
        elif dias <= 360:
            aliquota = 20.0
        elif dias <= 720:
            aliquota = 17.5
        else:
            aliquota = 15.0

        valor_ir = valor_resgate * (aliquota / 100)
        print(f"\nAplicação CDB - IR de {aliquota}%")
        print(f"Valor resgatado: R$ {valor_resgate:.2f}")
        print(f"Valor do imposto de renda: R$ {valor_ir:.2f}")
        print(f"Valor líquido a receber: R$ {valor_resgate - valor_ir:.2f}")

    else:
        if tipo == 2:
            tipo_nome = "LCI"
        else:
            tipo_nome = "LCA"

        print(f"\nAplicação {tipo_nome} - Isenta de imposto de renda.")
        print(f"Valor resgatado: R$ {valor_resgate:.2f}")

