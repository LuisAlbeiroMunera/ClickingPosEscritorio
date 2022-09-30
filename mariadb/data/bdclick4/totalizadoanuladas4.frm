TYPE=VIEW
query=select `bdclick4`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`anulacion`.`cantidad`),\'0\',`anulacion`.`cantidad`)) AS `Expr1` from (`bdclick4`.`bdproductosbodega4` left join `bdclick4`.`anulacion` on((`bdclick4`.`bdproductosbodega4`.`idSistema` = `anulacion`.`producto`))) where (`anulacion`.`bodega` = \'BODEGA-4\') group by `bdclick4`.`bdproductosbodega4`.`idSistema`
md5=2477ef0c19bc980a0ae9b4de09c4068d
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:32
create-version=2
source=select `bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`anulacion`.`cantidad`),\'0\',`anulacion`.`cantidad`)) AS `Expr1` from (`bdproductosbodega4` left join `anulacion` on((`bdproductosbodega4`.`idSistema` = `anulacion`.`producto`))) where (`anulacion`.`bodega` = \'BODEGA-4\') group by `bdproductosbodega4`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`anulacion`.`cantidad`),\'0\',`anulacion`.`cantidad`)) AS `Expr1` from (`bdclick4`.`bdproductosbodega4` left join `bdclick4`.`anulacion` on((`bdclick4`.`bdproductosbodega4`.`idSistema` = `anulacion`.`producto`))) where (`anulacion`.`bodega` = \'BODEGA-4\') group by `bdclick4`.`bdproductosbodega4`.`idSistema`
mariadb-version=100135
