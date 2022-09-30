TYPE=VIEW
query=select `bdclick1`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductosbodega3` left join (`bdclick1`.`concompras` left join `bdclick1`.`bdingreso` on((`bdclick1`.`bdingreso`.`id` = `concompras`.`id`))) on((`bdclick1`.`bdproductosbodega3`.`idSistema` = `concompras`.`producto`))) where (`concompras`.`bodega` = \'BODEGA-3\') group by `bdclick1`.`bdproductosbodega3`.`idSistema`
md5=0046bf71541a9a620b37a9fd6dd67020
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:39
create-version=2
source=select `bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdproductosbodega3` left join (`concompras` left join `bdingreso` on((`bdingreso`.`id` = `concompras`.`id`))) on((`bdproductosbodega3`.`idSistema` = `concompras`.`producto`))) where (`concompras`.`bodega` = \'BODEGA-3\') group by `bdproductosbodega3`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductosbodega3` left join (`bdclick1`.`concompras` left join `bdclick1`.`bdingreso` on((`bdclick1`.`bdingreso`.`id` = `concompras`.`id`))) on((`bdclick1`.`bdproductosbodega3`.`idSistema` = `concompras`.`producto`))) where (`concompras`.`bodega` = \'BODEGA-3\') group by `bdclick1`.`bdproductosbodega3`.`idSistema`
mariadb-version=100135
