
# Web Services com Spring Boot, JPA e Hibernate

Este é um projeto simples de um serviço web construído com Spring Boot, JPA, e Hibernate, desenvolvido como parte de um curso de Java. O projeto demonstra a criação de um modelo de domínio, a estruturação de camadas lógicas, a configuração de um banco de dados de teste, e a implementação de operações CRUD (Create, Retrieve, Update, Delete) com tratamento de exceções.

## Objetivos

- Criar um projeto Spring Boot com Java.
- Implementar um modelo de domínio.
- Estruturar camadas lógicas: resource, service, repository.
- Configurar banco de dados de teste utilizando H2.
- Povoar o banco de dados.
- Implementar operações CRUD.
- Tratar exceções.

## Modelo de Domínio

O projeto utiliza um modelo de domínio simples com entidades que representam usuários, pedidos, produtos e categorias. As associações entre essas entidades são configuradas para demonstrar relações como one-to-many e many-to-many.

### Entidades Principais

- **User**: Representa um usuário do sistema.
- **Order**: Representa um pedido realizado por um usuário.
- **Product**: Representa um produto disponível para compra.
- **Category**: Representa uma categoria de produtos.

## Camadas Lógicas

O projeto é estruturado em três camadas principais:

1. **Resource**: Controladores REST que expõem os endpoints da API.
2. **Service**: Camada de serviço que contém a lógica de negócios.
3. **Repository**: Interfaces que estendem `JpaRepository` para acesso ao banco de dados.

## Banco de Dados

### Banco de Dados de Teste (H2)

Durante o desenvolvimento, o projeto utiliza o banco de dados H2 em memória para testes. A configuração do H2 é realizada nos arquivos `application.properties` e `application-test.properties`.

**Dependências do Maven**:
```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-jpa</artifactId>
</dependency>

<dependency>
    <groupId>com.h2database</groupId>
    <artifactId>h2</artifactId>
    <scope>runtime</scope>
</dependency>
```

**Configuração do H2**:
```properties
spring.profiles.active=test
spring.jpa.open-in-view=true

spring.datasource.driverClassName=org.h2.Driver
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=

spring.h2.console.enabled=true
spring.h2.console.path=/h2-console

spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.defer-datasource-initialization=true
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

### Banco de Dados de Produção (PostgreSQL)

Para o ambiente de produção, o projeto está configurado para utilizar o PostgreSQL. O banco de dados local pode ser configurado utilizando o PgAdmin para criar uma base de dados chamada `springboot_course`.

**Dependência do Maven**:
```xml
<dependency>
    <groupId>org.postgresql</groupId>
    <artifactId>postgresql</artifactId>
    <scope>runtime</scope>
</dependency>
```

**Configuração do PostgreSQL**:
```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/springboot_course
spring.datasource.username=postgres
spring.datasource.password=1234567

spring.jpa.properties.hibernate.jdbc.lob.non_contextual_creation=true
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
```

## Endpoints da API

O projeto expõe vários endpoints REST para realizar operações CRUD nas entidades. Por exemplo:

- `GET /users` - Retorna todos os usuários.
- `POST /users` - Cria um novo usuário.
- `GET /orders/{id}` - Retorna detalhes de um pedido.
- `DELETE /products/{id}` - Deleta um produto.

## Tratamento de Exceções

O projeto inclui um tratamento básico de exceções para capturar e formatar erros HTTP apropriados ao realizar operações nos recursos. Classes específicas, como `ResourceNotFoundException` e `DatabaseException`, são usadas para lidar com erros comuns.

## Como Executar o Projeto

1. **Clonar o repositório**:
   ```bash
   git clone https://github.com/Caioosm/workshop-springboot3-jpa.git
   ```
2. **Navegar até o diretório do projeto**:
   ```bash
   cd seu-repositorio
   ```
3. **Configurar o banco de dados**:
   - Para testes, o banco H2 é configurado automaticamente.
   - Para produção, configure o PostgreSQL conforme as instruções acima.

4. **Executar a aplicação**:
   ```bash
   ./mvnw spring-boot:run
   ```
5. **Acessar o console do H2 (em desenvolvimento)**:
   - URL: `http://localhost:8080/h2-console`

## Tecnologias Utilizadas

- **Java 17**
- **Spring Boot**
- **Spring Data JPA**
- **Hibernate**
- **H2 Database (Desenvolvimento)**
- **PostgreSQL (Produção)**
- **Maven**

## Licença

Este projeto é distribuído sob a licença MIT. Consulte o arquivo `LICENSE` para mais detalhes.
