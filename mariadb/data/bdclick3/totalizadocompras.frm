TYPE=VIEW
query=select `bdclick3`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdclick3`.`bdproductos` left join (`bdclick3`.`concompras` left join `bdclick3`.`bdingreso` on((`bdclick3`.`bdingreso`.`id` = `concompras`.`id`))) on((`bdclick3`.`bdproductos`.`idSistema` = `concompras`.`producto`))) where ((`concompras`.`bodega` = \'123-22\') or (`concompras`.`bodega` = \'\')) group by `bdclick3`.`bdproductos`.`idSistema`
md5=d657a7eec8811d862b13543a5fb7850d
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:55
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdproductos` left join (`concompras` left join `bdingreso` on((`bdingreso`.`id` = `concompras`.`id`))) on((`bdproductos`.`idSistema` = `concompras`.`producto`))) where ((`concompras`.`bodega` = \'123-22\') or (`concompras`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdclick3`.`bdproductos` left join (`bdclick3`.`concompras` left join `bdclick3`.`bdingreso` on((`bdclick3`.`bdingreso`.`id` = `concompras`.`id`))) on((`bdclick3`.`bdproductos`.`idSistema` = `concompras`.`producto`))) where ((`concompras`.`bodega` = \'123-22\') or (`concompras`.`bodega` = \'\')) group by `bdclick3`.`bdproductos`.`idSistema`
mariadb-version=100135
