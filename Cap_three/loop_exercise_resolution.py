# Um grande cliente seu sofreu um ataque hacker: O servidor foi sequestrado por um software malicioso que criptografou todos os discos e pede a digitação de uma senha para a liberação da máquina. E é claro que os crimonosos exigem um pagamento para informar a senha.

# Ao analisar o código do programa deles, porém, você descobre que a senha é composta pela palavra "LIBERDADE" seguida do fatorial dos minutos que a máquina estiver marcando no momento da digitação da senha (Se minha máquina estiver marcando 5 minutos, a senha será (LIBERDADE120). Crie um programa que receba do usuário os minutos atuais e exiba na tela a senha necessária para desbloqueio.

minutos = int(input("Informe o número dos minutos do horário atual: "))
fatorial = minutos
for numero in range(1, minutos):
    fatorial = fatorial * numero

print(f"A senha é LIBERDADE{fatorial}")