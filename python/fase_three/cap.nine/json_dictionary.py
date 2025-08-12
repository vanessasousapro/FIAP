#Importando o módulo JSON
import json

#Usando a função open para criar um objeto do tipo arquivo
arquivo = open("C:\\Users\\vanes\\Documents\\My_Projects_25\\FIAP\\arquivos\\agenda.json", "r", encoding="UTF-8")

#Colocando o conteúdo do arquivo em uma variável do tipo string
dicionario = json.loads(arquivo.read())

#Fechando o arquivo
arquivo.close()

#Usando o módulo loads para converter uma string no formato json em um dicionário
print(dicionario["Clark Kent"])
#Comprovando que o objeto agenda é do tipo dicionário
