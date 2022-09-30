TYPE=VIEW
query=select `bdclick`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum((if(isnull(`notascredito1`.`cantidad`),\'0\',`notascredito1`.`cantidad`) * -(1))) AS `Expr1` from (`bdclick`.`bdproductosbodega3` left join `bdclick`.`notascredito1` on((`bdclick`.`bdproductosbodega3`.`idSistema` = `notascredito1`.`producto`))) where (`notascredito1`.`bodega` = \'BODEGA-3\') group by `bdclick`.`bdproductosbodega3`.`idSistema`
md5=2ea6f96192abbfd2ed9ddd52dde30416
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:29
create-version=2
source=select `bdproductosbodega3`.`idSistema` AS `codigo`,sum((if(isnull(`notascredito1`.`cantidad`),\'0\',`notascredito1`.`cantidad`) * -(1))) AS `Expr1` from (`bdproductosbodega3` left join `notascredito1` on((`bdproductosbodega3`.`idSistema` = `notascredito1`.`producto`))) where (`notascredito1`.`bodega` = \'BODEGA-3\') group by `bdproductosbodega3`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum((if(isnull(`notascredito1`.`cantidad`),\'0\',`notascredito1`.`cantidad`) * -(1))) AS `Expr1` from (`bdclick`.`bdproductosbodega3` left join `bdclick`.`notascredito1` on((`bdclick`.`bdproductosbodega3`.`idSistema` = `notascredito1`.`producto`))) where (`notascredito1`.`bodega` = \'BODEGA-3\') group by `bdclick`.`bdproductosbodega3`.`idSistema`
mariadb-version=100135
