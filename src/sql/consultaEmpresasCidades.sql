-- Consulta Empresas e Cidades

select e.nome Empresa, c.nome as `Cidade`
from empresas e, empresas_unidades eu, cidade c
where e.id = eu.empresa_id
and c.id = eu.cidade_id
and sede