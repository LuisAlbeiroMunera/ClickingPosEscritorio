TYPE=VIEW
query=(select `bdclick5`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`concompras1`.`cantidad`),\'0\',`concompras1`.`cantidad`)) AS `Expr1` from (`bdclick5`.`bdproductos` left join (`bdclick5`.`concompras1` left join `bdclick5`.`bdingreso` on((`bdclick5`.`bdingreso`.`id` = `concompras1`.`id`))) on((`bdclick5`.`bdproductos`.`idSistema` = `concompras1`.`producto`))) group by `bdclick5`.`bdproductos`.`idSistema`)
md5=a54cdc4b120bfde78f5ac9f829ee4aa0
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:52
create-version=2
source=(select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`concompras1`.`cantidad`),\'0\',`concompras1`.`cantidad`)) AS `Expr1` from (`bdproductos` left join (`concompras1` left join `bdingreso` on((`bdingreso`.`id` = `concompras1`.`id`))) on((`bdproductos`.`idSistema` = `concompras1`.`producto`))) group by `bdproductos`.`idSistema`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick5`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`concompras1`.`cantidad`),\'0\',`concompras1`.`cantidad`)) AS `Expr1` from (`bdclick5`.`bdproductos` left join (`bdclick5`.`concompras1` left join `bdclick5`.`bdingreso` on((`bdclick5`.`bdingreso`.`id` = `concompras1`.`id`))) on((`bdclick5`.`bdproductos`.`idSistema` = `concompras1`.`producto`))) group by `bdclick5`.`bdproductos`.`idSistema`)
mariadb-version=100135
