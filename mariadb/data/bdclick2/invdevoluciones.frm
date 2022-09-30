TYPE=VIEW
query=(select `bdclick2`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`bdclick2`.`invdevprincipal`.`cantidad2`),\'0\',`bdclick2`.`invdevprincipal`.`cantidad2`)) AS `entradas` from (`bdclick2`.`bdproductos` left join `bdclick2`.`invdevprincipal` on((`bdclick2`.`invdevprincipal`.`producto` = `bdclick2`.`bdproductos`.`Codigo`))) group by `bdclick2`.`bdproductos`.`Codigo`)
md5=e47df1cbf7ee2b8cfe007b25e5cbdd78
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:45
create-version=2
source=(select `bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invdevprincipal`.`cantidad2`),\'0\',`invdevprincipal`.`cantidad2`)) AS `entradas` from (`bdproductos` left join `invdevprincipal` on((`invdevprincipal`.`producto` = `bdproductos`.`Codigo`))) group by `bdproductos`.`Codigo`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick2`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`bdclick2`.`invdevprincipal`.`cantidad2`),\'0\',`bdclick2`.`invdevprincipal`.`cantidad2`)) AS `entradas` from (`bdclick2`.`bdproductos` left join `bdclick2`.`invdevprincipal` on((`bdclick2`.`invdevprincipal`.`producto` = `bdclick2`.`bdproductos`.`Codigo`))) group by `bdclick2`.`bdproductos`.`Codigo`)
mariadb-version=100135
