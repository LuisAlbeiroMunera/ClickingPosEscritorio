TYPE=VIEW
query=select `bdclick5`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`anulacion`.`cantidad`),\'0\',`anulacion`.`cantidad`)) AS `Expr1` from (`bdclick5`.`bdproductosbodega3` left join `bdclick5`.`anulacion` on((`bdclick5`.`bdproductosbodega3`.`idSistema` = `anulacion`.`producto`))) where (`anulacion`.`bodega` = \'BODEGA-3\') group by `bdclick5`.`bdproductosbodega3`.`idSistema`
md5=fbbde94ee764cd786dbd6c9725c3d503
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:51
create-version=2
source=select `bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`anulacion`.`cantidad`),\'0\',`anulacion`.`cantidad`)) AS `Expr1` from (`bdproductosbodega3` left join `anulacion` on((`bdproductosbodega3`.`idSistema` = `anulacion`.`producto`))) where (`anulacion`.`bodega` = \'BODEGA-3\') group by `bdproductosbodega3`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`anulacion`.`cantidad`),\'0\',`anulacion`.`cantidad`)) AS `Expr1` from (`bdclick5`.`bdproductosbodega3` left join `bdclick5`.`anulacion` on((`bdclick5`.`bdproductosbodega3`.`idSistema` = `anulacion`.`producto`))) where (`anulacion`.`bodega` = \'BODEGA-3\') group by `bdclick5`.`bdproductosbodega3`.`idSistema`
mariadb-version=100135
