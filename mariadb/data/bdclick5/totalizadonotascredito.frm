TYPE=VIEW
query=select `bdclick5`.`bdproductos`.`idSistema` AS `codigo`,sum((if(isnull(`notascredito1`.`cantidad`),\'0\',`notascredito1`.`cantidad`) * -(1))) AS `Expr1` from (`bdclick5`.`bdproductos` left join `bdclick5`.`notascredito1` on((`bdclick5`.`bdproductos`.`idSistema` = `notascredito1`.`producto`))) where ((`notascredito1`.`bodega` = \'123-22\') or (`notascredito1`.`bodega` = \'\')) group by `bdclick5`.`bdproductos`.`idSistema`
md5=b1661d4955f868daa27d2a9355dabccf
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:52
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum((if(isnull(`notascredito1`.`cantidad`),\'0\',`notascredito1`.`cantidad`) * -(1))) AS `Expr1` from (`bdproductos` left join `notascredito1` on((`bdproductos`.`idSistema` = `notascredito1`.`producto`))) where ((`notascredito1`.`bodega` = \'123-22\') or (`notascredito1`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdproductos`.`idSistema` AS `codigo`,sum((if(isnull(`notascredito1`.`cantidad`),\'0\',`notascredito1`.`cantidad`) * -(1))) AS `Expr1` from (`bdclick5`.`bdproductos` left join `bdclick5`.`notascredito1` on((`bdclick5`.`bdproductos`.`idSistema` = `notascredito1`.`producto`))) where ((`notascredito1`.`bodega` = \'123-22\') or (`notascredito1`.`bodega` = \'\')) group by `bdclick5`.`bdproductos`.`idSistema`
mariadb-version=100135
