TYPE=VIEW
query=select `bdclick3`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`anulacion`.`cantidad`),\'0\',`anulacion`.`cantidad`)) AS `Expr1` from (`bdclick3`.`bdproductos` left join `bdclick3`.`anulacion` on((`bdclick3`.`bdproductos`.`idSistema` = `anulacion`.`producto`))) where ((`anulacion`.`bodega` = \'123-22\') or (`anulacion`.`bodega` = \'\')) group by `bdclick3`.`bdproductos`.`idSistema`
md5=873b1e27a93f752ecb9a9eb5704d1bea
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:55
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`anulacion`.`cantidad`),\'0\',`anulacion`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `anulacion` on((`bdproductos`.`idSistema` = `anulacion`.`producto`))) where ((`anulacion`.`bodega` = \'123-22\') or (`anulacion`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`anulacion`.`cantidad`),\'0\',`anulacion`.`cantidad`)) AS `Expr1` from (`bdclick3`.`bdproductos` left join `bdclick3`.`anulacion` on((`bdclick3`.`bdproductos`.`idSistema` = `anulacion`.`producto`))) where ((`anulacion`.`bodega` = \'123-22\') or (`anulacion`.`bodega` = \'\')) group by `bdclick3`.`bdproductos`.`idSistema`
mariadb-version=100135
