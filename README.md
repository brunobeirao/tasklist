# Tasklist

### Projeto

O projeto foi divido em API e frontend. Para abrir o projeto na IDE faça o clone do projeto e importe cada diretório(tasklist-api / tasklist-front) em separado na sua IDE.

### Execução
As instruções para execução são para SO linux.
Na raiz do projeto existe o arquivo **tasklist-1.0.0-SNAPSHOT.jar**
Execute para subir a API:

    java -jar tasklist-1.0.0-SNAPSHOT.jar
   
Acessar a pasta tasklist-front e digite o comando para subir o frontend:
      
    http-server -o

Caso não tenha instalado o http-server:

    npm install http-server -g
    
Acesse http://localhost:8080


### Melhorias

 - Docker: Configurar o docker para subir o ambiente inteiro.
 - Testes: Desenvolver testes unitários.
 - Bugs: Correção de bugs.
