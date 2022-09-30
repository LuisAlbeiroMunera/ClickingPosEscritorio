TYPE=VIEW
query=select `bdclick1`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`armados`.`total`),\'0\',`armados`.`total`)) AS `Expr1` from (`bdclick1`.`bdproductos` left join `bdclick1`.`armados` on((`bdclick1`.`bdproductos`.`idSistema` = `armados`.`producto`))) where ((`armados`.`bodega` = \'123-22\') or (`armados`.`bodega` = \'\')) group by `bdclick1`.`bdproductos`.`idSistema`
md5=d79c13ed6cd33d2b6b7543f09db5c742
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:38
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`armados`.`total`),\'0\',`armados`.`total`)) AS `Expr1` from (`bdproductos` left join `armados` on((`bdproductos`.`idSistema` = `armados`.`producto`))) where ((`armados`.`bodega` = \'123-22\') or (`armados`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`armados`.`total`),\'0\',`armados`.`total`)) AS `Expr1` from (`bdclick1`.`bdproductos` left join `bdclick1`.`armados` on((`bdclick1`.`bdproductos`.`idSistema` = `armados`.`producto`))) where ((`armados`.`bodega` = \'123-22\') or (`armados`.`bodega` = \'\')) group by `bdclick1`.`bdproductos`.`idSistema`
mariadb-version=100135
