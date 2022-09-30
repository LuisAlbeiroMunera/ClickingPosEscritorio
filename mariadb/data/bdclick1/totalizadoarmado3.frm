TYPE=VIEW
query=select `bdclick1`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`armados`.`total`),\'0\',`armados`.`total`)) AS `Expr1` from (`bdclick1`.`bdproductosbodega3` left join `bdclick1`.`armados` on((`bdclick1`.`bdproductosbodega3`.`idSistema` = `armados`.`producto`))) where (`armados`.`bodega` = \'BODEGA-3\') group by `bdclick1`.`bdproductosbodega3`.`idSistema`
md5=896d0ebd1c60ddf517b43cbd334c4a4b
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:39
create-version=2
source=select `bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`armados`.`total`),\'0\',`armados`.`total`)) AS `Expr1` from (`bdproductosbodega3` left join `armados` on((`bdproductosbodega3`.`idSistema` = `armados`.`producto`))) where (`armados`.`bodega` = \'BODEGA-3\') group by `bdproductosbodega3`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`armados`.`total`),\'0\',`armados`.`total`)) AS `Expr1` from (`bdclick1`.`bdproductosbodega3` left join `bdclick1`.`armados` on((`bdclick1`.`bdproductosbodega3`.`idSistema` = `armados`.`producto`))) where (`armados`.`bodega` = \'BODEGA-3\') group by `bdclick1`.`bdproductosbodega3`.`idSistema`
mariadb-version=100135
