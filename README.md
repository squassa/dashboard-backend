# Dashboard Backend

API REST desenvolvida com **Spring Boot** para fornecer os dados de um dashboard de vendas.

A aplicação disponibiliza endpoints para:

- gráfico de **CMV ao longo dos meses**
- **grupos mais vendidos**
- **produtos menos vendidos**

## Tecnologias utilizadas

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- MySQL
- Maven

## Estrutura do projeto

O projeto está organizado nas seguintes camadas:

- `model` → entidades JPA
- `repository` → acesso ao banco de dados
- `controller` → endpoints REST

## Endpoints disponíveis

### CMV
- `GET /cmv` → lista os dados do gráfico de CMV
- `POST /cmv` → cadastra um novo registro de CMV

### Grupos mais vendidos
- `GET /grupos` → lista os grupos mais vendidos
- `POST /grupos` → cadastra um novo grupo

### Produtos menos vendidos
- `GET /produtos` → lista os produtos menos vendidos
- `POST /produtos` → cadastra um novo produto

## Pré-requisitos

Antes de executar o projeto, é necessário ter instalado:

- Java 21
- Maven
- MySQL

## Configuração do banco de dados

Crie um banco de dados MySQL com o nome:
```sql
CREATE DATABASE dashboard;
```
## Linux/Ubuntu
Defina as variáveis antes de iniciar a aplicação
```bash
export DB_USERNAME=seu_usuario
export DB_PASSWORD=sua_senha
```
## Como executar o projeto
Na pasta do projeto, execute:
```bash
./mvnw spring-boot:run
```
A aplicação será iniciada em:
```
http://localhost:8080
```
## Dados iniciais
O projeto possui um arquivo data.sql para popular automaticamente o banco com dados de exemplo ao iniciar a aplicação.

Isso permite testar a API e o frontend sem necessidade de cadastrar os dados manualmente.

## Exemplos de teste
### Listar dados de CMV
```bash
curl http://localhost:8080/cmv
```
### Listar grupos mais vendidos
```bash
curl http://localhost:8080/grupos
```
### Listar produtos menos vendidos
```bash
curl http://localhost:8080/produtos
```
## Integração com o frontend

Este backend foi desenvolvido para ser consumido por uma aplicação React disponível no repositório correspondente do frontend.

O frontend consome os dados desta API para exibir:

- gráfico de CMV
- ranking de grupos mais vendidos
- lista de produtos menos vendidos

## Observações
O arquivo application.properties utiliza variáveis de ambiente para evitar exposição de credenciais sensíveis.
