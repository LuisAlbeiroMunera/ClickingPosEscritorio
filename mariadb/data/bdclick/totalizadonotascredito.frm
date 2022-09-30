TYPE=VIEW
query=select `bdclick`.`bdproductos`.`idSistema` AS `codigo`,sum((if(isnull(`notascredito1`.`cantidad`),\'0\',`notascredito1`.`cantidad`) * -(1))) AS `Expr1` from (`bdclick`.`bdproductos` left join `bdclick`.`notascredito1` on((`bdclick`.`bdproductos`.`idSistema` = `notascredito1`.`producto`))) where ((`notascredito1`.`bodega` = \'123-22\') or (`notascredito1`.`bodega` = \'\')) group by `bdclick`.`bdproductos`.`idSistema`
md5=6176920110b5df41264093356e6912c2
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:29
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum((if(isnull(`notascredito1`.`cantidad`),\'0\',`notascredito1`.`cantidad`) * -(1))) AS `Expr1` from (`bdproductos` left join `notascredito1` on((`bdproductos`.`idSistema` = `notascredito1`.`producto`))) where ((`notascredito1`.`bodega` = \'123-22\') or (`notascredito1`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdproductos`.`idSistema` AS `codigo`,sum((if(isnull(`notascredito1`.`cantidad`),\'0\',`notascredito1`.`cantidad`) * -(1))) AS `Expr1` from (`bdclick`.`bdproductos` left join `bdclick`.`notascredito1` on((`bdclick`.`bdproductos`.`idSistema` = `notascredito1`.`producto`))) where ((`notascredito1`.`bodega` = \'123-22\') or (`notascredito1`.`bodega` = \'\')) group by `bdclick`.`bdproductos`.`idSistema`
mariadb-version=100135
