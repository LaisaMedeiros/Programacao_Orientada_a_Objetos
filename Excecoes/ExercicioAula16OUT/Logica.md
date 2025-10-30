| Aspecto | Checked (saldo > 1000) | Unchecked (saldo < 0) |
|---------|------------------------|------------------------|
| **Herda de** | `extends Exception` | `extends RuntimeException` |
| **Obrigatório tratar?** | SIM | NÃO |
| **Uso no método** | `throws` na assinatura | Sem `throws` |
| **Tratamento** | Try-catch obrigatório | Opcional |
| **Quando usar** | Condições recuperáveis | Erros de programação |
| **Exemplo no código** | `deposito()` | `retirada()`, `transferencia()` |
| **Compilador** | Força tratamento | Ignora |
| **Fluxo recomendado** | Tentar novamente | Apenas informar erro |