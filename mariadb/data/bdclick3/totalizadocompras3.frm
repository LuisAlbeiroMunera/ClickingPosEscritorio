TYPE=VIEW
query=select `bdclick3`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdclick3`.`bdproductosbodega3` left join (`bdclick3`.`concompras` left join `bdclick3`.`bdingreso` on((`bdclick3`.`bdingreso`.`id` = `concompras`.`id`))) on((`bdclick3`.`bdproductosbodega3`.`idSistema` = `concompras`.`producto`))) where (`concompras`.`bodega` = \'BODEGA-3\') group by `bdclick3`.`bdproductosbodega3`.`idSistema`
md5=7289bd43aa7b29a3e062949da836f3e3
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:55
create-version=2
source=select `bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdproductosbodega3` left join (`concompras` left join `bdingreso` on((`bdingreso`.`id` = `concompras`.`id`))) on((`bdproductosbodega3`.`idSistema` = `concompras`.`producto`))) where (`concompras`.`bodega` = \'BODEGA-3\') group by `bdproductosbodega3`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`concompras`.`cantidad`),\'0\',`concompras`.`cantidad`)) AS `Expr1` from (`bdclick3`.`bdproductosbodega3` left join (`bdclick3`.`concompras` left join `bdclick3`.`bdingreso` on((`bdclick3`.`bdingreso`.`id` = `concompras`.`id`))) on((`bdclick3`.`bdproductosbodega3`.`idSistema` = `concompras`.`producto`))) where (`concompras`.`bodega` = \'BODEGA-3\') group by `bdclick3`.`bdproductosbodega3`.`idSistema`
mariadb-version=100135
