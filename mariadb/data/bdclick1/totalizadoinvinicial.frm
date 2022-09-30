TYPE=VIEW
query=(select `bdclick1`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`concompras1`.`cantidad`),\'0\',`concompras1`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductos` left join (`bdclick1`.`concompras1` left join `bdclick1`.`bdingreso` on((`bdclick1`.`bdingreso`.`id` = `concompras1`.`id`))) on((`bdclick1`.`bdproductos`.`idSistema` = `concompras1`.`producto`))) group by `bdclick1`.`bdproductos`.`idSistema`)
md5=ad2fe39df95969eacc454cfc989924c3
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:39
create-version=2
source=(select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`concompras1`.`cantidad`),\'0\',`concompras1`.`cantidad`)) AS `Expr1` from (`bdproductos` left join (`concompras1` left join `bdingreso` on((`bdingreso`.`id` = `concompras1`.`id`))) on((`bdproductos`.`idSistema` = `concompras1`.`producto`))) group by `bdproductos`.`idSistema`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick1`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`concompras1`.`cantidad`),\'0\',`concompras1`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductos` left join (`bdclick1`.`concompras1` left join `bdclick1`.`bdingreso` on((`bdclick1`.`bdingreso`.`id` = `concompras1`.`id`))) on((`bdclick1`.`bdproductos`.`idSistema` = `concompras1`.`producto`))) group by `bdclick1`.`bdproductos`.`idSistema`)
mariadb-version=100135
