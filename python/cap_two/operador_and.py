# Para acessar um sistema, o usuário deve digitar o username darth_vader e a senha 1138
# Crie um script que receba e valide estar informações de acesso....

username = input("Digite o seu nome de usuário: ")
senha = input("Digite a senha deste usuário: ")

if username.lower() == "darth_vader" and senha == "1128":
    print("Login bem sucedido!")
else:
    print("Login não autorizado!")