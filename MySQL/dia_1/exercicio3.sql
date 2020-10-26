use db_alunos;

Create table tb_dadosAlunos(
id bigint auto_increment,
nome varchar (50) not null,
nota bigint (2) not null,
turma varchar (50) not null,
turno varchar (10) not null,
primary key (id)
);

select * from tb_dadosAlunos;

insert into tb_dadosAlunos (nome, nota, turma, turno) Values ("Anna", 7, "9º ano", "matutino");
insert into tb_dadosAlunos (nome, nota, turma, turno) Values ("Clara", 8, "9º ano", "matutino");
insert into tb_dadosAlunos (nome, nota, turma, turno) Values ("Daiane", 6, "9º ano", "matutino");
insert into tb_dadosAlunos (nome, nota, turma, turno) Values ("Fernando", 5, "9º ano", "matutino");
insert into tb_dadosAlunos (nome, nota, turma, turno) Values ("Henrrique", 7, "9º ano", "matutino");
insert into tb_dadosAlunos (nome, nota, turma, turno) Values ("João", 5, "9º ano", "matutino");
insert into tb_dadosAlunos (nome, nota, turma, turno) Values ("Lua", 9, "9º ano", "matutino");
insert into tb_dadosAlunos (nome, nota, turma, turno) Values ("Natan", 7, "9º ano", "matutino");
select * from tb_dadosAlunos;

select * from tb_dadosAlunos where nota > 7;
select * from tb_dadosAlunos where nota < 7;

update tb_dadosAlunos set nota = 6 where id = 6;
select * from tb_dadosAlunos;