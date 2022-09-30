TYPE=VIEW
query=select `bdclick`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductosbodega3` left join (`bdclick`.`concompras` left join `bdclick`.`bdingreso` on((`bdclick`.`bdingreso`.`id` = `concompras`.`id`))) on((`bdclick`.`bdproductosbodega3`.`idSistema` = `concompras`.`producto`))) where (`concompras`.`bodega` = \'BODEGA-3\') group by `bdclick`.`bdproductosbodega3`.`idSistema`
md5=eb1ca7fef8fbeeb71963bebe544fdeb9
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-09-20 15:58:28
create-version=2
source=select `bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdproductosbodega3` left join (`concompras` left join `bdingreso` on((`bdingreso`.`id` = `concompras`.`id`))) on((`bdproductosbodega3`.`idSistema` = `concompras`.`producto`))) where (`concompras`.`bodega` = \'BODEGA-3\') group by `bdproductosbodega3`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdclick`.`bdproductosbodega3` left join (`bdclick`.`concompras` left join `bdclick`.`bdingreso` on((`bdclick`.`bdingreso`.`id` = `concompras`.`id`))) on((`bdclick`.`bdproductosbodega3`.`idSistema` = `concompras`.`producto`))) where (`concompras`.`bodega` = \'BODEGA-3\') group by `bdclick`.`bdproductosbodega3`.`idSistema`
mariadb-version=100135
