select nome, dataA from (
	select nome, dataNascimento as dataA From curso.clientes c
	union all
	select nome, dataCriacao as dataA from curso.fornecedores f
) as tab

create view curso.fornecedores_por_idade as
select *, extract(year from age(datacriacao)) from curso.fornecedores

select * from curso.fornecedores_por_idade

create table curso.fornecedores(
	id int,
	nome varchar(80),
	cnpj varchar(22),
	dataCriacao date
)

--left e right: basicamente o seguinte: "me traz tudo, mesmo que não exista a referência na outra tabela"
select * from curso.clientes right join curso.cidades on (clientes.i_cidades = cidades.id)
select * from curso.clientes left join curso.cidades on (clientes.i_cidades = cidades.id)
select * from curso.clientes join curso.cidades on (clientes.i_cidades = cidades.id)
select * from curso.clientes, curso.cidades where clientes.i_cidades = cidades.id

update curso.clientes set i_cidades = 5 where id = 2 --era pra dar erro mesmo

update curso.clientes set i_cidades = 1

alter table curso.clientes add constraint fk_cidades_clientes 
   foreign key (i_cidades) references curso.cidades(id);

alter table curso.clientes add i_cidades int;

insert into curso.cidades values (1,'Criciúma');
insert into curso.cidades values (2,'Tubarão');
insert into curso.cidades values (3,'Içara');
insert into curso.cidades values (4,'Araranguá');

create table curso.cidades(
	id int,
	nome varchar(80),
	CONSTRAINT PK_CIDADES PRIMARY KEY (ID)
)

select nome , avg(altura), avg(peso) from curso.clientes group by nome having avg(peso) > 70
select nome , avg(altura), avg(peso) from curso.clientes group by nome

select distinct(nome) from curso.clientes

select * from curso.clientes order by altura asc
select * from curso.clientes order by altura desc
select * from curso.clientes order by nome desc
select * from curso.clientes order by dataNascimento asc
select * from curso.clientes order by dataNascimento desc

select * from curso.clientes;
select count(*) from curso.clientes;
select sum(altura) from curso.clientes;
select avg(peso) from curso.clientes;
select max(altura) from curso.clientes;
select min(peso) from curso.clientes;

select * from curso.clientes
select * from curso.cidades
select * from curso.fornecedores