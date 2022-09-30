TYPE=VIEW
query=(select `bdclick5`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invdevbodegasprincipal`.`cantidad2`),\'0\',`invdevbodegasprincipal`.`cantidad2`)) AS `entradas` from (`bdclick5`.`bdproductos` left join `bdclick5`.`invdevbodegasprincipal` on((`bdclick5`.`bdproductos`.`Codigo` = `invdevbodegasprincipal`.`producto`))) group by `bdclick5`.`bdproductos`.`Codigo`)
md5=21ef717162296a301c98b08a308871bf
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:47
create-version=2
source=(select `bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invdevbodegasprincipal`.`cantidad2`),\'0\',`invdevbodegasprincipal`.`cantidad2`)) AS `entradas` from (`bdproductos` left join `invdevbodegasprincipal` on((`bdproductos`.`Codigo` = `invdevbodegasprincipal`.`producto`))) group by `bdproductos`.`Codigo`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick5`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invdevbodegasprincipal`.`cantidad2`),\'0\',`invdevbodegasprincipal`.`cantidad2`)) AS `entradas` from (`bdclick5`.`bdproductos` left join `bdclick5`.`invdevbodegasprincipal` on((`bdclick5`.`bdproductos`.`Codigo` = `invdevbodegasprincipal`.`producto`))) group by `bdclick5`.`bdproductos`.`Codigo`)
mariadb-version=100135
