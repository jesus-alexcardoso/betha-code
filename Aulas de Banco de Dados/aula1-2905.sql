insert into curso.clientes values (1, 'Francisco José', '04696900879',1.74,90,'1994-11-27');
insert into curso.clientes (id, nome, cpf, altura, peso, dataNascimento) 
    values (2, 'José da Silva', '07288600981',1.83,95,'1994-11-27');

delete from curso.clientes where id = 1
delete from curso.clientes where nome like '%Silva%'
delete from curso.clientes
delete from curso.clientes where extract(year from dataNascimento) = 1994

update curso.clientes set nome = 'José da Silva Fernandes' where id = 2
update curso.clientes set dataNascimento = '1984-11-27' where id = 1
update curso.clientes set dataNascimento = '1992-08-05' where id = 1

select * from curso.clientes where id = 1
select * from curso.clientes where nome = 'José'
select * from curso.clientes where extract(year from dataNascimento) = 1994
select * from curso.clientes where nome like '%Silva%'
select extract(year from age(c.dataNascimento)) from curso.clientes c
select count(*) from curso.clientes
SELECT * FROM curso.clientes WHERE datanascimento BETWEEN '1992-01-01' AND '1992-12-31'
select * from curso.clientes order by 1 asc
commit