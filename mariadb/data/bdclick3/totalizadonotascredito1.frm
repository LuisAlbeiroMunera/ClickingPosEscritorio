TYPE=VIEW
query=select `bdclick3`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum((if(isnull(`notascredito1`.`cantidad`),\'0\',`notascredito1`.`cantidad`) * -(1))) AS `Expr1` from (`bdclick3`.`bdproductosbodega1` left join `bdclick3`.`notascredito1` on((`bdclick3`.`bdproductosbodega1`.`idSistema` = `notascredito1`.`producto`))) where (`notascredito1`.`bodega` = \'BODEGA-1\') group by `bdclick3`.`bdproductosbodega1`.`idSistema`
md5=8677dff84f8d91afb8f1164795c116eb
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:55
create-version=2
source=select `bdproductosbodega1`.`idSistema` AS `codigo`,sum((if(isnull(`notascredito1`.`cantidad`),\'0\',`notascredito1`.`cantidad`) * -(1))) AS `Expr1` from (`bdproductosbodega1` left join `notascredito1` on((`bdproductosbodega1`.`idSistema` = `notascredito1`.`producto`))) where (`notascredito1`.`bodega` = \'BODEGA-1\') group by `bdproductosbodega1`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum((if(isnull(`notascredito1`.`cantidad`),\'0\',`notascredito1`.`cantidad`) * -(1))) AS `Expr1` from (`bdclick3`.`bdproductosbodega1` left join `bdclick3`.`notascredito1` on((`bdclick3`.`bdproductosbodega1`.`idSistema` = `notascredito1`.`producto`))) where (`notascredito1`.`bodega` = \'BODEGA-1\') group by `bdclick3`.`bdproductosbodega1`.`idSistema`
mariadb-version=100135
