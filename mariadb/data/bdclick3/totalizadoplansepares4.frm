TYPE=VIEW
query=select `bdclick3`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`plansepare1`.`cantidad`),\'0\',`plansepare1`.`cantidad`)) AS `Expr1` from (`bdclick3`.`bdproductosbodega4` left join `bdclick3`.`plansepare1` on((`bdclick3`.`bdproductosbodega4`.`idSistema` = `plansepare1`.`producto`))) where (`plansepare1`.`bodega` = \'BODEGA-4\') group by `bdclick3`.`bdproductosbodega4`.`idSistema`
md5=f70a0cd7902d7c6b98037e0d4cfc5ee4
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:56
create-version=2
source=select `bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`plansepare1`.`cantidad`),\'0\',`plansepare1`.`cantidad`)) AS `Expr1` from (`bdproductosbodega4` left join `plansepare1` on((`bdproductosbodega4`.`idSistema` = `plansepare1`.`producto`))) where (`plansepare1`.`bodega` = \'BODEGA-4\') group by `bdproductosbodega4`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`plansepare1`.`cantidad`),\'0\',`plansepare1`.`cantidad`)) AS `Expr1` from (`bdclick3`.`bdproductosbodega4` left join `bdclick3`.`plansepare1` on((`bdclick3`.`bdproductosbodega4`.`idSistema` = `plansepare1`.`producto`))) where (`plansepare1`.`bodega` = \'BODEGA-4\') group by `bdclick3`.`bdproductosbodega4`.`idSistema`
mariadb-version=100135
