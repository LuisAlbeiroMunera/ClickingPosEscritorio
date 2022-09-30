TYPE=VIEW
query=select `bdclick4`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`oservicio3`.`cantidad`),\'0\',`oservicio3`.`cantidad`)) AS `Expr1` from (`bdclick4`.`bdproductosbodega3` left join `bdclick4`.`oservicio3` on((`bdclick4`.`bdproductosbodega3`.`idSistema` = `oservicio3`.`producto`))) where (`oservicio3`.`bodega` = \'BODEGA-3\') group by `bdclick4`.`bdproductosbodega3`.`idSistema`
md5=914fd1ebb0b3deb9ee37d316fe1543ed
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:33
create-version=2
source=select `bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`oservicio3`.`cantidad`),\'0\',`oservicio3`.`cantidad`)) AS `Expr1` from (`bdproductosbodega3` left join `oservicio3` on((`bdproductosbodega3`.`idSistema` = `oservicio3`.`producto`))) where (`oservicio3`.`bodega` = \'BODEGA-3\') group by `bdproductosbodega3`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`oservicio3`.`cantidad`),\'0\',`oservicio3`.`cantidad`)) AS `Expr1` from (`bdclick4`.`bdproductosbodega3` left join `bdclick4`.`oservicio3` on((`bdclick4`.`bdproductosbodega3`.`idSistema` = `oservicio3`.`producto`))) where (`oservicio3`.`bodega` = \'BODEGA-3\') group by `bdclick4`.`bdproductosbodega3`.`idSistema`
mariadb-version=100135
