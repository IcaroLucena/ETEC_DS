1. Normalize a tabela abaixo para a 3FN, onde idPedido e CodProduto formama chave da tabela:

Pedido:

idPedidio; dataPedido; codProduto; nomeProduto; qtde; valorUnitario; valorTotal

1; 01/07/09; 1234; HD 250GB; 2; R$100; R$200
2; 01/07/09; 1235; HD 180GB; 1; R$80; R$80
3; 03/07/09; 1235; HD 180GB; 4; R$80; R$320
4; 05/07/09; 1234; HD 250GB; 6; R$100; R$600

Dependências funcionais:

• idPedido → dataPedido

• idPedido, codProduto→qtde,valorTotal

• codProduto → nomeProduto, valorUnitário

2. vendedor (nro_vend, nome_vend, sexo_vend, {nro_cli, nome_cli, end_cli, data_atend } )

As seguintes dependências funcionais devem ser garantidas na normalização:

• nro_vend → nome_vend, sexo_vend

• nro_cli → nome_cli, end_cli

• nro_vend , nro_cli → data_atend

Observações adicionais:

• um vendedor pode atender diversos clientes, e um cliente pode ser atendido por diversos vendedores

3. Considere a seguinte Tabela:

• TProduto (nProduto, descriçãoProduto, nProductManager, nomeProductManager, preço).

Considere que as dependências funcionais:

• nProduto → descriçãoProduto, nProductManager, preço

• nProductManager → nomeProductManager

a) Especifique em que forma normal está esta tabela;

b) Caso a tabela não esteja na 3FN, normalize-a até aquela forma;

4. Analisando a tabela a seguir é possível aplicar quais Formas Normais.

• Venda(Codvenda, Codproduto, Codcliente, Codcidade, Quantidade, Valortotal)

Dependências funcionais:

• Codvenda → Codcliente

• Codcliente → Codcidade Codvenda,

• Codproduto → Quantidade, Valortotal