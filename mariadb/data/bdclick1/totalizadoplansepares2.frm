TYPE=VIEW
query=select `bdclick1`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`plansepare1`.`cantidad`),\'0\',`plansepare1`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductosbodega2` left join `bdclick1`.`plansepare1` on((`bdclick1`.`bdproductosbodega2`.`idSistema` = `plansepare1`.`producto`))) where (`plansepare1`.`bodega` = \'BODEGA-2\') group by `bdclick1`.`bdproductosbodega2`.`idSistema`
md5=665347631dca8583ca91220d39d8f25a
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:40
create-version=2
source=select `bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`plansepare1`.`cantidad`),\'0\',`plansepare1`.`cantidad`)) AS `Expr1` from (`bdproductosbodega2` left join `plansepare1` on((`bdproductosbodega2`.`idSistema` = `plansepare1`.`producto`))) where (`plansepare1`.`bodega` = \'BODEGA-2\') group by `bdproductosbodega2`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`plansepare1`.`cantidad`),\'0\',`plansepare1`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductosbodega2` left join `bdclick1`.`plansepare1` on((`bdclick1`.`bdproductosbodega2`.`idSistema` = `plansepare1`.`producto`))) where (`plansepare1`.`bodega` = \'BODEGA-2\') group by `bdclick1`.`bdproductosbodega2`.`idSistema`
mariadb-version=100135
