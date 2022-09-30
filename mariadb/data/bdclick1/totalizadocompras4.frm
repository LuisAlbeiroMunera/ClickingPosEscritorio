TYPE=VIEW
query=select `bdclick1`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductosbodega4` left join (`bdclick1`.`concompras` left join `bdclick1`.`bdingreso` on((`bdclick1`.`bdingreso`.`id` = `concompras`.`id`))) on((`bdclick1`.`bdproductosbodega4`.`idSistema` = `concompras`.`producto`))) where (`concompras`.`bodega` = \'BODEGA-4\') group by `bdclick1`.`bdproductosbodega4`.`idSistema`
md5=abb31c58e7d9165df1d25c1f3357f813
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:39
create-version=2
source=select `bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdproductosbodega4` left join (`concompras` left join `bdingreso` on((`bdingreso`.`id` = `concompras`.`id`))) on((`bdproductosbodega4`.`idSistema` = `concompras`.`producto`))) where (`concompras`.`bodega` = \'BODEGA-4\') group by `bdproductosbodega4`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductosbodega4` left join (`bdclick1`.`concompras` left join `bdclick1`.`bdingreso` on((`bdclick1`.`bdingreso`.`id` = `concompras`.`id`))) on((`bdclick1`.`bdproductosbodega4`.`idSistema` = `concompras`.`producto`))) where (`concompras`.`bodega` = \'BODEGA-4\') group by `bdclick1`.`bdproductosbodega4`.`idSistema`
mariadb-version=100135
