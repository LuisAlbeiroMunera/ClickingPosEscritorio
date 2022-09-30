TYPE=VIEW
query=(select `bdclick1`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`bdclick1`.`invdevprincipal`.`cantidad2`),\'0\',`bdclick1`.`invdevprincipal`.`cantidad2`)) AS `entradas` from (`bdclick1`.`bdproductos` left join `bdclick1`.`invdevprincipal` on((`bdclick1`.`invdevprincipal`.`producto` = `bdclick1`.`bdproductos`.`Codigo`))) group by `bdclick1`.`bdproductos`.`Codigo`)
md5=b6d73481b474b13614a89a406020383d
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:35
create-version=2
source=(select `bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invdevprincipal`.`cantidad2`),\'0\',`invdevprincipal`.`cantidad2`)) AS `entradas` from (`bdproductos` left join `invdevprincipal` on((`invdevprincipal`.`producto` = `bdproductos`.`Codigo`))) group by `bdproductos`.`Codigo`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick1`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`bdclick1`.`invdevprincipal`.`cantidad2`),\'0\',`bdclick1`.`invdevprincipal`.`cantidad2`)) AS `entradas` from (`bdclick1`.`bdproductos` left join `bdclick1`.`invdevprincipal` on((`bdclick1`.`invdevprincipal`.`producto` = `bdclick1`.`bdproductos`.`Codigo`))) group by `bdclick1`.`bdproductos`.`Codigo`)
mariadb-version=100135
