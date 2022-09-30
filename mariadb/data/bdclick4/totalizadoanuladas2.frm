TYPE=VIEW
query=select `bdclick4`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`anulacion`.`cantidad`),\'0\',`anulacion`.`cantidad`)) AS `Expr1` from (`bdclick4`.`bdproductosbodega2` left join `bdclick4`.`anulacion` on((`bdclick4`.`bdproductosbodega2`.`idSistema` = `anulacion`.`producto`))) where (`anulacion`.`bodega` = \'BODEGA-2\') group by `bdclick4`.`bdproductosbodega2`.`idSistema`
md5=228e88fa40c03cc3e5644fa6ad9fc846
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:32
create-version=2
source=select `bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`anulacion`.`cantidad`),\'0\',`anulacion`.`cantidad`)) AS `Expr1` from (`bdproductosbodega2` left join `anulacion` on((`bdproductosbodega2`.`idSistema` = `anulacion`.`producto`))) where (`anulacion`.`bodega` = \'BODEGA-2\') group by `bdproductosbodega2`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`anulacion`.`cantidad`),\'0\',`anulacion`.`cantidad`)) AS `Expr1` from (`bdclick4`.`bdproductosbodega2` left join `bdclick4`.`anulacion` on((`bdclick4`.`bdproductosbodega2`.`idSistema` = `anulacion`.`producto`))) where (`anulacion`.`bodega` = \'BODEGA-2\') group by `bdclick4`.`bdproductosbodega2`.`idSistema`
mariadb-version=100135
