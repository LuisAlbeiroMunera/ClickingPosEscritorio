TYPE=VIEW
query=select `bdclick4`.`bdproductos`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdclick4`.`bdproductos` left join `bdclick4`.`costeos` on((`bdclick4`.`bdproductos`.`idSistema` = `costeos`.`producto`))) where ((`costeos`.`bodega` = \'123-22\') or (`costeos`.`bodega` = \'\')) group by `bdclick4`.`bdproductos`.`idSistema`
md5=dff0233d7efde998e860c64fb1a15572
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:32
create-version=2
source=select `bdproductos`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdproductos` left join `costeos` on((`bdproductos`.`idSistema` = `costeos`.`producto`))) where ((`costeos`.`bodega` = \'123-22\') or (`costeos`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdproductos`.`idSistema` AS `Codigo`,sum(if(isnull(`costeos`.`unidades`),\'0\',`costeos`.`unidades`)) AS `Expr1` from (`bdclick4`.`bdproductos` left join `bdclick4`.`costeos` on((`bdclick4`.`bdproductos`.`idSistema` = `costeos`.`producto`))) where ((`costeos`.`bodega` = \'123-22\') or (`costeos`.`bodega` = \'\')) group by `bdclick4`.`bdproductos`.`idSistema`
mariadb-version=100135
