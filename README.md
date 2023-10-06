# Help-Desk
Esse é um sistema para gerenciamento de chamados simulando um simples Help Desk em Angular 12 e Spring Boot 2.
Alguns conceitos vistos e implementados nesse projeto:
- Spring Data JPA
- Hibernate
- Autenticação com Tokens JWT
- Autorização com Tokens JWT
- Conceitos de Angular 12
- Conceitos básicos de Typescript, HTML5 e CSS3
- Consumir uma API REST usando a ferramenta Postman
- Consumir uma API REST usando o front desenvolvido
- Utilização do banco de dados h2 em tempo de compilação
- Tratamento de exceções de forma personalizada
- Desenvolvimento em camadas usando o padrão MVC
- Padrão DTO (Data Transfer Objects)
- PostgreSQL em projeto Spring Boot
- Implementação de perfis de Teste e Desenvolvimento
- Validações com Validations
- Protocolo HTTP no padrão REST
 ## Backend
 ### Configuração e Pré-requisitos
   - Java 11: Certifique-se de ter o Java 11 ou superior instalado na máquina.
   - Maven: É necessário ter o Maven instalado para gerenciar as dependências e compilar o projeto.
### Setup do Banco de Dados
- Banco PostgreSQL utilizado para desenvolvimento, deve ser criado uma base local chamada `db_helpdesk`.
- O banco de dados H2 utilizado para testes, que é um banco de dados em memória, facilitando a configuração e execução do projeto. Não são necessárias configurações adicionais.
## Frontend
Este projeto foi gerado com `Angular CLI` versão 12.0.3.
### Servidor de desenvolvimento
Execute `ng serve` para um servidor de desenvolvimento. Navegue até `http://localhost:4200/`. O aplicativo será recarregado automaticamente se você alterar algum dos arquivos de origem.
