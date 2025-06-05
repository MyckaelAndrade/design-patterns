![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)

# 📋 Plataforma de Vídeo On-Demand com Padrão Observer

Este projeto simula uma plataforma de streaming (como Netflix), onde os **usuários podem se inscrever para receber notificações automáticas** sempre que novos filmes ou séries forem adicionados, com base nos **gêneros de interesse**.  
O sistema foi implementado em **Java** utilizando o **padrão de projeto Observer**.

---

<p align="center">
  <img src="https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExYnA3ZWdzbGFrbTE2bmFyemVlZTQ5ZXd3ZTNnN29odDdhcXh4Y3dkOSZlcD12MV9naWZzX3NlYXJjaCZjdD1n/UcK7JalnjCz0k/giphy.gif" width="400" alt="Notificações Observer Java">
</p>

---

## 🎯 Funcionalidades Principais

- Cadastro de usuários interessados em receber notificações
- Adição de novos títulos (filmes/séries) por gênero
- Notificações automáticas para usuários inscritos em determinados gêneros
- Simulação completa com 5 usuários

---

## 🧱 Estrutura do Projeto

```bash
ObserverStreaming/
├── docs/
│   └── diagrama_uml.pdf     # Diagrama UML com os relacionamentos do Observer
├── src/
│   ├── Observer.java         # Interface Observer (usuários)
│   ├── Subject.java          # Interface Subject (plataforma)
│   ├── Usuario.java          # Implementa Observer (cliente)
│   ├── PlataformaStreaming.java # Implementa Subject (serviço)
│   └── Main.java             # Classe principal com simulação
└── README.md                 # Este arquivo
```

---

## Conceitos Aplicados
Padrão Observer: notificação de múltiplos usuários automaticamente
Interfaces e abstrações para desacoplamento entre classes
Programação Orientada a Objetos (POO)
Simulação realista com múltiplos usuários e gêneros

---

## Como Funciona?
Usuários se inscrevem em um ou mais gêneros:

Ação
Comédia
Terror
Anime
Ficção Científica

Quando um novo título é adicionado pela plataforma, os usuários inscritos naquele gênero são automaticamente notificados.

---

📄 Diagrama UML
Para visualizar o diagrama UML com os relacionamentos do padrão Observer, [clique aqui](https://github.com/MyckaelAndrade/design-patterns/blob/MyckaelAndrade-atividade-13/Atividade%2013/docs/diagrama_uml.pdf)

---

👨‍💻 Autor
Este projeto foi desenvolvido por Myckael Andrade como atividade acadêmica para fixar o padrão de projeto Observer.
Sinta-se à vontade para clonar, estudar ou sugerir melhorias!

---