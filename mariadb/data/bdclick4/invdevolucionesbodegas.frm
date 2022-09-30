TYPE=VIEW
query=(select `bdclick4`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invdevbodegasprincipal`.`cantidad2`),\'0\',`invdevbodegasprincipal`.`cantidad2`)) AS `entradas` from (`bdclick4`.`bdproductos` left join `bdclick4`.`invdevbodegasprincipal` on((`bdclick4`.`bdproductos`.`Codigo` = `invdevbodegasprincipal`.`producto`))) group by `bdclick4`.`bdproductos`.`Codigo`)
md5=44b82e002d1634e571f7b47aebe41aad
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:28
create-version=2
source=(select `bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invdevbodegasprincipal`.`cantidad2`),\'0\',`invdevbodegasprincipal`.`cantidad2`)) AS `entradas` from (`bdproductos` left join `invdevbodegasprincipal` on((`bdproductos`.`Codigo` = `invdevbodegasprincipal`.`producto`))) group by `bdproductos`.`Codigo`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick4`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invdevbodegasprincipal`.`cantidad2`),\'0\',`invdevbodegasprincipal`.`cantidad2`)) AS `entradas` from (`bdclick4`.`bdproductos` left join `bdclick4`.`invdevbodegasprincipal` on((`bdclick4`.`bdproductos`.`Codigo` = `invdevbodegasprincipal`.`producto`))) group by `bdclick4`.`bdproductos`.`Codigo`)
mariadb-version=100135
