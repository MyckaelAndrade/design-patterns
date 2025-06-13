![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)  
![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)

# ✈️ Atividade: Sistema de Venda de Pacotes de Viagem com Facade

Este projeto simula um sistema de venda de pacotes de viagem utilizando o padrão de projeto **Facade**. Ele integra diversos subsistemas como voo, hotel, aluguel de carro e pagamento para facilitar a compra de um pacote completo por parte do cliente.

---

<p align="center">
  <img src="https://media.giphy.com/media/xT9IgzoKnwFNmISR8I/giphy.gif" width="400" alt="Travel GIF">
</p>

## 🎯 Funcionalidades Principais

- **Venda de Passagens Aéreas**:
  - Escolha de classe (Econômica, Executiva, 1ª Classe)
  - Escolha de assento (A a F / fileiras 1 a 32)
  - Cálculo do valor baseado na classe e assento

- **Reserva de Hotel**:
  - Tipos de quarto: Simples, Executivo e Suíte Presidencial
  - Valor calculado por pessoa

- **Aluguel de Carro**:
  - Tipos disponíveis: Econômico, Executivo, Luxo
  - Valor calculado por diária

- **Pagamento**:
  - Formas disponíveis:
    - **PIX**: 10% de desconto
    - **Boleto**: 5% de desconto
    - **Débito**: valor normal
    - **Crédito**: até 6x com acréscimo de 3,99% a partir da 2ª parcela

- **Resumo da Compra**:
  - Dados dos compradores (nome e CPF)
  - Informações completas da compra
  - Valor total com detalhamento de descontos ou acréscimos

---

## 🧱 Estrutura do Projeto

```bash
PacoteViagem/
├── docs/
│   └── diagrama_uml.pdf         # Diagrama UML do projeto
├── src/
│   ├── Cliente.java             # Representa o cliente com nome e CPF
│   ├── VooSistema.java          # Gerencia reservas e preços de voos
│   ├── HotelSistema.java        # Gerencia reservas e preços de hotel
│   ├── CarroSistema.java        # Gerencia reservas e preços de aluguel de carro
│   ├── PagamentoSistema.java    # Calcula o valor final conforme forma de pagamento
│   ├── PacoteFacade.java        # Classe Facade que integra todos os subsistemas
│   └── Main.java                # Classe principal que executa a simulação
├── CONTRIBUTING.md              # Como contribuir com este projeto
└── README.md                    # Este arquivo
```

---

## 👨‍💻 Autor
Este projeto foi desenvolvido como exercício acadêmico para demonstrar a aplicação prática do padrão de projeto Facade.
Sinta-se à vontade para clonar, modificar e usar com os devidos créditos!

---

## 📄 Diagrama UML
Para visualizar o diagrama UML do projeto, [clique aqui](https://github.com/MyckaelAndrade/design-patterns/blob/MyckaelAndrade-atividade-10/Atividade%2010/docs/diagrama_uml.pdf)
