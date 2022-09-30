TYPE=VIEW
query=select `bdclick3`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick3`.`bdcongelada`.`cantidad`),\'0\',`bdclick3`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick3`.`bdproductosbodega2` left join `bdclick3`.`bdcongelada` on((`bdclick3`.`bdcongelada`.`producto` = `bdclick3`.`bdproductosbodega2`.`idSistema`))) where (`bdclick3`.`bdcongelada`.`bodega` = \'BODEGA-2\') group by `bdclick3`.`bdproductosbodega2`.`idSistema`
md5=bc3e1bd77d6c2493ec7373d7da796e40
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:55
create-version=2
source=select `bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`bdcongelada`.`cantidad`),\'0\',`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdproductosbodega2` left join `bdcongelada` on((`bdcongelada`.`producto` = `bdproductosbodega2`.`idSistema`))) where (`bdcongelada`.`bodega` = \'BODEGA-2\') group by `bdproductosbodega2`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdproductosbodega2`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick3`.`bdcongelada`.`cantidad`),\'0\',`bdclick3`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick3`.`bdproductosbodega2` left join `bdclick3`.`bdcongelada` on((`bdclick3`.`bdcongelada`.`producto` = `bdclick3`.`bdproductosbodega2`.`idSistema`))) where (`bdclick3`.`bdcongelada`.`bodega` = \'BODEGA-2\') group by `bdclick3`.`bdproductosbodega2`.`idSistema`
mariadb-version=100135
