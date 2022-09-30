TYPE=VIEW
query=(select `bdclick6`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invdevbodegasprincipal`.`cantidad2`),\'0\',`invdevbodegasprincipal`.`cantidad2`)) AS `entradas` from (`bdclick6`.`bdproductos` left join `bdclick6`.`invdevbodegasprincipal` on((`bdclick6`.`bdproductos`.`Codigo` = `invdevbodegasprincipal`.`producto`))) group by `bdclick6`.`bdproductos`.`Codigo`)
md5=7893da9fab0ce720ec2ac6fde92703ed
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:35
create-version=2
source=(select `bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invdevbodegasprincipal`.`cantidad2`),\'0\',`invdevbodegasprincipal`.`cantidad2`)) AS `entradas` from (`bdproductos` left join `invdevbodegasprincipal` on((`bdproductos`.`Codigo` = `invdevbodegasprincipal`.`producto`))) group by `bdproductos`.`Codigo`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick6`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invdevbodegasprincipal`.`cantidad2`),\'0\',`invdevbodegasprincipal`.`cantidad2`)) AS `entradas` from (`bdclick6`.`bdproductos` left join `bdclick6`.`invdevbodegasprincipal` on((`bdclick6`.`bdproductos`.`Codigo` = `invdevbodegasprincipal`.`producto`))) group by `bdclick6`.`bdproductos`.`Codigo`)
mariadb-version=100135
