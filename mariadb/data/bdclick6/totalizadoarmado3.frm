TYPE=VIEW
query=select `bdclick6`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`armados`.`total`),\'0\',`armados`.`total`)) AS `Expr1` from (`bdclick6`.`bdproductosbodega3` left join `bdclick6`.`armados` on((`bdclick6`.`bdproductosbodega3`.`idSistema` = `armados`.`producto`))) where (`armados`.`bodega` = \'BODEGA-3\') group by `bdclick6`.`bdproductosbodega3`.`idSistema`
md5=8c79d52c8c69d45289b0181c41528d09
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:40
create-version=2
source=select `bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`armados`.`total`),\'0\',`armados`.`total`)) AS `Expr1` from (`bdproductosbodega3` left join `armados` on((`bdproductosbodega3`.`idSistema` = `armados`.`producto`))) where (`armados`.`bodega` = \'BODEGA-3\') group by `bdproductosbodega3`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`armados`.`total`),\'0\',`armados`.`total`)) AS `Expr1` from (`bdclick6`.`bdproductosbodega3` left join `bdclick6`.`armados` on((`bdclick6`.`bdproductosbodega3`.`idSistema` = `armados`.`producto`))) where (`armados`.`bodega` = \'BODEGA-3\') group by `bdclick6`.`bdproductosbodega3`.`idSistema`
mariadb-version=100135
