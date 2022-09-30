TYPE=VIEW
query=select `bdclick4`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum((if(isnull(`notascredito1`.`cantidad`),\'0\',`notascredito1`.`cantidad`) * -(1))) AS `Expr1` from (`bdclick4`.`bdproductosbodega2` left join `bdclick4`.`notascredito1` on((`bdclick4`.`bdproductosbodega2`.`idSistema` = `notascredito1`.`producto`))) where (`notascredito1`.`bodega` = \'BODEGA-2\') group by `bdclick4`.`bdproductosbodega2`.`idSistema`
md5=b686d664fcc8fe103454bdc0f1e85c84
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:32
create-version=2
source=select `bdproductosbodega2`.`idSistema` AS `codigo`,sum((if(isnull(`notascredito1`.`cantidad`),\'0\',`notascredito1`.`cantidad`) * -(1))) AS `Expr1` from (`bdproductosbodega2` left join `notascredito1` on((`bdproductosbodega2`.`idSistema` = `notascredito1`.`producto`))) where (`notascredito1`.`bodega` = \'BODEGA-2\') group by `bdproductosbodega2`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum((if(isnull(`notascredito1`.`cantidad`),\'0\',`notascredito1`.`cantidad`) * -(1))) AS `Expr1` from (`bdclick4`.`bdproductosbodega2` left join `bdclick4`.`notascredito1` on((`bdclick4`.`bdproductosbodega2`.`idSistema` = `notascredito1`.`producto`))) where (`notascredito1`.`bodega` = \'BODEGA-2\') group by `bdclick4`.`bdproductosbodega2`.`idSistema`
mariadb-version=100135
