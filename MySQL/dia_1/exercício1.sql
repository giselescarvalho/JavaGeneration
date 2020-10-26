create database db_rh;

use db_rh;

Create table tb_funcionarios(
id bigint auto_increment,
nome varchar(50) not null,
codigo bigint (3) not null,
cargo varchar (50) not null,
idade bigint not null, 
salario decimal (10,2) not null,
primary key (id)
);

select * from tb_funcionarios;

insert into tb_funcionarios (nome, codigo, cargo, idade, salario) Values ("Maria", 123, "Gerente RH", 29, 7000.00);
insert into tb_funcionarios (nome, codigo, cargo, idade, salario) Values ("João", 456, "Analista de RH", 24, 2000.50);
insert into tb_funcionarios (nome, codigo, cargo, idade, salario) Values ("Lucas", 789, "Estagiário", 21, 1500.00);
insert into tb_funcionarios (nome, codigo, cargo, idade, salario) Values ("Mandelev", 234, "Contador", 28, 6800.00);
insert into tb_funcionarios (nome, codigo, cargo, idade, salario) Values ("Carla", 357, "Gestor BI", 32, 7800.00);

select * from tb_funcionarios;

select * from tb_funcionarios where salario > 2000.00;

select * from tb_funcionarios where salario < 2000.00;

update tb_funcionarios set salario = 1600 where id = 3;

select * from tb_funcionarios;