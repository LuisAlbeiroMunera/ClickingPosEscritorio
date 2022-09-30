TYPE=VIEW
query=(select `bdclick6`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`bdclick6`.`invdevprincipal`.`cantidad2`),\'0\',`bdclick6`.`invdevprincipal`.`cantidad2`)) AS `entradas` from (`bdclick6`.`bdproductos` left join `bdclick6`.`invdevprincipal` on((`bdclick6`.`invdevprincipal`.`producto` = `bdclick6`.`bdproductos`.`Codigo`))) group by `bdclick6`.`bdproductos`.`Codigo`)
md5=c0d0d40a6cd3ef9feccf6af02fa2cd15
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:35
create-version=2
source=(select `bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invdevprincipal`.`cantidad2`),\'0\',`invdevprincipal`.`cantidad2`)) AS `entradas` from (`bdproductos` left join `invdevprincipal` on((`invdevprincipal`.`producto` = `bdproductos`.`Codigo`))) group by `bdproductos`.`Codigo`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick6`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`bdclick6`.`invdevprincipal`.`cantidad2`),\'0\',`bdclick6`.`invdevprincipal`.`cantidad2`)) AS `entradas` from (`bdclick6`.`bdproductos` left join `bdclick6`.`invdevprincipal` on((`bdclick6`.`invdevprincipal`.`producto` = `bdclick6`.`bdproductos`.`Codigo`))) group by `bdclick6`.`bdproductos`.`Codigo`)
mariadb-version=100135
