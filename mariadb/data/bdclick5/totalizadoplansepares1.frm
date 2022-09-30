TYPE=VIEW
query=select `bdclick5`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`plansepare1`.`cantidad`),\'0\',`plansepare1`.`cantidad`)) AS `Expr1` from (`bdclick5`.`bdproductosbodega1` left join `bdclick5`.`plansepare1` on((`bdclick5`.`bdproductosbodega1`.`idSistema` = `plansepare1`.`producto`))) where (`plansepare1`.`bodega` = \'BODEGA-1\') group by `bdclick5`.`bdproductosbodega1`.`idSistema`
md5=7e0543ee7b5f961d98e3285f493b0462
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:53
create-version=2
source=select `bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`plansepare1`.`cantidad`),\'0\',`plansepare1`.`cantidad`)) AS `Expr1` from (`bdproductosbodega1` left join `plansepare1` on((`bdproductosbodega1`.`idSistema` = `plansepare1`.`producto`))) where (`plansepare1`.`bodega` = \'BODEGA-1\') group by `bdproductosbodega1`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`plansepare1`.`cantidad`),\'0\',`plansepare1`.`cantidad`)) AS `Expr1` from (`bdclick5`.`bdproductosbodega1` left join `bdclick5`.`plansepare1` on((`bdclick5`.`bdproductosbodega1`.`idSistema` = `plansepare1`.`producto`))) where (`plansepare1`.`bodega` = \'BODEGA-1\') group by `bdclick5`.`bdproductosbodega1`.`idSistema`
mariadb-version=100135
