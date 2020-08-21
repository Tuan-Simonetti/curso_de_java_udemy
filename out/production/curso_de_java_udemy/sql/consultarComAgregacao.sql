-- Consultar com Agregação

select
    regiao as 'Regiao',
    sum(populacao) as Total -- soma os valores
from estados
group by regiao


select
    avg(populacao) as Total -- soma os valores
from estados