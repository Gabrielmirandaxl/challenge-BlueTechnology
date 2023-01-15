# Olá, tudo bem? Me chamo Gabriel e seja bem vindo! 👋

# Challenge - Back End - BlueTechnology

CRUD feito com `vuejs` e `java` utilizando o framework `spring boot` para a vaga de estágio na empresa BlueTechnology.

## Documentação da API

#### Retorna todos os usuários

```http
  GET /user
``` 
#### Retorna um usuário

```http
  GET /user/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `Long` | **Obrigatório**. O ID do usuário que você quer |

#### Cadastrar um usuário


```http
  POST /user
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `name`      | `String` | **Obrigatório**. O nome do usuário |
| `email`      | `String` | **Obrigatório**. O email do usuário |
| `phone`      | `String` | **Obrigatório**. O telefone do usuário |
| `cpf`      | `String` | **Obrigatório**. O cpf do usuário |

#### Atualizar um usuário

```http
  PUT /user/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `Long` | **Obrigatório**. O ID do usuário que você quer |
| `name`      | `String` | **Obrigatório**. O nome do usuário |
| `email`      | `String` | **Obrigatório**. O email do usuário |
| `phone`      | `String` | **Obrigatório**. O telefone do usuário |
| `cpf`      | `String` | **Obrigatório**. O cpf do usuário |


#### Excluir um usuário

```http
  DELETE /user/${id}
```

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| `id`      | `Long` | **Obrigatório**. O ID do usuário que você quer |

## Funcionalidades

- Validações nos campos
- Testes unitários
- Criar usuário
- Buscar um usuário
- Buscar todos os usuário
- Atualizar um usuário
- Excluir um usuário


## 📥 download

Antes de começar, você precisará ter as seguintes ferramentas instaladas em sua máquina:
[Git](https://git-scm.com), [Node.js](https://nodejs.org/en/),  e [Java](https://www.java.com/pt-BR/).
Além disso, é bom ter um editor para trabalhar com código como [VSCode](https://code.visualstudio.com/) e [Intellij](https://www.jetbrains.com/pt-br/idea/download/).

### 💻 setup

```php
# clonar este repositório
$ git clone https://github.com/Gabrielmirandaxl/challenge-Bluetechnology

# acesse a pasta do projeto no intellij

# inicie a aplicação

```

### ▶ starting
```php

# aplicação rodando em:
  - Local:   http://localhost:3000/ 
```


<br>

## 🌐 aplicação
<img width="900" heigth="900"  src="https://github.com/Gabrielmirandaxl/gif/blob/main/2023-01-14%2021-46-26.gif">

<br>

## 🛠 tecnologias

As seguintes ferramentas/tecnologias foram usadas na construção e teste do projeto.
<br>

| logo               | Framework                  | Version      |
| :----------------- | :------------------------- | :----------: |
| <a href="https://vuejs.org/"><img align="center" alt="vue" height="30" width="40" src="https://github.com/devicons/devicon/blob/master/icons/html5/html5-original.svg"></a>| Html  |  `5.0.6`       |
| <a href="https://vuejs.org/"><img align="center" alt="vue" height="30" width="40" src="https://github.com/devicons/devicon/blob/master/icons/css3/css3-original.svg"></a>| Css  |  `3.0.0`       |
| <a href="https://www.javascript.com/" target="_blank"><img align="center" alt="js" height="30" width="40" src="https://raw.githubusercontent.com/devicons/devicon/master/icons/javascript/javascript-plain.svg"></a> | JavaScript  |  `4.6.3`      |
| <a href="https://www.postgresql.org/download/" target="_blank"><img align="center" alt="node" height="30" width="40" src="https://raw.githubusercontent.com/devicons/devicon/2ae2a900d2f041da66e950e4d48052658d850630/icons/nodejs/nodejs-original.svg"></a> | NodeJS      |  `16.14.2`       |
| <a href="https://materializecss.com/"><img align="center" alt="mongo" height="25" width="35" src="https://github.com/devicons/devicon/blob/master/icons/mongodb/mongodb-original.svg"></a> | mongoDB | `5.0.9` |


