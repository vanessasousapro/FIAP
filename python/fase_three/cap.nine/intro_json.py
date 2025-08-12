#Importando o módulo json
import json

#Criando um dicionário para usarmos como exemplo
contatos = {
    "Clark Kent":
        {"Celular":"123456789",
         "Email":"super@krypton.com"},
    "Bruce Wayne":
        {"Celular":"987654321",
         "Email":"bat@caverna.com.br"}
}

#Convertendo o dicionário para uma string o formato json
conteudo_string = json.dumps(contatos, indent=4, ensure_ascii=False)

#Criando um arquivo
arquivo = open("C:\\Users\\vanes\\Documents\\My_Projects_25\\FIAP\\arquivos\\agenda.json", "w", encoding="UTF-8")

#Escrevendo o JSON dentro do arquivo
arquivo.write(conteudo_string)

#Fechando o arquivo
arquivo.close()