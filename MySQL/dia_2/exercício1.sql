create database db_RH2;

use db_RH2;

Create table tb_cargo(
	id bigint auto_increment,
    funcao varchar (50) not null, 
    setor varchar (50) not null,
    ativo boolean,
    primary key (id)
    );

select * from tb_cargo;

Create table tb_funcionario(
	id bigint auto_increment,
    nome varchar (50) not null,
    CPF bigint (11) not null,
    salario decimal (10,2) not null,
    idade bigint (2),
    cargo_id bigint not null,
    primary key (id),
    foreign key (cargo_id) references tb_cargo(id)
);
select * from tb_funcionario;

insert into tb_cargo (funcao, setor) Values ("Estagiário", "TI");
insert into tb_cargo (funcao, setor) values ("Analista", "TI");
insert into tb_cargo (funcao, setor) values ("Dev Jr", "TI");
insert into tb_cargo (funcao, setor) values ("Gestor de Área", "TI");
insert into tb_cargo (funcao, setor) values ("Engenheiro de Software Senior", "TI");
 
select * from tb_cargo;
 
insert into tb_funcionario (nome, CPF, salario, idade, cargo_id) values ("Maria", 12345678910, 1900.02, 21, 1);
insert into tb_funcionario (nome, CPF, salario, idade, cargo_id) values ("JOão Java", 45345678910, 1800.02, 22, 2);
insert into tb_funcionario (nome, CPF, salario, idade, cargo_id) values ("Maria PHP", 45345678910, 1950.02, 24, 2);
insert into tb_funcionario (nome, CPF, salario, idade, cargo_id) values ("Joana Python", 45345678910, 4950.02, 25, 3);
insert into tb_funcionario (nome, CPF, salario, idade, cargo_id) values ("José Script", 85345678910, 4950.02, 26, 3);
insert into tb_funcionario (nome, CPF, salario, idade, cargo_id) values ("Anna HTML5", 35348678910, 1900.05, 24, 1);
insert into tb_funcionario (nome, CPF, salario, idade, cargo_id) values ("Fernando CSS", 98675678910, 6950.02, 29, 4);
insert into tb_funcionario (nome, CPF, salario, idade, cargo_id) values ("Carla Csharp", 41345608890, 6950.05, 29, 4);
insert into tb_funcionario (nome, CPF, salario, idade, cargo_id) values ("Carlos C", 53345678813, 1950.00, 24, 2);
insert into tb_funcionario (nome, CPF, salario, idade, cargo_id) values ("Vitória Mysql", 49445674910, 4950.02, 25, 3);
insert into tb_funcionario (nome, CPF, salario, idade, cargo_id) values ("Pedro Angular", 99455674910, 4950.02, 25, 3);
insert into tb_funcionario (nome, CPF, salario, idade, cargo_id) values ("Pedro Henrique Pedro", 697845674910, 7950.00, 27, 5);
insert into tb_funcionario (nome, CPF, salario, idade, cargo_id) values ("Fernanda Visualbasic", 797855674910, 7950.00, 26, 5);
insert into tb_funcionario (nome, CPF, salario, idade, cargo_id) values ("Marcos Swit", 67684567491, 7950.00, 28, 5);
insert into tb_funcionario (nome, CPF, salario, idade, cargo_id) values ("Regina Go", 397845644910, 7950.00, 30, 5);

select * from tb_funcionario where salario > 2000.00;

select * from tb_funcionario where salario between 1000.00 and 2000.00;

-- Mostrar nomes começando com a letra C
select * from tb_funcionario where nome like "C%";

-- Mostrar nomes que contenham a letra C em qualquer posição
select * from tb_funcionario where nome like "%C%";

 