TYPE=VIEW
query=select `bdclick1`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick1`.`bdcongelada`.`cantidad`),\'0\',`bdclick1`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductosbodega3` left join `bdclick1`.`bdcongelada` on((`bdclick1`.`bdcongelada`.`producto` = `bdclick1`.`bdproductosbodega3`.`idSistema`))) where (`bdclick1`.`bdcongelada`.`bodega` = \'BODEGA-3\') group by `bdclick1`.`bdproductosbodega3`.`idSistema`
md5=461e18d97d4d802b79261e3bce25c966
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:39
create-version=2
source=select `bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`bdcongelada`.`cantidad`),\'0\',`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdproductosbodega3` left join `bdcongelada` on((`bdcongelada`.`producto` = `bdproductosbodega3`.`idSistema`))) where (`bdcongelada`.`bodega` = \'BODEGA-3\') group by `bdproductosbodega3`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick1`.`bdcongelada`.`cantidad`),\'0\',`bdclick1`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductosbodega3` left join `bdclick1`.`bdcongelada` on((`bdclick1`.`bdcongelada`.`producto` = `bdclick1`.`bdproductosbodega3`.`idSistema`))) where (`bdclick1`.`bdcongelada`.`bodega` = \'BODEGA-3\') group by `bdclick1`.`bdproductosbodega3`.`idSistema`
mariadb-version=100135
