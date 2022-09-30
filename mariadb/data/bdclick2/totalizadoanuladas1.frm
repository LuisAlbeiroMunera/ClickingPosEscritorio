TYPE=VIEW
query=select `bdclick2`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`anulacion`.`cantidad`),\'0\',`anulacion`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductosbodega1` left join `bdclick2`.`anulacion` on((`bdclick2`.`bdproductosbodega1`.`idSistema` = `anulacion`.`producto`))) where (`anulacion`.`bodega` = \'BODEGA-1\') group by `bdclick2`.`bdproductosbodega1`.`idSistema`
md5=2bc02d071bdde1e75c651d78ca615502
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:49
create-version=2
source=select `bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`anulacion`.`cantidad`),\'0\',`anulacion`.`cantidad`)) AS `Expr1` from (`bdproductosbodega1` left join `anulacion` on((`bdproductosbodega1`.`idSistema` = `anulacion`.`producto`))) where (`anulacion`.`bodega` = \'BODEGA-1\') group by `bdproductosbodega1`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`anulacion`.`cantidad`),\'0\',`anulacion`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductosbodega1` left join `bdclick2`.`anulacion` on((`bdclick2`.`bdproductosbodega1`.`idSistema` = `anulacion`.`producto`))) where (`anulacion`.`bodega` = \'BODEGA-1\') group by `bdclick2`.`bdproductosbodega1`.`idSistema`
mariadb-version=100135
