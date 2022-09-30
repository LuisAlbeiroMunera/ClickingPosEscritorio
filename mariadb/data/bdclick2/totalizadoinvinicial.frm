TYPE=VIEW
query=(select `bdclick2`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`concompras1`.`cantidad`),\'0\',`concompras1`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductos` left join (`bdclick2`.`concompras1` left join `bdclick2`.`bdingreso` on((`bdclick2`.`bdingreso`.`id` = `concompras1`.`id`))) on((`bdclick2`.`bdproductos`.`idSistema` = `concompras1`.`producto`))) group by `bdclick2`.`bdproductos`.`idSistema`)
md5=d7d594196e0394dfe6abcf55aa3a7bef
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:50
create-version=2
source=(select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`concompras1`.`cantidad`),\'0\',`concompras1`.`cantidad`)) AS `Expr1` from (`bdproductos` left join (`concompras1` left join `bdingreso` on((`bdingreso`.`id` = `concompras1`.`id`))) on((`bdproductos`.`idSistema` = `concompras1`.`producto`))) group by `bdproductos`.`idSistema`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick2`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`concompras1`.`cantidad`),\'0\',`concompras1`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductos` left join (`bdclick2`.`concompras1` left join `bdclick2`.`bdingreso` on((`bdclick2`.`bdingreso`.`id` = `concompras1`.`id`))) on((`bdclick2`.`bdproductos`.`idSistema` = `concompras1`.`producto`))) group by `bdclick2`.`bdproductos`.`idSistema`)
mariadb-version=100135
