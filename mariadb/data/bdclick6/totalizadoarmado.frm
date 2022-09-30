TYPE=VIEW
query=select `bdclick6`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`armados`.`total`),\'0\',`armados`.`total`)) AS `Expr1` from (`bdclick6`.`bdproductos` left join `bdclick6`.`armados` on((`bdclick6`.`bdproductos`.`idSistema` = `armados`.`producto`))) where ((`armados`.`bodega` = \'123-22\') or (`armados`.`bodega` = \'\')) group by `bdclick6`.`bdproductos`.`idSistema`
md5=46779a127f89b58f03d07d18699bd8d5
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:40
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`armados`.`total`),\'0\',`armados`.`total`)) AS `Expr1` from (`bdproductos` left join `armados` on((`bdproductos`.`idSistema` = `armados`.`producto`))) where ((`armados`.`bodega` = \'123-22\') or (`armados`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`armados`.`total`),\'0\',`armados`.`total`)) AS `Expr1` from (`bdclick6`.`bdproductos` left join `bdclick6`.`armados` on((`bdclick6`.`bdproductos`.`idSistema` = `armados`.`producto`))) where ((`armados`.`bodega` = \'123-22\') or (`armados`.`bodega` = \'\')) group by `bdclick6`.`bdproductos`.`idSistema`
mariadb-version=100135
