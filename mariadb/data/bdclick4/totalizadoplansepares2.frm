TYPE=VIEW
query=select `bdclick4`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`plansepare1`.`cantidad`),\'0\',`plansepare1`.`cantidad`)) AS `Expr1` from (`bdclick4`.`bdproductosbodega2` left join `bdclick4`.`plansepare1` on((`bdclick4`.`bdproductosbodega2`.`idSistema` = `plansepare1`.`producto`))) where (`plansepare1`.`bodega` = \'BODEGA-2\') group by `bdclick4`.`bdproductosbodega2`.`idSistema`
md5=3ea08156651361654e4813752b395125
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:33
create-version=2
source=select `bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`plansepare1`.`cantidad`),\'0\',`plansepare1`.`cantidad`)) AS `Expr1` from (`bdproductosbodega2` left join `plansepare1` on((`bdproductosbodega2`.`idSistema` = `plansepare1`.`producto`))) where (`plansepare1`.`bodega` = \'BODEGA-2\') group by `bdproductosbodega2`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`plansepare1`.`cantidad`),\'0\',`plansepare1`.`cantidad`)) AS `Expr1` from (`bdclick4`.`bdproductosbodega2` left join `bdclick4`.`plansepare1` on((`bdclick4`.`bdproductosbodega2`.`idSistema` = `plansepare1`.`producto`))) where (`plansepare1`.`bodega` = \'BODEGA-2\') group by `bdclick4`.`bdproductosbodega2`.`idSistema`
mariadb-version=100135
