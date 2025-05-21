#Usando a função open para criar um objeto do tipo arquivo
arquivo = open("C:\\Users\\vanes\\Documents\\My_Projects_25\\FIAP\\arquivos\\texto.txt", "r", encoding="UTF-8")
#Verificando o tipo do objeto arquivo
print(type(arquivo))
#Printando o objeto arquivo
print(arquivo)
#Printando o conteúdo do objeto arquivo
print(arquivo.read())
#Fechando o arquivo
arquivo.close()