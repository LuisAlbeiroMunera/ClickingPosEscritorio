TYPE=VIEW
query=select `bdclick`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`anulacion`.`cantidad`),\'0\',`anulacion`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductosbodega4` left join `bdclick`.`anulacion` on((`bdclick`.`bdproductosbodega4`.`idSistema` = `anulacion`.`producto`))) where (`anulacion`.`bodega` = \'BODEGA-4\') group by `bdclick`.`bdproductosbodega4`.`idSistema`
md5=8eae46f63bcb02e734adeed1f95ee82f
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:28
create-version=2
source=select `bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`anulacion`.`cantidad`),\'0\',`anulacion`.`cantidad`)) AS `Expr1` from (`bdproductosbodega4` left join `anulacion` on((`bdproductosbodega4`.`idSistema` = `anulacion`.`producto`))) where (`anulacion`.`bodega` = \'BODEGA-4\') group by `bdproductosbodega4`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`anulacion`.`cantidad`),\'0\',`anulacion`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductosbodega4` left join `bdclick`.`anulacion` on((`bdclick`.`bdproductosbodega4`.`idSistema` = `anulacion`.`producto`))) where (`anulacion`.`bodega` = \'BODEGA-4\') group by `bdclick`.`bdproductosbodega4`.`idSistema`
mariadb-version=100135
