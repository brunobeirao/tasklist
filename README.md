# Tasklist
CRUD de tarefas básico desenvolvido com Springboot com Mysql e angularjs.

### Projeto

O projeto foi divido em API e frontend. Para abrir o projeto na IDE faça o clone do projeto e importe cada diretório(tasklist-api / tasklist-front) em separado na sua IDE.

### Execução
As instruções para execução são para Ubuntu.

Criar um banco de dados conforme o application.properties:

    spring.jpa.hibernate.ddl-auto=update
    spring.datasource.url=jdbc:mysql://127.0.0.1:3306/tasklist
    spring.datasource.username=root
    spring.datasource.password=root
    spring.jpa.database=mysql
    
Instalar e configurar Mysql:

	sudo apt-get install mysql-server
	
	sudo mysql
	
	ALTER USER 'root'@'localhost' IDENTIFIED WITH mysql_native_password BY 'root';
	
	FLUSH PRIVILEGES;
	
	CREATE DATABASE tasklist;
	USE tasklist;

	
Na raiz do projeto existe o arquivo **tasklist-1.0.0.jar**
Execute para subir a API:

    java -jar tasklist-1.0.0.jar
   
Acessar a pasta tasklist-front e digite o comando para subir o frontend:
      
    http-server -o -p 8081

Caso não tenha instalado o http-server:

    npm install http-server -g
    
Acesse http://localhost:8081


### Melhorias
 1- Testes: Desenvolver testes unitários antes de qualquer outra funcionalidade conforme as boas práticas.
 
 2- Configurar Docker.
 
 3- Bugs: Correção de bugs.
