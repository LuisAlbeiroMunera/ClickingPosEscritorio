TYPE=VIEW
query=select `bdclick3`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick3`.`bdcongelada`.`cantidad`),\'0\',`bdclick3`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick3`.`bdproductosbodega1` left join `bdclick3`.`bdcongelada` on((`bdclick3`.`bdcongelada`.`producto` = `bdclick3`.`bdproductosbodega1`.`idSistema`))) where (`bdclick3`.`bdcongelada`.`bodega` = \'BODEGA-1\') group by `bdclick3`.`bdproductosbodega1`.`idSistema`
md5=c41a7fc7bb49cbd5eca37fc934e8c777
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:39:55
create-version=2
source=select `bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`bdcongelada`.`cantidad`),\'0\',`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdproductosbodega1` left join `bdcongelada` on((`bdcongelada`.`producto` = `bdproductosbodega1`.`idSistema`))) where (`bdcongelada`.`bodega` = \'BODEGA-1\') group by `bdproductosbodega1`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick3`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick3`.`bdcongelada`.`cantidad`),\'0\',`bdclick3`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick3`.`bdproductosbodega1` left join `bdclick3`.`bdcongelada` on((`bdclick3`.`bdcongelada`.`producto` = `bdclick3`.`bdproductosbodega1`.`idSistema`))) where (`bdclick3`.`bdcongelada`.`bodega` = \'BODEGA-1\') group by `bdclick3`.`bdproductosbodega1`.`idSistema`
mariadb-version=100135
