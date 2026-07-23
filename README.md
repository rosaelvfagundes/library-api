# 📚 Library API

Uma API REST para gerenciamento de uma livraria, desenvolvida com **Java** e **Spring Boot** como projeto de estudos para revisar conceitos fundamentais do ecossistema Spring e boas práticas de desenvolvimento backend.

O projeto está sendo construído de forma incremental, registrando cada etapa de evolução através do histórico de commits e da documentação do repositório.

---

## 🎯 Objetivos

* Revisar Java e Programação Orientada a Objetos.
* Consolidar conhecimentos em Spring Boot.
* Praticar desenvolvimento de APIs REST.
* Revisar modelagem e consultas em PostgreSQL.
* Explorar gradualmente os principais módulos do ecossistema Spring.
* Construir um projeto que reflita uma evolução técnica contínua.

---

## 🛠️ Tecnologias

* Java 21
* Spring Boot
* Spring Web
* Spring Data JPA
* PostgreSQL
* Maven
* Docker

---

## 📂 Arquitetura do Projeto

O projeto utiliza uma arquitetura em camadas para facilitar a organização e o entendimento dos conceitos do Spring.

```text
src/main/java
│
├── business
│   ├── services
│   └── exceptions
│
├── data
│   ├── entities
│   ├── repositories
│   └── criteria
│
├── infra
│   └── config
│
└── presentation
    ├── controllers
    ├── dtos
    └── advice
```

---

## 🚀 Funcionalidades

### Autor

* ✅ Cadastro de autores
* ✅ Consulta de autores
* ✅ Atualização de autores
* ✅ Remoção de autores

### Livro

* ⏳ Em desenvolvimento

---

## 📖 Roadmap

### Fase 1 — Fundamentos

* [x] Estrutura inicial do projeto
* [x] Configuração do PostgreSQL
* [x] CRUD de Autor
* [ ] CRUD de Livro
* [ ] Relacionamento Autor × Livro

### Fase 2 — Boas práticas

* [ ] DTOs
* [ ] Bean Validation
* [ ] Tratamento global de exceções
* [ ] Mapeamento de objetos

### Fase 3 — Persistência

* [ ] Paginação
* [ ] Ordenação
* [ ] Specifications
* [ ] Consultas customizadas

### Fase 4 — Qualidade

* [ ] JUnit 5
* [ ] Mockito
* [ ] Testcontainers
* [ ] JaCoCo
* [ ] SonarQube

### Fase 5 — Infraestrutura

* [ ] Flyway
* [ ] Docker Compose
* [ ] Spring Security
* [ ] JWT
* [ ] OpenAPI / Swagger

---

## 📌 Status do Projeto

🚧 Em desenvolvimento.

O objetivo deste repositório não é apenas entregar uma API funcional, mas registrar a evolução dos estudos em Java e Spring Boot por meio de commits incrementais e da implementação gradual de boas práticas utilizadas no desenvolvimento de aplicações backend.

---

## 👨‍💻 Autor

**Rosael Fagundes**

Desenvolvedor Java em constante evolução, utilizando este projeto como laboratório para aprofundar conhecimentos em Java, Spring Boot, PostgreSQL e arquitetura de software.
