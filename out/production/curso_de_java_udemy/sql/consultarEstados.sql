-- consulta tabela

select * from estados

select nome, sigla from estados

select sigla, nome as 'Nome do Estado' from estados
where regiao = 'Sul'

select nome, regiao, populacao from estados
where populacao >= 10
order by populacao
orderby populacao desc
