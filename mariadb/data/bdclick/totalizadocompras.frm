TYPE=VIEW
query=select `bdclick`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductos` left join (`bdclick`.`concompras` left join `bdclick`.`bdingreso` on((`bdclick`.`bdingreso`.`id` = `concompras`.`id`))) on((`bdclick`.`bdproductos`.`idSistema` = `concompras`.`producto`))) where ((`concompras`.`bodega` = \'123-22\') or (`concompras`.`bodega` = \'\')) group by `bdclick`.`bdproductos`.`idSistema`
md5=64b43994834ac6ef9c451aa42154f17b
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:28
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdproductos` left join (`concompras` left join `bdingreso` on((`bdingreso`.`id` = `concompras`.`id`))) on((`bdproductos`.`idSistema` = `concompras`.`producto`))) where ((`concompras`.`bodega` = \'123-22\') or (`concompras`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductos` left join (`bdclick`.`concompras` left join `bdclick`.`bdingreso` on((`bdclick`.`bdingreso`.`id` = `concompras`.`id`))) on((`bdclick`.`bdproductos`.`idSistema` = `concompras`.`producto`))) where ((`concompras`.`bodega` = \'123-22\') or (`concompras`.`bodega` = \'\')) group by `bdclick`.`bdproductos`.`idSistema`
mariadb-version=100135
