TYPE=VIEW
query=select `bdclick4`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`armados`.`total`),\'0\',`armados`.`total`)) AS `Expr1` from (`bdclick4`.`bdproductosbodega1` left join `bdclick4`.`armados` on((`bdclick4`.`bdproductosbodega1`.`idSistema` = `armados`.`producto`))) where (`armados`.`bodega` = \'BODEGA-1\') group by `bdclick4`.`bdproductosbodega1`.`idSistema`
md5=1d0b8c930bbfc0e38f2616690dcd8bff
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:32
create-version=2
source=select `bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`armados`.`total`),\'0\',`armados`.`total`)) AS `Expr1` from (`bdproductosbodega1` left join `armados` on((`bdproductosbodega1`.`idSistema` = `armados`.`producto`))) where (`armados`.`bodega` = \'BODEGA-1\') group by `bdproductosbodega1`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`armados`.`total`),\'0\',`armados`.`total`)) AS `Expr1` from (`bdclick4`.`bdproductosbodega1` left join `bdclick4`.`armados` on((`bdclick4`.`bdproductosbodega1`.`idSistema` = `armados`.`producto`))) where (`armados`.`bodega` = \'BODEGA-1\') group by `bdclick4`.`bdproductosbodega1`.`idSistema`
mariadb-version=100135
