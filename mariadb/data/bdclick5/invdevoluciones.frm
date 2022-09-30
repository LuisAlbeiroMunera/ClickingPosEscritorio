TYPE=VIEW
query=(select `bdclick5`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`bdclick5`.`invdevprincipal`.`cantidad2`),\'0\',`bdclick5`.`invdevprincipal`.`cantidad2`)) AS `entradas` from (`bdclick5`.`bdproductos` left join `bdclick5`.`invdevprincipal` on((`bdclick5`.`invdevprincipal`.`producto` = `bdclick5`.`bdproductos`.`Codigo`))) group by `bdclick5`.`bdproductos`.`Codigo`)
md5=77b90b4ef9268969e507309ba2b29d4b
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:47
create-version=2
source=(select `bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invdevprincipal`.`cantidad2`),\'0\',`invdevprincipal`.`cantidad2`)) AS `entradas` from (`bdproductos` left join `invdevprincipal` on((`invdevprincipal`.`producto` = `bdproductos`.`Codigo`))) group by `bdproductos`.`Codigo`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick5`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`bdclick5`.`invdevprincipal`.`cantidad2`),\'0\',`bdclick5`.`invdevprincipal`.`cantidad2`)) AS `entradas` from (`bdclick5`.`bdproductos` left join `bdclick5`.`invdevprincipal` on((`bdclick5`.`invdevprincipal`.`producto` = `bdclick5`.`bdproductos`.`Codigo`))) group by `bdclick5`.`bdproductos`.`Codigo`)
mariadb-version=100135
