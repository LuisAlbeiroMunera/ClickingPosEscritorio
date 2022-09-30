TYPE=VIEW
query=(select `bdclick3`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invdevbodegasprincipal`.`cantidad2`),\'0\',`invdevbodegasprincipal`.`cantidad2`)) AS `entradas` from (`bdclick3`.`bdproductos` left join `bdclick3`.`invdevbodegasprincipal` on((`bdclick3`.`bdproductos`.`Codigo` = `invdevbodegasprincipal`.`producto`))) group by `bdclick3`.`bdproductos`.`Codigo`)
md5=ab62c5116f5123c765015998fc980d2b
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:51
create-version=2
source=(select `bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invdevbodegasprincipal`.`cantidad2`),\'0\',`invdevbodegasprincipal`.`cantidad2`)) AS `entradas` from (`bdproductos` left join `invdevbodegasprincipal` on((`bdproductos`.`Codigo` = `invdevbodegasprincipal`.`producto`))) group by `bdproductos`.`Codigo`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick3`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invdevbodegasprincipal`.`cantidad2`),\'0\',`invdevbodegasprincipal`.`cantidad2`)) AS `entradas` from (`bdclick3`.`bdproductos` left join `bdclick3`.`invdevbodegasprincipal` on((`bdclick3`.`bdproductos`.`Codigo` = `invdevbodegasprincipal`.`producto`))) group by `bdclick3`.`bdproductos`.`Codigo`)
mariadb-version=100135
