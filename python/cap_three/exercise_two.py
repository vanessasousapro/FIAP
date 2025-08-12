# Olhando para o mercado de educação infantil, você e sua equipe decidem criar um aplicativo onde as crianças aprendam a controlar os seus gastos.
# Como forma de validar u, protótipo, foi solicitado que você crie u, script simples, em que o usuário deve informar QUANTAS TRANSAÇÕES financeiras realizadas ao longo de um dia e, na sequência, deve informar o VALOR DE CADA UMA das transações que realizou.
# Seu programa deverá exibir, ao final, o valor total gasto pelo usuário e também a média do valor de cada transação.

#INPUT =  QUANTAS TRANSAÇÕES financeiras realizadas ao longo de um dia...deve informar o VALOR DE CADA UMA das transações que realizou.

#PROCESSAMENTO = TOTAL gasto e MÉDIA de cada transação.

#OUTPUT = PRINT TOTAL e MÉDIA

quantidade_trasacoes = int(input("Informe a quantidade de transações: "))
total_transacoes = 0
for n_transacoes in range(1, quantidade_trasacoes + 1, 1):
    transacao = float(input(f"Por favor informe a transação de número{n_transacoes}"))
    total_transacoes = total_transacoes + transacao

media = total_transacoes / quantidade_trasacoes
print(f"Neste dia foi gasto R${total_transacoes} com uma média de {media} por transação.")