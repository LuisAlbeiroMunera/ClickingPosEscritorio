TYPE=VIEW
query=select `bdclick3`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum((if(isnull(`notascredito1`.`cantidad`),\'0\',`notascredito1`.`cantidad`) * -(1))) AS `Expr1` from (`bdclick3`.`bdproductosbodega4` left join `bdclick3`.`notascredito1` on((`bdclick3`.`bdproductosbodega4`.`idSistema` = `notascredito1`.`producto`))) where (`notascredito1`.`bodega` = \'BODEGA-4\') group by `bdclick3`.`bdproductosbodega4`.`idSistema`
md5=690d8776773bccfa8b9830ef42b8320a
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:56
create-version=2
source=select `bdproductosbodega4`.`idSistema` AS `codigo`,sum((if(isnull(`notascredito1`.`cantidad`),\'0\',`notascredito1`.`cantidad`) * -(1))) AS `Expr1` from (`bdproductosbodega4` left join `notascredito1` on((`bdproductosbodega4`.`idSistema` = `notascredito1`.`producto`))) where (`notascredito1`.`bodega` = \'BODEGA-4\') group by `bdproductosbodega4`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum((if(isnull(`notascredito1`.`cantidad`),\'0\',`notascredito1`.`cantidad`) * -(1))) AS `Expr1` from (`bdclick3`.`bdproductosbodega4` left join `bdclick3`.`notascredito1` on((`bdclick3`.`bdproductosbodega4`.`idSistema` = `notascredito1`.`producto`))) where (`notascredito1`.`bodega` = \'BODEGA-4\') group by `bdclick3`.`bdproductosbodega4`.`idSistema`
mariadb-version=100135
