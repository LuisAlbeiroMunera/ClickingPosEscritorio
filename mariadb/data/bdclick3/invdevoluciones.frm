TYPE=VIEW
query=(select `bdclick3`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`bdclick3`.`invdevprincipal`.`cantidad2`),\'0\',`bdclick3`.`invdevprincipal`.`cantidad2`)) AS `entradas` from (`bdclick3`.`bdproductos` left join `bdclick3`.`invdevprincipal` on((`bdclick3`.`invdevprincipal`.`producto` = `bdclick3`.`bdproductos`.`Codigo`))) group by `bdclick3`.`bdproductos`.`Codigo`)
md5=4f45412f3bcaa8961a545e6e756db666
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:51
create-version=2
source=(select `bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`invdevprincipal`.`cantidad2`),\'0\',`invdevprincipal`.`cantidad2`)) AS `entradas` from (`bdproductos` left join `invdevprincipal` on((`invdevprincipal`.`producto` = `bdproductos`.`Codigo`))) group by `bdproductos`.`Codigo`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick3`.`bdproductos`.`Codigo` AS `codigo`,sum(if(isnull(`bdclick3`.`invdevprincipal`.`cantidad2`),\'0\',`bdclick3`.`invdevprincipal`.`cantidad2`)) AS `entradas` from (`bdclick3`.`bdproductos` left join `bdclick3`.`invdevprincipal` on((`bdclick3`.`invdevprincipal`.`producto` = `bdclick3`.`bdproductos`.`Codigo`))) group by `bdclick3`.`bdproductos`.`Codigo`)
mariadb-version=100135
