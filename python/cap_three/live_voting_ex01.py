# A Bidu é uma startup na área de Fintech fundada em 2011 que ajuda os usuários a controlar suas fontes de receitas, gastos, dívidas e investimentos.  Ela precisa realizar uma votação para escolher qual dia da semana é o melhor para a realização das lives com o time da mentoria financeira. Desenvolva um programa em que os colaboradores informem um dos 5 dias da semana (segunda-feira, terça-feira, quarta-feira, quinta-feira e sexta-feira) da sua preferência para participar da live. Verifique e exiba ao final, qual dia foi o escolhido pelos colaboradores.

# Observação: Verifique o número de colaboradores que irão participar da votação para programar sua estrutura de repetição.

# Ponto de atenção: É importante o programa validar a possibilidade de empate.

colaboradores = int(input('Informe o número de colaboradores: '))

# Inicialização das contagens de votos
segunda = 0
terca = 0
quarta = 0
quinta = 0
sexta = 0

# Coleta de votos
for i in range(colaboradores):
    voto = input(
        "Informe o dia da sua preferência (segunda-feira, terça-feira, quarta-feira, quinta-feira, sexta-feira): ")

    match voto.upper():
        case "SEGUNDA-FEIRA":
            segunda += 1
        case "TERÇA-FEIRA":
            terca += 1
        case "QUARTA-FEIRA":
            quarta += 1
        case "QUINTA-FEIRA":
            quinta += 1
        case "SEXTA-FEIRA":
            sexta += 1
        case _:
            print("O dia escolhido pelo colaborador é inválido!")

if segunda > terca and segunda > quarta and segunda > quinta and segunda > sexta:
    print("o dia escolhido pelo colaborador é: segunda-feira")
elif terca > segunda and terca > quarta and terca > quinta and terca > sexta:
    print("o dia escolhido pelo colaborador é: terça-feira")
elif quarta > segunda and quarta > terca and quarta > quinta and quarta > sexta:
    print("o dia escolhido pelo colaborador é: quarta-feira")
elif quinta > segunda and quinta > terca and quinta > quarta and quinta > sexta:
    print("o dia escolhido pelo colaborador é: quinta-feira")
elif sexta > segunda and sexta > terca and sexta > quarta and sexta > quinta:
    print("o dia escolhido pelo colaborador é: sexta")

# Armazenar os votos em um dicionário
votos = {
    "SEGUNDA-FEIRA": segunda,
    "TERÇA-FEIRA": terca,
    "QUARTA-FEIRA": quarta,
    "QUINTA-FEIRA": quinta,
    "SEXTA-FEIRA": sexta
}

# Encontrar o maior número de votos manualmente
maior_qnt_votos = 0
for qnt in votos.values():
    if qnt > maior_qnt_votos:
        maior_qnt_votos = qnt

# Coletar as opções com o maior número de votos
dias_vencedores = []
for dia, qnt in votos.items():
    if qnt == maior_qnt_votos:
        dias_vencedores.append(dia)

# Verifica e exibe o resultado
if len(dias_vencedores) == 1:
    print(f"O dia escolhido pelos colaboradores é: {dias_vencedores[0].lower()}")
else:
    if len(dias_vencedores) == 2:
        print(f"Houve um empate entre os dias: {dias_vencedores[0].lower()} e {dias_vencedores[1].lower()}.")
    else:
        print("Houve um empate entre os dias:", ', '.join(dia.lower() for dia in dias_vencedores[:-1]), "e",
              dias_vencedores[-1].lower() + ".")

