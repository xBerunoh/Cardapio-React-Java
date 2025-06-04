# 🍽️ CRUD de Cardapio

Este projeto é um sistema **CRUD (Create, Read, Update, Delete)** para gerenciamento de comidas em um cardápio, composto por:

- **Front-end** em React com TypeScript.
- **Back-end** em Java utilizando Spring Boot.

O sistema permite **cadastrar, visualizar, editar e remover comidas** de um cardápio armazenado em um banco de dados relacional (PostgreSQL).

---

## 📁 Estrutura do Projeto

### Front-end
Aplicação React para interação com o usuário, com funcionalidades como:

- Listagem paginada de comidas
- Formulário para cadastrar novas comidas
- Edição e exclusão de pratos existentes

### Back-end
API RESTful desenvolvida com Spring Boot para gerenciar os dados das comidas no cardápio.

---

## ⚙️ Funcionalidades

- **Listar Comidas:** Exibe uma lista paginada de pratos do cardápio.
- **Cadastrar Comida:** Formulário para adicionar novos itens ao cardápio.
- **Editar Comida:** Atualiza informações de uma comida existente.
- **Excluir Comida:** Remove um prato do cardápio.

---

## 🛠️ Tecnologias Utilizadas

### Front-end
- React + TypeScript
- Axios (requisições HTTP)
- React Query (gerenciamento de estados assíncronos)

### Back-end
- Java 17+
- Spring Boot
- Spring Data JPA
- PostgreSQL (configurável via `application.properties`)
- Maven (gerenciamento de dependências)

---

## 🚀 Como Rodar o Projeto

### Pré-requisitos
- **Node.js** instalado (para o front-end)
- **Java 17+** instalado (para o back-end)
- **Maven**
- **PostgreSQL** configurado

### ⚠️ Observação
> É necessário configurar as credenciais do banco de dados no arquivo:  
> `src/main/resources/application.properties`

---

### Front-end
```bash
cd front/cardapio
npm install
npm run dev
