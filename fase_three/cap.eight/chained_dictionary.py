contatos = {
    "Clark Kent":
        {"Celular": "123456789",
         "Email": "super@krypton.com"},
    "Bruce Wayne":
        {"Celular": "987654321",
         "Email": "bat@caverna.com.br"}
}

for nome, formas_contato in contatos.items():
    print(f"{nome}")
    for tipo, contato in formas_contato.items():
        print(f"{tipo} - {contato}")
    print("---------------------")