TYPE=VIEW
query=(select `bdclick4`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`bdclick4`.`invdevprincipal`.`cantidad2`),\'0\',`bdclick4`.`invdevprincipal`.`cantidad2`)) AS `entradas` from (`bdclick4`.`bdproductos` left join `bdclick4`.`invdevprincipal` on((`bdclick4`.`invdevprincipal`.`producto` = `bdclick4`.`bdproductos`.`Codigo`))) group by `bdclick4`.`bdproductos`.`Codigo`)
md5=1c0b567e3701f9b68dd0a4a804ec3db0
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:28
create-version=2
source=(select `bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invdevprincipal`.`cantidad2`),\'0\',`invdevprincipal`.`cantidad2`)) AS `entradas` from (`bdproductos` left join `invdevprincipal` on((`invdevprincipal`.`producto` = `bdproductos`.`Codigo`))) group by `bdproductos`.`Codigo`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick4`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`bdclick4`.`invdevprincipal`.`cantidad2`),\'0\',`bdclick4`.`invdevprincipal`.`cantidad2`)) AS `entradas` from (`bdclick4`.`bdproductos` left join `bdclick4`.`invdevprincipal` on((`bdclick4`.`invdevprincipal`.`producto` = `bdclick4`.`bdproductos`.`Codigo`))) group by `bdclick4`.`bdproductos`.`Codigo`)
mariadb-version=100135
