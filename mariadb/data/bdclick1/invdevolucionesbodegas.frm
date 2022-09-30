TYPE=VIEW
query=(select `bdclick1`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invdevbodegasprincipal`.`cantidad2`),\'0\',`invdevbodegasprincipal`.`cantidad2`)) AS `entradas` from (`bdclick1`.`bdproductos` left join `bdclick1`.`invdevbodegasprincipal` on((`bdclick1`.`bdproductos`.`Codigo` = `invdevbodegasprincipal`.`producto`))) group by `bdclick1`.`bdproductos`.`Codigo`)
md5=33b59db5a81344d74fde98767485dc5c
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:35
create-version=2
source=(select `bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invdevbodegasprincipal`.`cantidad2`),\'0\',`invdevbodegasprincipal`.`cantidad2`)) AS `entradas` from (`bdproductos` left join `invdevbodegasprincipal` on((`bdproductos`.`Codigo` = `invdevbodegasprincipal`.`producto`))) group by `bdproductos`.`Codigo`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick1`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invdevbodegasprincipal`.`cantidad2`),\'0\',`invdevbodegasprincipal`.`cantidad2`)) AS `entradas` from (`bdclick1`.`bdproductos` left join `bdclick1`.`invdevbodegasprincipal` on((`bdclick1`.`bdproductos`.`Codigo` = `invdevbodegasprincipal`.`producto`))) group by `bdclick1`.`bdproductos`.`Codigo`)
mariadb-version=100135
