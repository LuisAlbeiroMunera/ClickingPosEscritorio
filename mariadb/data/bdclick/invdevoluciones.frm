TYPE=VIEW
query=(select `bdclick`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`bdclick`.`invdevprincipal`.`cantidad2`),\'0\',`bdclick`.`invdevprincipal`.`cantidad2`)) AS `entradas` from (`bdclick`.`bdproductos` left join `bdclick`.`invdevprincipal` on((`bdclick`.`invdevprincipal`.`producto` = `bdclick`.`bdproductos`.`Codigo`))) group by `bdclick`.`bdproductos`.`Codigo`)
md5=234da5eda8a22f16ed28e9196b9bbf45
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:24
create-version=2
source=(select `bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invdevprincipal`.`cantidad2`),\'0\',`invdevprincipal`.`cantidad2`)) AS `entradas` from (`bdproductos` left join `invdevprincipal` on((`invdevprincipal`.`producto` = `bdproductos`.`Codigo`))) group by `bdproductos`.`Codigo`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`bdclick`.`invdevprincipal`.`cantidad2`),\'0\',`bdclick`.`invdevprincipal`.`cantidad2`)) AS `entradas` from (`bdclick`.`bdproductos` left join `bdclick`.`invdevprincipal` on((`bdclick`.`invdevprincipal`.`producto` = `bdclick`.`bdproductos`.`Codigo`))) group by `bdclick`.`bdproductos`.`Codigo`)
mariadb-version=100135
