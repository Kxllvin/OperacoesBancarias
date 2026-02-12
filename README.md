# 💰 Operações Bancárias - Java Backend

Projeto desenvolvido para simular operações bancárias básicas e evoluído com foco em arquitetura backend.

Inicialmente criado como aplicação de console, o sistema foi refatorado aplicando boas práticas de desenvolvimento, preparando a base para futura migração para API REST com Spring Boot.

---

## 🚀 Funcionalidades Atuais

- Depósito
- Saque com validação de saldo
- Consulta de saldo
- Validação de valores inválidos
- Tratamento de exceções customizadas
- Uso de BigDecimal para operações financeiras

---

## 🏗️ Arquitetura Atual

src/com/operacoesbancarias

│

├── app → Camada de entrada (SimulacaoBancaria)

├── model → Entidade de domínio (Conta)

├── service → Camada de serviço (ContaService)

└── exception → Exceções customizadas



### 🔹 Model (Domínio)
Contém a entidade `Conta`, responsável por:

- Encapsulamento do saldo
- Validações internas
- Regras de negócio
- Lançamento de exceções

### 🔹 Service
Camada intermediária que orquestra as operações da conta.

Essa separação facilita a migração para um controller REST futuramente.

---

## 🧱 Preparação para API REST

A arquitetura já está organizada para permitir a seguinte evolução:

### Estrutura futura planejada:

controller → service → model → repository


Próxima etapa de evolução:

- Substituir a classe `SimulacaoBancaria` por um `ContaController`
- Adicionar Spring Boot
- Criar endpoints REST:
  - POST /conta/depositar
  - POST /conta/sacar
  - GET  /conta/saldo
- Adicionar persistência (H2 ou PostgreSQL)
- Implementar testes automatizados

---

## 💡 Conceitos Aplicados

- Orientação a Objetos
- Encapsulamento
- Separação de responsabilidades
- Uso de BigDecimal para cálculos financeiros
- Tratamento de exceções
- Organização em camadas

---

## 🧮 Por que BigDecimal?

Operações financeiras exigem precisão.  
O uso de `double` pode causar erros de arredondamento.

Por isso, o sistema utiliza `BigDecimal`, padrão recomendado para sistemas financeiros em Java.

---

## ▶️ Como Executar (Versão Atual - Console)

1. Clone o repositório:

git clone https://github.com/Kxllvin/OperacoesBancarias.git

2. Compile o projeto.

3. Execute: SimulacaoBancaria

---

## 📈 Roadmap do Projeto

- [x] Estrutura em camadas
- [x] Encapsulamento da entidade
- [x] Uso de BigDecimal
- [x] Exceção customizada
- [x] Camada Service
- [ ] Adicionar Maven
- [ ] Implementar testes com JUnit
- [ ] Migrar para Spring Boot
- [ ] Criar API REST
- [ ] Adicionar persistência com banco de dados

---

## 👨‍💻 Autor

Kelvin Alves


