TYPE=VIEW
query=select `bdclick5`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdclick5`.`bdproductos` left join (`bdclick5`.`concompras` left join `bdclick5`.`bdingreso` on((`bdclick5`.`bdingreso`.`id` = `concompras`.`id`))) on((`bdclick5`.`bdproductos`.`idSistema` = `concompras`.`producto`))) where ((`concompras`.`bodega` = \'123-22\') or (`concompras`.`bodega` = \'\')) group by `bdclick5`.`bdproductos`.`idSistema`
md5=67c95b6af2df6cdd5b696d9f6316d996
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:51
create-version=2
source=select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdproductos` left join (`concompras` left join `bdingreso` on((`bdingreso`.`id` = `concompras`.`id`))) on((`bdproductos`.`idSistema` = `concompras`.`producto`))) where ((`concompras`.`bodega` = \'123-22\') or (`concompras`.`bodega` = \'\')) group by `bdproductos`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdclick5`.`bdproductos` left join (`bdclick5`.`concompras` left join `bdclick5`.`bdingreso` on((`bdclick5`.`bdingreso`.`id` = `concompras`.`id`))) on((`bdclick5`.`bdproductos`.`idSistema` = `concompras`.`producto`))) where ((`concompras`.`bodega` = \'123-22\') or (`concompras`.`bodega` = \'\')) group by `bdclick5`.`bdproductos`.`idSistema`
mariadb-version=100135
