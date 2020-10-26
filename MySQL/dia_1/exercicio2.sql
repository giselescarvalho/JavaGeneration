create database db_ecommerce;

use db_ecommerce;

create table tb_produtos(
id bigint auto_increment,
nomeProd varchar (50) not null,
marca varchar (50) not null,
preco decimal (10,2) not null,
quantidade bigint not null,
primary key (id)
);

select *from tb_produtos;

insert into tb_produtos (nomeProd, marca, preco, quantidade) Values ("Boné", "Nike", 350.00, 5);
insert into tb_produtos (nomeProd, marca, preco, quantidade) Values ("Tênis Ultraboost", "Adidas", 699.00, 14);
insert into tb_produtos (nomeProd, marca, preco, quantidade) Values ("Mochila", "Vans", 250.00, 12);
insert into tb_produtos (nomeProd, marca, preco, quantidade) Values ("Tênis Nrgy Zebra", "Puma", 250.00, 7);
insert into tb_produtos (nomeProd, marca, preco, quantidade) Values ("Tênis Old School", "Vans", 300.00, 45);
insert into tb_produtos (nomeProd, marca, preco, quantidade) Values ("Meias", "Vans", 50.00, 155);
insert into tb_produtos (nomeProd, marca, preco, quantidade) Values ("Moletom", "Nike", 350.00, 17);
insert into tb_produtos (nomeProd, marca, preco, quantidade) Values ("Jaqueta Corta-Vento", "Adidas", 550.00, 9);
select *from tb_produtos;

select * from tb_produtos where preco > 500;
select * from tb_produtos where preco < 500;

update tb_produtos set quantidade = 10 where id = 2;
select *from tb_produtos;