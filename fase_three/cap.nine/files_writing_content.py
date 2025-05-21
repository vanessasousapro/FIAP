# 'r' abrir para leitura (modo padrão)
# 'w' abrir para a escrita, sobrescrevendo o conteúdo
# 'x' abrir para a criação de arquivo, gerando uma falha se existir um arquivo de
# 'a' abrindo pra escrita, anexando o novo conteúdo ao final do conteúdo já existente
# 'b' abrir em modo binário
# 't' abrir em modo de texto (modo padrão)
# '+' abrir para atualização (escrita, leitura)

#Criando uma variável de texto
conteudo = "Há muito tempo atrás, em uma galáxia muito, muito distante..."

#Usando a função open para criar um objeto do tipo arquivo
#arquivo = open("C:\\Users\\vanes\\Documents\\My_Projects_25\\FIAP\\arquivos\\texto.txt", "w", encoding="UTF-8")

#Escrevendo o conteúdo da variável conteúdo dentro do arquivo w
#arquivo.write(conteudo)

arquivo = open("C:\\Users\\vanes\\Documents\\My_Projects_25\\FIAP\\arquivos\\texto.txt", "a", encoding="UTF-8")
arquivo.write("\nteste novo!")
#Fechando o arquivo
arquivo.close()