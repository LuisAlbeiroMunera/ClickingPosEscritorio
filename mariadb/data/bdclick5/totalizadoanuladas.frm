TYPE=VIEW
query=select `bdclick5`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`anulacion`.`cantidad`),\'0\',`anulacion`.`cantidad`)) AS `Expr1` from (`bdclick5`.`bdproductos` left join `bdclick5`.`anulacion` on((`bdclick5`.`bdproductos`.`idSistema` = `anulacion`.`producto`))) where ((`anulacion`.`bodega` = \'123-22\') or (`anulacion`.`bodega` = \'\')) group by `bdclick5`.`bdproductos`.`idSistema`
md5=4ea1a7f8f372bb0581f3313e98882c4f
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:51
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`anulacion`.`cantidad`),\'0\',`anulacion`.`cantidad`)) AS `Expr1` from (`bdproductos` left join `anulacion` on((`bdproductos`.`idSistema` = `anulacion`.`producto`))) where ((`anulacion`.`bodega` = \'123-22\') or (`anulacion`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`anulacion`.`cantidad`),\'0\',`anulacion`.`cantidad`)) AS `Expr1` from (`bdclick5`.`bdproductos` left join `bdclick5`.`anulacion` on((`bdclick5`.`bdproductos`.`idSistema` = `anulacion`.`producto`))) where ((`anulacion`.`bodega` = \'123-22\') or (`anulacion`.`bodega` = \'\')) group by `bdclick5`.`bdproductos`.`idSistema`
mariadb-version=100135
