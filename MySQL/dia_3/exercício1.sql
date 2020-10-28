create database db_cidade_das_carnes;
use db_cidade_das_carnes;

create table tb_categoria(
id bigint(5) auto_increment,
nome varchar(100) not null,
disponivel boolean not null,
primary key (id)
);
    
create table tb_produtos (
id bigint(5) auto_increment,
nome varchar (100) not null,
preco decimal (10,2) not null,
qtProduto int not null,
categoria_id bigint,
primary key (id),
FOREIGN KEY (categoria_id) REFERENCES tb_categoria (id)
);

insert into tb_categoria(nome, disponivel) values ("Aves", true);
insert into tb_categoria(nome, disponivel) values ("Bovinos", true);
insert into tb_categoria(nome, disponivel) values ("Suínos", true);

select * from tb_categoria;

insert into tb_produtos (nome, preco, qtProduto, categoria_id) values ("Asa", 20.00, 20, 1);
insert into tb_produtos (nome, preco, qtProduto, categoria_id) values ("Coxa", 10.00, 20, 1);
insert into tb_produtos (nome, preco, qtProduto, categoria_id) values ("Alcatra", 30.00, 30, 2);
insert into tb_produtos (nome, preco, qtProduto, categoria_id) values ("Picanha", 85.00, 40, 2);
insert into tb_produtos (nome, preco, qtProduto, categoria_id) values ("Bacon", 20.00, 50, 3);
insert into tb_produtos (nome, preco, qtProduto, categoria_id) values ("Barriga", 45.00, 25, 3);

select * from tb_produtos;

-- Retorna produtos com preço acima de 50.00
select * from tb_produtos where preco > 50.00;

-- Retorna produtos entre 3.00 e 50.00
select * from tb_produtos where preco between 3.00 and 5.00;

-- Retorna produtos com as letras CO em qualquer posição
select * from tb_produtos where nome like "%CO%";

--  select tb_produtos.id nome, preco, qtProduto, tb_categoria.nome, tb_categoria.disponivel 
select tb_produtos.id, tb_produtos.nome, tb_produtos.preco, tb_produtos.qtProduto, tb_produtos.categoria_id, tb_categoria.disponivel as disponivel, tb_categoria.id as id_categoria
from tb_produtos
inner join tb_categoria tb_categoria on tb_produtos.categoria_id;

select nome, preco, qtProduto, categoria_id, tb_categoria.disponivelo as disponivel
from tb_produtos
inner join  tb_categoria on tb_categoria.id = tb_produtos.categoria_id
where tb_categoria.disponivel like "%Elétrica%";
