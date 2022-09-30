TYPE=VIEW
query=select `bdclick2`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`anulacion`.`cantidad`),\'0\',`anulacion`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductos` left join `bdclick2`.`anulacion` on((`bdclick2`.`bdproductos`.`idSistema` = `anulacion`.`producto`))) where ((`anulacion`.`bodega` = \'123-22\') or (`anulacion`.`bodega` = \'\')) group by `bdclick2`.`bdproductos`.`idSistema`
md5=f60db10f6a145c8555c05ad481b5a08b
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:49
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`anulacion`.`cantidad`),\'0\',`anulacion`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `anulacion` on((`bdproductos`.`idSistema` = `anulacion`.`producto`))) where ((`anulacion`.`bodega` = \'123-22\') or (`anulacion`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`anulacion`.`cantidad`),\'0\',`anulacion`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductos` left join `bdclick2`.`anulacion` on((`bdclick2`.`bdproductos`.`idSistema` = `anulacion`.`producto`))) where ((`anulacion`.`bodega` = \'123-22\') or (`anulacion`.`bodega` = \'\')) group by `bdclick2`.`bdproductos`.`idSistema`
mariadb-version=100135
