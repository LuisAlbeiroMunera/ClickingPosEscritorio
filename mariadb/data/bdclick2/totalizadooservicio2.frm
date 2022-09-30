TYPE=VIEW
query=select `bdclick2`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`oservicio3`.`cantidad`),\'0\',`oservicio3`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductosbodega2` left join `bdclick2`.`oservicio3` on((`bdclick2`.`bdproductosbodega2`.`idSistema` = `oservicio3`.`producto`))) where (`oservicio3`.`bodega` = \'BODEGA-2\') group by `bdclick2`.`bdproductosbodega2`.`idSistema`
md5=ecb726d681b1e04228512a9ee9897585
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:50
create-version=2
source=select `bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`oservicio3`.`cantidad`),\'0\',`oservicio3`.`cantidad`)) AS `Expr1` from (`bdproductosbodega2` left join `oservicio3` on((`bdproductosbodega2`.`idSistema` = `oservicio3`.`producto`))) where (`oservicio3`.`bodega` = \'BODEGA-2\') group by `bdproductosbodega2`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`oservicio3`.`cantidad`),\'0\',`oservicio3`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductosbodega2` left join `bdclick2`.`oservicio3` on((`bdclick2`.`bdproductosbodega2`.`idSistema` = `oservicio3`.`producto`))) where (`oservicio3`.`bodega` = \'BODEGA-2\') group by `bdclick2`.`bdproductosbodega2`.`idSistema`
mariadb-version=100135
