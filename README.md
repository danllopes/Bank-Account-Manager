# Programa de Cadastro e Gestão de Conta Bancária

Este é um projeto desenvolvido como parte do estudo de Encapsulamento, Construtores, Sobrecarga e Programação Orientada a Objetos (POO) no curso do professor Nélio Alves, oferecido pela EducandoWeb. 
O projeto foi desenvolvido utilizando Java 21 e a IDE IntelliJ IDEA.

## Descrição do Projeto

O programa simula o cadastro e a gestão de contas bancárias, seguindo as seguintes regras:

- Para cadastrar uma conta bancária, são necessários o número da conta, o nome do titular e um valor de depósito inicial (opcional).
- Uma vez aberta, o número da conta não pode ser alterado.
- O nome do titular pode ser alterado.
- O saldo da conta não pode ser alterado diretamente; apenas por meio de depósitos e saques.
- Cada saque realizado é sujeito a uma taxa de $ 5.00.
- A conta pode ter saldo negativo se não houver fundos suficientes para cobrir o saque e a taxa.

## Funcionalidades Implementadas

- Cadastro de conta bancária com ou sem depósito inicial.
- Realização de depósitos na conta.
- Realização de saques na conta, com cobrança da taxa de $ 5.00.
- Exibição dos dados da conta após cada operação.

## Tecnologias Utilizadas

- Java 21
- IntelliJ IDEA

## Como Executar

1. Clone o repositório para o seu ambiente local.
2. Abra o projeto no IntelliJ IDEA.
3. Execute o programa a partir do método `main` na classe `Main`.

## Exemplo de Uso

Ao executar o programa, você será solicitado a cadastrar uma nova conta bancária. Você terá a opção de informar ou não um valor de depósito inicial. Após o cadastro, você poderá realizar operações de depósito e saque, sempre visualizando os dados atualizados da conta.
