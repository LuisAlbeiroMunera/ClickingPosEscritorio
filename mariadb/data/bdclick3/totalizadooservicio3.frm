TYPE=VIEW
query=select `bdclick3`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`oservicio3`.`cantidad`),\'0\',`oservicio3`.`cantidad`)) AS `Expr1` from (`bdclick3`.`bdproductosbodega3` left join `bdclick3`.`oservicio3` on((`bdclick3`.`bdproductosbodega3`.`idSistema` = `oservicio3`.`producto`))) where (`oservicio3`.`bodega` = \'BODEGA-3\') group by `bdclick3`.`bdproductosbodega3`.`idSistema`
md5=01e9c66b77e81ab44b57e85a83f9dd99
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:56
create-version=2
source=select `bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`oservicio3`.`cantidad`),\'0\',`oservicio3`.`cantidad`)) AS `Expr1` from (`bdproductosbodega3` left join `oservicio3` on((`bdproductosbodega3`.`idSistema` = `oservicio3`.`producto`))) where (`oservicio3`.`bodega` = \'BODEGA-3\') group by `bdproductosbodega3`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`oservicio3`.`cantidad`),\'0\',`oservicio3`.`cantidad`)) AS `Expr1` from (`bdclick3`.`bdproductosbodega3` left join `bdclick3`.`oservicio3` on((`bdclick3`.`bdproductosbodega3`.`idSistema` = `oservicio3`.`producto`))) where (`oservicio3`.`bodega` = \'BODEGA-3\') group by `bdclick3`.`bdproductosbodega3`.`idSistema`
mariadb-version=100135
