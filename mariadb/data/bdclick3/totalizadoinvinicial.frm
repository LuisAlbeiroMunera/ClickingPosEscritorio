TYPE=VIEW
query=(select `bdclick3`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`concompras1`.`cantidad`),\'0\',`concompras1`.`cantidad`)) AS `Expr1` from (`bdclick3`.`bdproductos` left join (`bdclick3`.`concompras1` left join `bdclick3`.`bdingreso` on((`bdclick3`.`bdingreso`.`id` = `concompras1`.`id`))) on((`bdclick3`.`bdproductos`.`idSistema` = `concompras1`.`producto`))) group by `bdclick3`.`bdproductos`.`idSistema`)
md5=259e64bd98db12357015a2f67acdf13d
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:55
create-version=2
source=(select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`concompras1`.`cantidad`),\'0\',`concompras1`.`cantidad`)) AS `Expr1` from (`bdproductos` left join (`concompras1` left join `bdingreso` on((`bdingreso`.`id` = `concompras1`.`id`))) on((`bdproductos`.`idSistema` = `concompras1`.`producto`))) group by `bdproductos`.`idSistema`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick3`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`concompras1`.`cantidad`),\'0\',`concompras1`.`cantidad`)) AS `Expr1` from (`bdclick3`.`bdproductos` left join (`bdclick3`.`concompras1` left join `bdclick3`.`bdingreso` on((`bdclick3`.`bdingreso`.`id` = `concompras1`.`id`))) on((`bdclick3`.`bdproductos`.`idSistema` = `concompras1`.`producto`))) group by `bdclick3`.`bdproductos`.`idSistema`)
mariadb-version=100135
