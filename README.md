# Sistema Bancário em Java

Este projeto é um sistema bancário simples desenvolvido em Java, permitindo operações como autenticação de usuário, consulta de saldo, depósito e saque.

## Estrutura do Projeto
- **src/**: Código-fonte principal
  - **Main.java**: Classe principal para execução do programa
  - **view/Menu.java**: Gerencia o menu de opções e interação com o usuário
  - **controller/Banco.java**: Lógica central do banco, autenticação e gerenciamento de contas
  - **model/Conta.java**: Modelo da entidade Conta, com métodos para saque, depósito e autenticação

## Como Executar
1. Certifique-se de ter o Java instalado (JDK 8 ou superior).
2. Compile os arquivos:
   ```sh
   javac src/*.java src/model/*.java src/controller/*.java src/view/*.java
   ```
3. Execute o programa principal:
   ```sh
   java -cp src Main
   ```

## Funcionalidades
- Autenticação de conta bancária (número e senha)
- Consultar saldo
- Realizar depósito
- Realizar saque

## Exemplo de Uso
Ao iniciar o programa, informe o número da conta e a senha para autenticação. Após o login, utilize o menu para realizar operações:
- [1] Consultar saldo
- [2] Depositar
- [3] Sacar
- [0] Sair

## Autor
- Matheus Cavalheiro de Camargo

## Licença
Este projeto é livre para uso educacional.
