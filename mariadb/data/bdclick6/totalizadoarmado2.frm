TYPE=VIEW
query=select `bdclick6`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`armados`.`total`),\'0\',`armados`.`total`)) AS `Expr1` from (`bdclick6`.`bdproductosbodega2` left join `bdclick6`.`armados` on((`bdclick6`.`bdproductosbodega2`.`idSistema` = `armados`.`producto`))) where (`armados`.`bodega` = \'BODEGA-2\') group by `bdclick6`.`bdproductosbodega2`.`idSistema`
md5=6002189d2bbdfdb28288a6a683d3ba11
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:40
create-version=2
source=select `bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`armados`.`total`),\'0\',`armados`.`total`)) AS `Expr1` from (`bdproductosbodega2` left join `armados` on((`bdproductosbodega2`.`idSistema` = `armados`.`producto`))) where (`armados`.`bodega` = \'BODEGA-2\') group by `bdproductosbodega2`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`armados`.`total`),\'0\',`armados`.`total`)) AS `Expr1` from (`bdclick6`.`bdproductosbodega2` left join `bdclick6`.`armados` on((`bdclick6`.`bdproductosbodega2`.`idSistema` = `armados`.`producto`))) where (`armados`.`bodega` = \'BODEGA-2\') group by `bdclick6`.`bdproductosbodega2`.`idSistema`
mariadb-version=100135
