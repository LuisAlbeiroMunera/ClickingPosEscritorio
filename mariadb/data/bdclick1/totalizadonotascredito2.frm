TYPE=VIEW
query=select `bdclick1`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum((if(isnull(`notascredito1`.`cantidad`),\'0\',`notascredito1`.`cantidad`) * -(1))) AS `Expr1` from (`bdclick1`.`bdproductosbodega2` left join `bdclick1`.`notascredito1` on((`bdclick1`.`bdproductosbodega2`.`idSistema` = `notascredito1`.`producto`))) where (`notascredito1`.`bodega` = \'BODEGA-2\') group by `bdclick1`.`bdproductosbodega2`.`idSistema`
md5=be1f7431457cfd0361ba6f94e3ceb7cc
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:39
create-version=2
source=select `bdproductosbodega2`.`idSistema` AS `codigo`,sum((if(isnull(`notascredito1`.`cantidad`),\'0\',`notascredito1`.`cantidad`) * -(1))) AS `Expr1` from (`bdproductosbodega2` left join `notascredito1` on((`bdproductosbodega2`.`idSistema` = `notascredito1`.`producto`))) where (`notascredito1`.`bodega` = \'BODEGA-2\') group by `bdproductosbodega2`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum((if(isnull(`notascredito1`.`cantidad`),\'0\',`notascredito1`.`cantidad`) * -(1))) AS `Expr1` from (`bdclick1`.`bdproductosbodega2` left join `bdclick1`.`notascredito1` on((`bdclick1`.`bdproductosbodega2`.`idSistema` = `notascredito1`.`producto`))) where (`notascredito1`.`bodega` = \'BODEGA-2\') group by `bdclick1`.`bdproductosbodega2`.`idSistema`
mariadb-version=100135
