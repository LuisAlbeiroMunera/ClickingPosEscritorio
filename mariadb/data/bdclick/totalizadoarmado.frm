TYPE=VIEW
query=select `bdclick`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`armados`.`total`),\'0\',`armados`.`total`)) AS `Expr1` from (`bdclick`.`bdproductos` left join `bdclick`.`armados` on((`bdclick`.`bdproductos`.`idSistema` = `armados`.`producto`))) where ((`armados`.`bodega` = \'123-22\') or (`armados`.`bodega` = \'\')) group by `bdclick`.`bdproductos`.`idSistema`
md5=00ed9092a377d0aee3073c5b7aa5e13c
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:28
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`armados`.`total`),\'0\',`armados`.`total`)) AS `Expr1` from (`bdproductos` left join `armados` on((`bdproductos`.`idSistema` = `armados`.`producto`))) where ((`armados`.`bodega` = \'123-22\') or (`armados`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`armados`.`total`),\'0\',`armados`.`total`)) AS `Expr1` from (`bdclick`.`bdproductos` left join `bdclick`.`armados` on((`bdclick`.`bdproductos`.`idSistema` = `armados`.`producto`))) where ((`armados`.`bodega` = \'123-22\') or (`armados`.`bodega` = \'\')) group by `bdclick`.`bdproductos`.`idSistema`
mariadb-version=100135
