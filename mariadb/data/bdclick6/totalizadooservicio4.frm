TYPE=VIEW
query=select `bdclick6`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`oservicio3`.`cantidad`),\'0\',`oservicio3`.`cantidad`)) AS `Expr1` from (`bdclick6`.`bdproductosbodega4` left join `bdclick6`.`oservicio3` on((`bdclick6`.`bdproductosbodega4`.`idSistema` = `oservicio3`.`producto`))) where (`oservicio3`.`bodega` = \'BODEGA-4\') group by `bdclick6`.`bdproductosbodega4`.`idSistema`
md5=b87642240db70d509d7270a3b2d101ba
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:41
create-version=2
source=select `bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`oservicio3`.`cantidad`),\'0\',`oservicio3`.`cantidad`)) AS `Expr1` from (`bdproductosbodega4` left join `oservicio3` on((`bdproductosbodega4`.`idSistema` = `oservicio3`.`producto`))) where (`oservicio3`.`bodega` = \'BODEGA-4\') group by `bdproductosbodega4`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`oservicio3`.`cantidad`),\'0\',`oservicio3`.`cantidad`)) AS `Expr1` from (`bdclick6`.`bdproductosbodega4` left join `bdclick6`.`oservicio3` on((`bdclick6`.`bdproductosbodega4`.`idSistema` = `oservicio3`.`producto`))) where (`oservicio3`.`bodega` = \'BODEGA-4\') group by `bdclick6`.`bdproductosbodega4`.`idSistema`
mariadb-version=100135
