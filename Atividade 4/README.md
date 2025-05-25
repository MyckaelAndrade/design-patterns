![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)

# 🔐 Atividade: Sistema de Login com Singleton

O objetivo deste projeto é simular um sistema de login utilizando o padrão de projeto **Singleton**, com aplicação dos princípios **SOLID**, e proteção contra acessos automatizados por meio de uma verificação tipo **Captcha** (com números e símbolos aleatórios).

---

<p align="center">
  <img src="https://media.giphy.com/media/v1.Y2lkPTc5MGI3NjExdWx2NGc5c2Y5bWxta3IyYmdtazMxbXpiYzNieTJhcWdxeHE0dHE2cCZlcD12MV9naWZzX3NlYXJjaCZjdD1n/zOvBKUUEERdNm/giphy.gif" width="400" alt="Login GIF">
</p>

## 🎯 Funcionalidades Principais

- Solicita **nome de usuário** e **senha**
- Gera um **captcha aleatório** com números e símbolos
- Solicita que o usuário digite corretamente o captcha para continuar
- Valida as credenciais e o captcha
- Exibe mensagem de sucesso ou falha
- Utiliza o padrão **Singleton** para garantir uma única instância do controle de login

---

## 🧱 Estrutura do Projeto

```bash
SistemaLoginSingleton/
├── docs/
│   └── diagrama_uml.pdf        # Representação UML do sistema
├── src/
│   ├── auth/                   # Camada de autenticação
│   │   ├── IAuthService.java
│   │   └── AuthService.java
│   ├── bot/                    # Geração e validação de captcha
│   │   ├── ICaptchaGenerator.java
│   │   └── CaptchaGenerator.java
│   ├── core/                   # Controlador Singleton
│   │   └── LoginController.java
│   └── Main.java               # Classe principal para execução
└── README.md                   # Este arquivo
```

---

## 👨‍💻 Autor
Este projeto foi desenvolvido por Myckael Andrade como parte de uma atividade acadêmica.
Contribuições, sugestões ou dúvidas são sempre bem-vindas!

---

## 📄 Diagrama UML
Para visualizar o diagrama UML do projeto, [clique aqui](https://github.com/MyckaelAndrade/design-patterns/blob/MyckaelAndrade-atividade-4/Atividade%204/docs/diagrama_uml.pdf)
