TYPE=VIEW
query=select `bdclick2`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductosbodega3` left join (`bdclick2`.`concompras` left join `bdclick2`.`bdingreso` on((`bdclick2`.`bdingreso`.`id` = `concompras`.`id`))) on((`bdclick2`.`bdproductosbodega3`.`idSistema` = `concompras`.`producto`))) where (`concompras`.`bodega` = \'BODEGA-3\') group by `bdclick2`.`bdproductosbodega3`.`idSistema`
md5=afd8bcf96beef5043e02d7b0bbb73b8f
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:49
create-version=2
source=select `bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdproductosbodega3` left join (`concompras` left join `bdingreso` on((`bdingreso`.`id` = `concompras`.`id`))) on((`bdproductosbodega3`.`idSistema` = `concompras`.`producto`))) where (`concompras`.`bodega` = \'BODEGA-3\') group by `bdproductosbodega3`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductosbodega3` left join (`bdclick2`.`concompras` left join `bdclick2`.`bdingreso` on((`bdclick2`.`bdingreso`.`id` = `concompras`.`id`))) on((`bdclick2`.`bdproductosbodega3`.`idSistema` = `concompras`.`producto`))) where (`concompras`.`bodega` = \'BODEGA-3\') group by `bdclick2`.`bdproductosbodega3`.`idSistema`
mariadb-version=100135
