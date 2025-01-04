# Implementação do Design Pattern Strategy em Java

## Descrição do Projeto

Este projeto demonstra a implementação do padrão de projeto Strategy em Java. O padrão Strategy é usado para encapsular diferentes algoritmos ou comportamentos em classes separadas, permitindo que eles sejam intercambiáveis de maneira flexível sem modificar o código do cliente.

No contexto deste projeto, implementamos diferentes formas de pagamento, como:

- Pagamento com cartão de crédito
- Pagamento via PayPal
- Pagamento por transferência bancária

## Benefícios do Padrão Strategy

1. **Flexibilidade**: Permite alterar o comportamento de forma dinâmica em tempo de execução.
2. **Manutenção Simples**: Facilita a adição de novos comportamentos sem modificar o código existente.
3. **Separação de Responsabilidades**: Cada estratégia é encapsulada em sua própria classe, promovendo um design limpo e modular.

## Estrutura do Projeto

O projeto contém as seguintes classes principais:

- **PaymentStrategy**: Interface que define o contrato para todas as estratégias de pagamento.
- **CreditCardPayment**: Implementação da estratégia de pagamento via cartão de crédito.
- **PayPalPayment**: Implementação da estratégia de pagamento via PayPal.
- **BankTransferPayment**: Implementação da estratégia de pagamento por transferência bancária.
- **PaymentContext**: Classe responsável por gerenciar a estratégia a ser utilizada.

Além disso, inclui:

- **Testes Unitários**: Garantem que as estratégias implementadas funcionam conforme esperado.

## Como Executar

1. Clone o repositório:
   ```bash
   git clone <url-do-repositorio>
   ```

2. Compile o projeto:
   ```bash
   javac -d bin src/**/*.java
   ```

3. Execute o programa principal:
   ```bash
   java -cp bin Main
   ```

4. Para executar os testes unitários:
   ```bash
   java -cp bin org.junit.runner.JUnitCore TestPaymentStrategies
   ```

## Exemplo de Uso

O código abaixo mostra como usar o padrão Strategy para selecionar dinamicamente uma estratégia de pagamento:

```java
PaymentContext context = new PaymentContext();

// Usando pagamento com cartão de crédito
context.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
context.pay(250.0);

// Alterando para pagamento via PayPal
context.setPaymentStrategy(new PayPalPayment("usuario@example.com"));
context.pay(150.0);
```

