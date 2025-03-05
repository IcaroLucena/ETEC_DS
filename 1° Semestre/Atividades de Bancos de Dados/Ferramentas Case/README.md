ATIVIDADE FERRAMENTAS CASE

Realize a modelagem utilizando MySQL Workbench das seguintes situações:

A) Sistema de Biblioteca
- Crie um modelo entidade-relacionamento para um sistema de gerenciamento de biblioteca que deve conter as seguintes informações:

- Usuário: Cada usuário da biblioteca tem um identificador único, nome, endereço e telefone.
- Livro: Cada livro tem um código ISBN, título, autor e ano de publicação.
- Empréstimo: Os usuários podem pegar livros emprestados. Um empréstimo tem uma data de início e uma data de devolução prevista.
- Multa: Se o livro não for devolvido na data prevista, o usuário recebe uma multa. A multa tem um valor e uma descrição.


B) Sistema de Reservas de Hotel
- Desenvolva um modelo entidade-relacionamento para um sistema de reservas de hotel que contenha os seguintes elementos:

- Hóspede: Cada hóspede tem um número de identificação, nome, e-mail e número de telefone.
- Quarto: Cada quarto possui um número, tipo (simples, duplo, suíte), e uma taxa por noite.
- Reserva: Uma reserva inclui a data de check-in, data de check-out e o status da reserva (ativa, cancelada, concluída).
- Pagamento: Um hóspede deve realizar um pagamento para confirmar uma reserva. O pagamento tem um valor e uma data.


C) Sistema de Vendas Online
- Projete um modelo entidade-relacionamento para um sistema de vendas online com as seguintes informações:

- Cliente: Cada cliente possui um identificador, nome, e-mail, endereço e telefone.
- Produto: Cada produto tem um código único, nome, descrição, preço e estoque disponível.
- Pedido: Cada pedido feito por um cliente tem um número de pedido, data do pedido e valor total.
- Item do Pedido: Cada pedido contém um ou mais produtos. Para cada produto no pedido, deve ser registrado a quantidade e o preço do item.
- Pagamento: Cada pedido é pago com um pagamento que tem data e valor.
