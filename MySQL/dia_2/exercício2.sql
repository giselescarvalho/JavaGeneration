create database db_ecommerce;

use db_ecommerce;

Create table tb_categoria(
id bigint auto_increment,
nome varchar (50) not null,
tipo varchar (50) not null,
primary key (id)
);

Create table tb_produto(
id bigint auto_increment,
nome varchar (50) not null,
marca varchar (50) not null,
preco decimal (10,2) not null,
quantidadeEstoque bigint not null,
categoria_id bigint not null,
primary key(id),
foreign key (categoria_id) references tb_categoria(id)
);

insert into tb_categoria (nome, tipo) values ("Calça","Vestuário");
insert into tb_categoria (nome, tipo) values ("Moletom","Vestuário");
insert into tb_categoria (nome, tipo) values ("Celular","Eletrônico");
insert into tb_categoria (nome, tipo) values ("Perfume","Perfumaria");
insert into tb_categoria (nome, tipo) values ("Shampoo","Higiene pessoal");

insert into tb_produto (nome, marca, preco, quantidadeEstoque, categoria_id) values ("Calça Jeans", "Levei", 200.00, 50, 1);
insert into tb_produto (nome, marca, preco, quantidadeEstoque, categoria_id) values ("Calça Jeans", "Calvin Pequeno", 150.00, 40, 1);
insert into tb_produto (nome, marca, preco, quantidadeEstoque, categoria_id) values ("Calça Jeans", "George Armani", 500.00, 10, 1);
insert into tb_produto (nome, marca, preco, quantidadeEstoque, categoria_id) values ("Calça Jeans", "Doce e Cabana", 350.00, 15, 1);
insert into tb_produto (nome, marca, preco, quantidadeEstoque, categoria_id) values ("Moletom Rosa Logo", "Vans", 180.00, 20, 2);
insert into tb_produto (nome, marca, preco, quantidadeEstoque, categoria_id) values ("Moletom Preto Zíper", "Nike", 290.00, 35, 2);
insert into tb_produto (nome, marca, preco, quantidadeEstoque, categoria_id) values ("Moletom Verde Capuz", "Adidas", 380.00, 18, 2);
insert into tb_produto (nome, marca, preco, quantidadeEstoque, categoria_id) values ("Smartphone Mi 10", "Xiaomi", 1800.00, 30, 3);
insert into tb_produto (nome, marca, preco, quantidadeEstoque, categoria_id) values ("Smartphone iPhone 11", "Apple", 11800.00, 25, 3);
insert into tb_produto (nome, marca, preco, quantidadeEstoque, categoria_id) values ("Smartphone A21", "Samsung", 1999.00, 23, 3);
insert into tb_produto (nome, marca, preco, quantidadeEstoque, categoria_id) values ("Smartphone K10", "LG", 2000.00, 13, 3);
insert into tb_produto (nome, marca, preco, quantidadeEstoque, categoria_id) values ("Smartphone E6S", "Motorola", 960.00, 20, 3);
insert into tb_produto (nome, marca, preco, quantidadeEstoque, categoria_id) values ("Eau de parfum Chloé", "Chloé", 500.00, 10, 4);
insert into tb_produto (nome, marca, preco, quantidadeEstoque, categoria_id) values ("Eau de toilette Chloé", "Chloé", 370.00, 10, 4);
insert into tb_produto (nome, marca, preco, quantidadeEstoque, categoria_id) values ("Eau de parfum Carolina Herrera", "Carolina Herrera", 588.00, 10, 4);
insert into tb_produto (nome, marca, preco, quantidadeEstoque, categoria_id) values ("Shampoo meu cacho minah vida", "Lola", 25.00, 100, 5);

-- Mostra produtos onde preço > 2000.00
select * from tb_produto where preco > 2000.00;

-- Mostra produtos onde preço > 1000.00 e < 2000.00
select * from tb_produto where preco between 1000.00 and 2000.00;

-- Mostra produtos qure começam com a letra C
select * from tb_produto where nome like "C%";

-- Mostra produtos que tenham a letra C em qualquer posição
select * from tb_produto where nome like "%C%";

