TYPE=VIEW
query=select `bdclick1`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`armados`.`total`),\'0\',`armados`.`total`)) AS `Expr1` from (`bdclick1`.`bdproductosbodega1` left join `bdclick1`.`armados` on((`bdclick1`.`bdproductosbodega1`.`idSistema` = `armados`.`producto`))) where (`armados`.`bodega` = \'BODEGA-1\') group by `bdclick1`.`bdproductosbodega1`.`idSistema`
md5=bbb5a56bd0e77e4bd7d67fdb64c5887b
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:39
create-version=2
source=select `bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`armados`.`total`),\'0\',`armados`.`total`)) AS `Expr1` from (`bdproductosbodega1` left join `armados` on((`bdproductosbodega1`.`idSistema` = `armados`.`producto`))) where (`armados`.`bodega` = \'BODEGA-1\') group by `bdproductosbodega1`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`armados`.`total`),\'0\',`armados`.`total`)) AS `Expr1` from (`bdclick1`.`bdproductosbodega1` left join `bdclick1`.`armados` on((`bdclick1`.`bdproductosbodega1`.`idSistema` = `armados`.`producto`))) where (`armados`.`bodega` = \'BODEGA-1\') group by `bdclick1`.`bdproductosbodega1`.`idSistema`
mariadb-version=100135
