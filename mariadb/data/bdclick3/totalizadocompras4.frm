TYPE=VIEW
query=select `bdclick3`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdclick3`.`bdproductosbodega4` left join (`bdclick3`.`concompras` left join `bdclick3`.`bdingreso` on((`bdclick3`.`bdingreso`.`id` = `concompras`.`id`))) on((`bdclick3`.`bdproductosbodega4`.`idSistema` = `concompras`.`producto`))) where (`concompras`.`bodega` = \'BODEGA-4\') group by `bdclick3`.`bdproductosbodega4`.`idSistema`
md5=a42f65249e82730b33d42542d4fd0ede
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:55
create-version=2
source=select `bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdproductosbodega4` left join (`concompras` left join `bdingreso` on((`bdingreso`.`id` = `concompras`.`id`))) on((`bdproductosbodega4`.`idSistema` = `concompras`.`producto`))) where (`concompras`.`bodega` = \'BODEGA-4\') group by `bdproductosbodega4`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdclick3`.`bdproductosbodega4` left join (`bdclick3`.`concompras` left join `bdclick3`.`bdingreso` on((`bdclick3`.`bdingreso`.`id` = `concompras`.`id`))) on((`bdclick3`.`bdproductosbodega4`.`idSistema` = `concompras`.`producto`))) where (`concompras`.`bodega` = \'BODEGA-4\') group by `bdclick3`.`bdproductosbodega4`.`idSistema`
mariadb-version=100135
