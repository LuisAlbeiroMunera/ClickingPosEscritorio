TYPE=VIEW
query=select `bdclick2`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`oservicio3`.`cantidad`),\'0\',`oservicio3`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductosbodega4` left join `bdclick2`.`oservicio3` on((`bdclick2`.`bdproductosbodega4`.`idSistema` = `oservicio3`.`producto`))) where (`oservicio3`.`bodega` = \'BODEGA-4\') group by `bdclick2`.`bdproductosbodega4`.`idSistema`
md5=0c4798872b516fc4ed14fc7243eda901
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:50
create-version=2
source=select `bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`oservicio3`.`cantidad`),\'0\',`oservicio3`.`cantidad`)) AS `Expr1` from (`bdproductosbodega4` left join `oservicio3` on((`bdproductosbodega4`.`idSistema` = `oservicio3`.`producto`))) where (`oservicio3`.`bodega` = \'BODEGA-4\') group by `bdproductosbodega4`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`oservicio3`.`cantidad`),\'0\',`oservicio3`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductosbodega4` left join `bdclick2`.`oservicio3` on((`bdclick2`.`bdproductosbodega4`.`idSistema` = `oservicio3`.`producto`))) where (`oservicio3`.`bodega` = \'BODEGA-4\') group by `bdclick2`.`bdproductosbodega4`.`idSistema`
mariadb-version=100135
