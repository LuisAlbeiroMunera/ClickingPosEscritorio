TYPE=VIEW
query=(select `bdclick`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invdevbodegasprincipal`.`cantidad2`),\'0\',`invdevbodegasprincipal`.`cantidad2`)) AS `entradas` from (`bdclick`.`bdproductos` left join `bdclick`.`invdevbodegasprincipal` on((`bdclick`.`bdproductos`.`Codigo` = `invdevbodegasprincipal`.`producto`))) group by `bdclick`.`bdproductos`.`Codigo`)
md5=27cd6defbf29d26f6bf5f9dd45841880
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:24
create-version=2
source=(select `bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invdevbodegasprincipal`.`cantidad2`),\'0\',`invdevbodegasprincipal`.`cantidad2`)) AS `entradas` from (`bdproductos` left join `invdevbodegasprincipal` on((`bdproductos`.`Codigo` = `invdevbodegasprincipal`.`producto`))) group by `bdproductos`.`Codigo`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invdevbodegasprincipal`.`cantidad2`),\'0\',`invdevbodegasprincipal`.`cantidad2`)) AS `entradas` from (`bdclick`.`bdproductos` left join `bdclick`.`invdevbodegasprincipal` on((`bdclick`.`bdproductos`.`Codigo` = `invdevbodegasprincipal`.`producto`))) group by `bdclick`.`bdproductos`.`Codigo`)
mariadb-version=100135
