TYPE=VIEW
query=select `bdclick6`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`plansepare1`.`cantidad`),\'0\',`plansepare1`.`cantidad`)) AS `Expr1` from (`bdclick6`.`bdproductosbodega3` left join `bdclick6`.`plansepare1` on((`bdclick6`.`bdproductosbodega3`.`idSistema` = `plansepare1`.`producto`))) where (`plansepare1`.`bodega` = \'BODEGA-3\') group by `bdclick6`.`bdproductosbodega3`.`idSistema`
md5=493af596622f0b531db27f3f42285db8
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:42
create-version=2
source=select `bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`plansepare1`.`cantidad`),\'0\',`plansepare1`.`cantidad`)) AS `Expr1` from (`bdproductosbodega3` left join `plansepare1` on((`bdproductosbodega3`.`idSistema` = `plansepare1`.`producto`))) where (`plansepare1`.`bodega` = \'BODEGA-3\') group by `bdproductosbodega3`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`plansepare1`.`cantidad`),\'0\',`plansepare1`.`cantidad`)) AS `Expr1` from (`bdclick6`.`bdproductosbodega3` left join `bdclick6`.`plansepare1` on((`bdclick6`.`bdproductosbodega3`.`idSistema` = `plansepare1`.`producto`))) where (`plansepare1`.`bodega` = \'BODEGA-3\') group by `bdclick6`.`bdproductosbodega3`.`idSistema`
mariadb-version=100135
