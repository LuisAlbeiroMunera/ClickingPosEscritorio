TYPE=VIEW
query=select `bdclick4`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdclick4`.`bdproductos` left join (`bdclick4`.`concompras` left join `bdclick4`.`bdingreso` on((`bdclick4`.`bdingreso`.`id` = `concompras`.`id`))) on((`bdclick4`.`bdproductos`.`idSistema` = `concompras`.`producto`))) where ((`concompras`.`bodega` = \'123-22\') or (`concompras`.`bodega` = \'\')) group by `bdclick4`.`bdproductos`.`idSistema`
md5=bbdad61cdb4431e900b8f6f7cfbea272
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:32
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdproductos` left join (`concompras` left join `bdingreso` on((`bdingreso`.`id` = `concompras`.`id`))) on((`bdproductos`.`idSistema` = `concompras`.`producto`))) where ((`concompras`.`bodega` = \'123-22\') or (`concompras`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdclick4`.`bdproductos` left join (`bdclick4`.`concompras` left join `bdclick4`.`bdingreso` on((`bdclick4`.`bdingreso`.`id` = `concompras`.`id`))) on((`bdclick4`.`bdproductos`.`idSistema` = `concompras`.`producto`))) where ((`concompras`.`bodega` = \'123-22\') or (`concompras`.`bodega` = \'\')) group by `bdclick4`.`bdproductos`.`idSistema`
mariadb-version=100135
