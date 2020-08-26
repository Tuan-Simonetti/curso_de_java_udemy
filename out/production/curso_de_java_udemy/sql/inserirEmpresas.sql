-- Inserir Empresas

alter table empresas modify cnpj varchar(14);

insert into empresas (nome, cnpj)
values ('Bradesco', 65465416132), ('Vale', 132145651321), ('Cielo', 0515616564);

desc empresas;
desc prefeitos;
select * from empresas;
select * from cidades;

insert into empresas_unidades (empresas_id, cidades_id, sede)
values (1, 1, 1), (1, 2, 0), (2, 1, 0), (2, 2, 1);