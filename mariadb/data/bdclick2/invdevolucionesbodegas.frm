TYPE=VIEW
query=(select `bdclick2`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invdevbodegasprincipal`.`cantidad2`),\'0\',`invdevbodegasprincipal`.`cantidad2`)) AS `entradas` from (`bdclick2`.`bdproductos` left join `bdclick2`.`invdevbodegasprincipal` on((`bdclick2`.`bdproductos`.`Codigo` = `invdevbodegasprincipal`.`producto`))) group by `bdclick2`.`bdproductos`.`Codigo`)
md5=e5d62461b485959ce0b74ff8e158e579
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:45
create-version=2
source=(select `bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invdevbodegasprincipal`.`cantidad2`),\'0\',`invdevbodegasprincipal`.`cantidad2`)) AS `entradas` from (`bdproductos` left join `invdevbodegasprincipal` on((`bdproductos`.`Codigo` = `invdevbodegasprincipal`.`producto`))) group by `bdproductos`.`Codigo`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick2`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invdevbodegasprincipal`.`cantidad2`),\'0\',`invdevbodegasprincipal`.`cantidad2`)) AS `entradas` from (`bdclick2`.`bdproductos` left join `bdclick2`.`invdevbodegasprincipal` on((`bdclick2`.`bdproductos`.`Codigo` = `invdevbodegasprincipal`.`producto`))) group by `bdclick2`.`bdproductos`.`Codigo`)
mariadb-version=100135
