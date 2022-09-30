TYPE=VIEW
query=(select `bdclick`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`concompras1`.`cantidad`),\'0\',`concompras1`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductos` left join (`bdclick`.`concompras1` left join `bdclick`.`bdingreso` on((`bdclick`.`bdingreso`.`id` = `concompras1`.`id`))) on((`bdclick`.`bdproductos`.`idSistema` = `concompras1`.`producto`))) group by `bdclick`.`bdproductos`.`idSistema`)
md5=6d9d4974f44263304768ccf98786996f
updatable=0
algorithm=0
definer_user=root
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:29
create-version=2
source=(select `bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`concompras1`.`cantidad`),\'0\',`concompras1`.`cantidad`)) AS `Expr1` from (`bdproductos` left join (`concompras1` left join `bdingreso` on((`bdingreso`.`id` = `concompras1`.`id`))) on((`bdproductos`.`idSistema` = `concompras1`.`producto`))) group by `bdproductos`.`idSistema`)
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=(select `bdclick`.`bdproductos`.`idSistema` AS `codigo`,sum(if(isnull(`concompras1`.`cantidad`),\'0\',`concompras1`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductos` left join (`bdclick`.`concompras1` left join `bdclick`.`bdingreso` on((`bdclick`.`bdingreso`.`id` = `concompras1`.`id`))) on((`bdclick`.`bdproductos`.`idSistema` = `concompras1`.`producto`))) group by `bdclick`.`bdproductos`.`idSistema`)
mariadb-version=100135
