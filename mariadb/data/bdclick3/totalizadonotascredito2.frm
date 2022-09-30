TYPE=VIEW
query=select `bdclick3`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum((if(isnull(`notascredito1`.`cantidad`),\'0\',`notascredito1`.`cantidad`) * -(1))) AS `Expr1` from (`bdclick3`.`bdproductosbodega2` left join `bdclick3`.`notascredito1` on((`bdclick3`.`bdproductosbodega2`.`idSistema` = `notascredito1`.`producto`))) where (`notascredito1`.`bodega` = \'BODEGA-2\') group by `bdclick3`.`bdproductosbodega2`.`idSistema`
md5=31d9baee078cac97c90017bb02a5e563
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:55
create-version=2
source=select `bdproductosbodega2`.`idSistema` AS `codigo`,sum((if(isnull(`notascredito1`.`cantidad`),\'0\',`notascredito1`.`cantidad`) * -(1))) AS `Expr1` from (`bdproductosbodega2` left join `notascredito1` on((`bdproductosbodega2`.`idSistema` = `notascredito1`.`producto`))) where (`notascredito1`.`bodega` = \'BODEGA-2\') group by `bdproductosbodega2`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum((if(isnull(`notascredito1`.`cantidad`),\'0\',`notascredito1`.`cantidad`) * -(1))) AS `Expr1` from (`bdclick3`.`bdproductosbodega2` left join `bdclick3`.`notascredito1` on((`bdclick3`.`bdproductosbodega2`.`idSistema` = `notascredito1`.`producto`))) where (`notascredito1`.`bodega` = \'BODEGA-2\') group by `bdclick3`.`bdproductosbodega2`.`idSistema`
mariadb-version=100135
