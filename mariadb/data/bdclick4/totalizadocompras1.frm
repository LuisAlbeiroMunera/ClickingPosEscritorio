TYPE=VIEW
query=select `bdclick4`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdclick4`.`bdproductosbodega1` left join (`bdclick4`.`concompras` left join `bdclick4`.`bdingreso` on((`bdclick4`.`bdingreso`.`id` = `concompras`.`id`))) on((`bdclick4`.`bdproductosbodega1`.`idSistema` = `concompras`.`producto`))) where (`concompras`.`bodega` = \'BODEGA-1\') group by `bdclick4`.`bdproductosbodega1`.`idSistema`
md5=7231bda334321f157d3e112eb9ff58d9
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:32
create-version=2
source=select `bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdproductosbodega1` left join (`concompras` left join `bdingreso` on((`bdingreso`.`id` = `concompras`.`id`))) on((`bdproductosbodega1`.`idSistema` = `concompras`.`producto`))) where (`concompras`.`bodega` = \'BODEGA-1\') group by `bdproductosbodega1`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdclick4`.`bdproductosbodega1` left join (`bdclick4`.`concompras` left join `bdclick4`.`bdingreso` on((`bdclick4`.`bdingreso`.`id` = `concompras`.`id`))) on((`bdclick4`.`bdproductosbodega1`.`idSistema` = `concompras`.`producto`))) where (`concompras`.`bodega` = \'BODEGA-1\') group by `bdclick4`.`bdproductosbodega1`.`idSistema`
mariadb-version=100135
