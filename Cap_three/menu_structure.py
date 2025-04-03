opcao = 0

while opcao != 4:
    print("1 - Rodar Funcionalidade 1")
    print("2 - Rodar Funcionalidade 2")
    print("3 - Rodar Funcionalidade 3")
    print("4 - Sair Do Sistema")
    opcao = int(input("Informe a opção desejada: "))

    if opcao == 1:
        print("Executando a funcionalidade 1")
    elif opcao == 2:
        print("Executando a funcionalidade 2")
    elif opcao == 3:
        print("Executando a funcionalidade 3")
    elif opcao == 4:
        print("Saindo do sistema...")
    else:
        print("Opção inválida")