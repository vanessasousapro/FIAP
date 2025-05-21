#Usando a função open para criar um objeto do tipo arquivo
arquivo = open("C:\\Users\\vanes\\Documents\\My_Projects_25\\FIAP\\arquivos\\texto.txt", "r", encoding="UTF-8")

#Printando o conteúdo do objeto do arquivo
#print(arquivo.read())

#Printando uma linha do arquivo
#print(arquivo.readline()) #Metodo que vai ler uma linha do arquivo

#Printando outra linha do arquivo
#print(arquivo.readline()) #Metodo que vai ler uma linha do arquivo

#Passando o conteúdo do arquivo para uma lista
lista_linhas = arquivo.readlines()

#Comprovando o tipo do objeto linhas_do_arquivo
print(type(lista_linhas))
print(lista_linhas)

#Colocando a lista em ordem alfabética
lista_linhas.sort()
print(lista_linhas)

#Exibindo uma linha por vez, utilizando o loop for e o metodo readlines()
for linha in lista_linhas:
    print(linha)

#Fechando o arquivo
arquivo.close()