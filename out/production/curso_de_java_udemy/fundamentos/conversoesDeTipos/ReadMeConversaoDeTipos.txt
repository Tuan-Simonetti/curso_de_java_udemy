As conversões de tipos primitivos podem gerar problemas.

Converter o tipo Byte para o tipo Short não irá gerar problemas, pois o armazenamento de short é maior do que o de byte.
Contudo, a conversão de short para byte irá gerar problemas. Pois, o armazenamento de byte é menor do que o de short,
provocando uma perda de informação.

- Byte: 8 bits, que corresponde à <128 até >127;
- Shot: 2 bytes;
- Int: 4 bytes;
- Long: 8 bytes;


Situaçõesa como o "INT -> Float" e "Long -> Double" também geram problemas. Isso porque, o sistema irá "cortar" os
valores quebrados (casas decimais).

- Int: 4 bytes;
- Float: 4 bytes;

- Long: 8 bytes;
- Double: 8 bytes.
