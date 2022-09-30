TYPE=VIEW
query=select `bdclick6`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdclick6`.`bdproductosbodega2` left join (`bdclick6`.`concompras` left join `bdclick6`.`bdingreso` on((`bdclick6`.`bdingreso`.`id` = `concompras`.`id`))) on((`bdclick6`.`bdproductosbodega2`.`idSistema` = `concompras`.`producto`))) where (`concompras`.`bodega` = \'BODEGA-2\') group by `bdclick6`.`bdproductosbodega2`.`idSistema`
md5=700ef6df0e4c6ef159b4a6a135f79a33
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:40
create-version=2
source=select `bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdproductosbodega2` left join (`concompras` left join `bdingreso` on((`bdingreso`.`id` = `concompras`.`id`))) on((`bdproductosbodega2`.`idSistema` = `concompras`.`producto`))) where (`concompras`.`bodega` = \'BODEGA-2\') group by `bdproductosbodega2`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdclick6`.`bdproductosbodega2` left join (`bdclick6`.`concompras` left join `bdclick6`.`bdingreso` on((`bdclick6`.`bdingreso`.`id` = `concompras`.`id`))) on((`bdclick6`.`bdproductosbodega2`.`idSistema` = `concompras`.`producto`))) where (`concompras`.`bodega` = \'BODEGA-2\') group by `bdclick6`.`bdproductosbodega2`.`idSistema`
mariadb-version=100135
