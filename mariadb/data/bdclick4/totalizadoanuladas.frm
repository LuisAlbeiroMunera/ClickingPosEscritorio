TYPE=VIEW
query=select `bdclick4`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`anulacion`.`cantidad`),\'0\',`anulacion`.`cantidad`)) AS `Expr1` from (`bdclick4`.`bdproductos` left join `bdclick4`.`anulacion` on((`bdclick4`.`bdproductos`.`idSistema` = `anulacion`.`producto`))) where ((`anulacion`.`bodega` = \'123-22\') or (`anulacion`.`bodega` = \'\')) group by `bdclick4`.`bdproductos`.`idSistema`
md5=10ca2d9270f488fbd7bb22d2775167e6
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:32
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`anulacion`.`cantidad`),\'0\',`anulacion`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `anulacion` on((`bdproductos`.`idSistema` = `anulacion`.`producto`))) where ((`anulacion`.`bodega` = \'123-22\') or (`anulacion`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`anulacion`.`cantidad`),\'0\',`anulacion`.`cantidad`)) AS `Expr1` from (`bdclick4`.`bdproductos` left join `bdclick4`.`anulacion` on((`bdclick4`.`bdproductos`.`idSistema` = `anulacion`.`producto`))) where ((`anulacion`.`bodega` = \'123-22\') or (`anulacion`.`bodega` = \'\')) group by `bdclick4`.`bdproductos`.`idSistema`
mariadb-version=100135
