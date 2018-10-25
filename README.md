# Tasklist
CRUD de tarefas básico desenvolvido com Springboot com Mysql e angular.

### Projeto

O projeto foi divido em API e frontend. Para abrir o projeto na IDE faça o clone do projeto e importe cada diretório(tasklist-api / tasklist-front) em separado na sua IDE.

### Execução
As instruções para execução são para SO linux.

Criar um banco de dados conforme o application.properties:

    spring.jpa.hibernate.ddl-auto=update
    spring.datasource.url=jdbc:mysql://127.0.0.1:3306/tasklist
    spring.datasource.username=root
    spring.datasource.password=root
    spring.jpa.database=mysql

Na raiz do projeto existe o arquivo **tasklist-1.0.0-SNAPSHOT.jar**
Execute para subir a API:

    java -jar tasklist-1.0.0-SNAPSHOT.jar
   
Acessar a pasta tasklist-front e digite o comando para subir o frontend:
      
    http-server -o -p 8081

Caso não tenha instalado o http-server:

    npm install http-server -g
    
Acesse http://localhost:8081


### Melhorias

 - Docker: Configurar o docker para subir o ambiente inteiro.
 - Testes: Desenvolver testes unitários.
 - Bugs: Correção de bugs.
