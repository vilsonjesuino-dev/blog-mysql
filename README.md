# Blog MySQL

Este é um projeto de blog simples que utiliza o MySQL como banco de dados para armazenar informações relacionadas a usuários, posts e comentários.

## Requisitos

- Java JDK 8 ou superior
- MySQL Server
- Biblioteca de conexão MySQL para Java (por exemplo, MySQL Connector/J)

## Configuração do Banco de Dados

1. Crie um banco de dados no MySQL para o projeto do blog (por exemplo, `blog_mysql`).
2. Utilizaremos Intellij IDE para o projeto
3. Configure as informações de conexão com o banco de dados no arquivo `pom.xml` utilizaremos projeto maven archetype `org.apache.maven.archetypes:maven-archetype-quickstart`.

## Funcionalidades

O projeto implementa as seguintes funcionalidades:

- Gerenciamento de usuários:
    - Registro de novos usuários.
    - Autenticação de usuários existentes.

- Gerenciamento de posts:
    - Adição de novos posts.
    - Exibição de todos os posts.
    - Exclusão de posts.

- Gerenciamento de comentários:
    - Adição de novos comentários em posts.
    - Exibição de comentários de um post específico.
    - Exclusão de comentários.

## Executando o Projeto

1. Configure as dependências e importe o projeto em sua IDE preferida, adicione no arquivo `pom.xml` a configuração do maven, `MySQL Connector Java` e `Junit Maven Repository`
2. Certifique-se de ter o MySQL Server em execução.
3. Vamos utilizar test para executar nossa aplicação.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir problemas (issues) ou enviar pull requests para melhorar este projeto de blog.

## Licença

Este projeto é licenciado sob a [MIT License](LICENSE).

## Contato

Se você tiver alguma dúvida ou sugestão sobre o projeto, entre em contato por meio do email [vilsonjesuino.dev@gmail.com](mailto:vilsonjesuino.dev@gmail.com).
