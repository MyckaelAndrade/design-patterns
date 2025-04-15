![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)

# 📋 Atividade 3: Padrão MVC, DAO e BO em Java

O objetivo deste projeto é demonstrar de forma prática a aplicação dos padrões de projeto **MVC (Model-View-Controller)**, **DAO (Data Access Object)** e **BO (Business Object)** em Java, utilizando um **banco de dados baseado em arquivo** (`clientes.txt`) para armazenar os dados de forma persistente.

---

<p align="center">
  <img src="https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExaTd0bnhicnd3aHQzdGlidGZldmVyMzZ2bmF4eG03a3RvbW10eW9qbyZlcD12MV9naWZzX3NlYXJjaCZjdD1n/qgQUggAC3Pfv687qPC/giphy.gif" width="400" alt="Java animated gif">
</p>

## 🎯 Funcionalidades Principais

Este sistema simula um pequeno cadastro de clientes, onde o usuário pode:
- Cadastrar um novo cliente (nome + CPF)
- Listar todos os clientes cadastrados

---

## 🧱 Estrutura do Projeto

```bash
ProjetoClienteMVC/
├── docs/
│   ├── diagrama_uml.pdf # Representação do projeto em UML
├── src/
│   ├── model/           # Representa as entidades do sistema
│   │   └── Cliente.java
│   ├── dao/              # Responsável pelo acesso aos dados
│   │   └── ClienteDAO.java
│   ├── bo/               # Contém as regras de negócio
│   │   └── ClienteBO.java
│   ├── view/            # Responsável pela interação com o usuário (console)
│   │   └── ClienteView.java
│   ├── controller/         # Controla o fluxo da aplicação
│   │   └── ClienteController.java
│   └── Main.java         # Classe principal para execução
├── clientes.txt          # Banco de dados em arquivo
└── README.md             # Este arquivo

```

---

## 👨‍💻 Autor

Este projeto foi desenvolvido como exemplo didático. Para dúvidas ou sugestões, entre em contato!

---

## 📄 Diagrama UML

Para visualizar o diagrama UML do projeto, [Clique Aqui](https://github.com/MyckaelAndrade/design-patterns/blob/MyckaelAndrade-atividade-3/Atividade%203/docs/diagrama_uml.pdf)
