TYPE=VIEW
query=select `bdclick1`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`plansepare1`.`cantidad`),\'0\',`plansepare1`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductosbodega3` left join `bdclick1`.`plansepare1` on((`bdclick1`.`bdproductosbodega3`.`idSistema` = `plansepare1`.`producto`))) where (`plansepare1`.`bodega` = \'BODEGA-3\') group by `bdclick1`.`bdproductosbodega3`.`idSistema`
md5=98ba6039288dcc4a895f1a49936e32dd
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:40
create-version=2
source=select `bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`plansepare1`.`cantidad`),\'0\',`plansepare1`.`cantidad`)) AS `Expr1` from (`bdproductosbodega3` left join `plansepare1` on((`bdproductosbodega3`.`idSistema` = `plansepare1`.`producto`))) where (`plansepare1`.`bodega` = \'BODEGA-3\') group by `bdproductosbodega3`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`plansepare1`.`cantidad`),\'0\',`plansepare1`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductosbodega3` left join `bdclick1`.`plansepare1` on((`bdclick1`.`bdproductosbodega3`.`idSistema` = `plansepare1`.`producto`))) where (`plansepare1`.`bodega` = \'BODEGA-3\') group by `bdclick1`.`bdproductosbodega3`.`idSistema`
mariadb-version=100135
