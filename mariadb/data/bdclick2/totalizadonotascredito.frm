TYPE=VIEW
query=select `bdclick2`.`bdproductos`.`idSistema` AS `codigo`,sum((if(isnull(`notascredito1`.`cantidad`),\'0\',`notascredito1`.`cantidad`) * -(1))) AS `Expr1` from (`bdclick2`.`bdproductos` left join `bdclick2`.`notascredito1` on((`bdclick2`.`bdproductos`.`idSistema` = `notascredito1`.`producto`))) where ((`notascredito1`.`bodega` = \'123-22\') or (`notascredito1`.`bodega` = \'\')) group by `bdclick2`.`bdproductos`.`idSistema`
md5=dfb50f913b91b216b4001d111006edc3
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:50
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum((if(isnull(`notascredito1`.`cantidad`),\'0\',`notascredito1`.`cantidad`) * -(1))) AS `Expr1` from (`bdproductos` left join `notascredito1` on((`bdproductos`.`idSistema` = `notascredito1`.`producto`))) where ((`notascredito1`.`bodega` = \'123-22\') or (`notascredito1`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdproductos`.`idSistema` AS `codigo`,sum((if(isnull(`notascredito1`.`cantidad`),\'0\',`notascredito1`.`cantidad`) * -(1))) AS `Expr1` from (`bdclick2`.`bdproductos` left join `bdclick2`.`notascredito1` on((`bdclick2`.`bdproductos`.`idSistema` = `notascredito1`.`producto`))) where ((`notascredito1`.`bodega` = \'123-22\') or (`notascredito1`.`bodega` = \'\')) group by `bdclick2`.`bdproductos`.`idSistema`
mariadb-version=100135
