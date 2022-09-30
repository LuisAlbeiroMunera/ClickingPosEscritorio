TYPE=VIEW
query=select `bdclick`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`anulacion`.`cantidad`),\'0\',`anulacion`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductosbodega1` left join `bdclick`.`anulacion` on((`bdclick`.`bdproductosbodega1`.`idSistema` = `anulacion`.`producto`))) where (`anulacion`.`bodega` = \'BODEGA-1\') group by `bdclick`.`bdproductosbodega1`.`idSistema`
md5=3364640b2ddd55767d01da4546c1888e
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:28
create-version=2
source=select `bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`anulacion`.`cantidad`),\'0\',`anulacion`.`cantidad`)) AS `Expr1` from (`bdproductosbodega1` left join `anulacion` on((`bdproductosbodega1`.`idSistema` = `anulacion`.`producto`))) where (`anulacion`.`bodega` = \'BODEGA-1\') group by `bdproductosbodega1`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`anulacion`.`cantidad`),\'0\',`anulacion`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductosbodega1` left join `bdclick`.`anulacion` on((`bdclick`.`bdproductosbodega1`.`idSistema` = `anulacion`.`producto`))) where (`anulacion`.`bodega` = \'BODEGA-1\') group by `bdclick`.`bdproductosbodega1`.`idSistema`
mariadb-version=100135
