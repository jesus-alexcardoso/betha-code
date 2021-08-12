CREATE INDEX IDX_CLIENTES ON curso.clientes (peso);

ALTER TABLE curso.fornecedores RENAME TO fornec;
select * from curso.fornec

ALTER TABLE curso.fornec ADD COLUMN ativo BOOLEAN;

ALTER TABLE curso.fornec MODIFY ativo SMALLINT; --nao funfou

TRUNCATE TABLE curso.fornec;

DROP TABLE curso.fornec;

CREATE SEQUENCE SEQ_CLIENTES MAXVALUE 9999999999 CACHE 1;

select nextval('SEQ_CLIENTES');