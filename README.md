# java-exercises

## 1. Classes, Objetos, Construtores e `this`

1. **Classe `Pessoa` simples**
   - Crie uma classe `Pessoa` com campos privados `nome` e `idade`. [x]
   - Crie:
     - Um construtor que receba `nome` e `idade`. [x]
     - Getters e setters com validação (idade > 0). [x]
   - No `main`, crie 2 pessoas e imprima os dados. [x]
2. **Sobrecarga de construtores + `this()`**
   - Na classe `Pessoa`:
     - Crie um construtor apenas com `nome` que chame o construtor completo (`this(nome, idadePadrao)`). [x]
     - Idade padrão deve ser 18. [ x ]
   - No `main`, crie uma pessoa com apenas o nome e verifique se a idade padrão foi aplicada. [ x ]
3. **Classe `Retangulo` com métodos**
   - Campos privados: `largura`, `altura`. [ x ]
   - Construtor que recebe `largura` e `altura`. [ x ]
   - Métodos:
     - `double calcularArea()` [ x ]
     - `double calcularPerimetro()` [ x ]
   - Crie um método `aumentar(double fator)` que multiplica largura/altura pelo fator. [ x ]
   - Teste no `main`. [ x ]
4. **Referência vs cópia**
   - Crie `Retangulo r1 = new Retangulo(2, 3);` [ x ]
   - Faça `Retangulo r2 = r1;` [ x ]
   - Modifique `r2` e observe `r1`. [ x ]
   - Explique em comentário o que aconteceu (referência, não cópia). [ x ]

___

