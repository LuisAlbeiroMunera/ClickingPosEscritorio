TYPE=VIEW
query=(select `bdclick6`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`concompras1`.`cantidad`),\'0\',`concompras1`.`cantidad`)) AS `Expr1` from (`bdclick6`.`bdproductos` left join (`bdclick6`.`concompras1` left join `bdclick6`.`bdingreso` on((`bdclick6`.`bdingreso`.`id` = `concompras1`.`id`))) on((`bdclick6`.`bdproductos`.`idSistema` = `concompras1`.`producto`))) group by `bdclick6`.`bdproductos`.`idSistema`)
md5=a2676389d57b475e72f4801d789b70e2
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:41
create-version=2
source=(select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`concompras1`.`cantidad`),\'0\',`concompras1`.`cantidad`)) AS `Expr1` from (`bdproductos` left join (`concompras1` left join `bdingreso` on((`bdingreso`.`id` = `concompras1`.`id`))) on((`bdproductos`.`idSistema` = `concompras1`.`producto`))) group by `bdproductos`.`idSistema`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick6`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`concompras1`.`cantidad`),\'0\',`concompras1`.`cantidad`)) AS `Expr1` from (`bdclick6`.`bdproductos` left join (`bdclick6`.`concompras1` left join `bdclick6`.`bdingreso` on((`bdclick6`.`bdingreso`.`id` = `concompras1`.`id`))) on((`bdclick6`.`bdproductos`.`idSistema` = `concompras1`.`producto`))) group by `bdclick6`.`bdproductos`.`idSistema`)
mariadb-version=100135
