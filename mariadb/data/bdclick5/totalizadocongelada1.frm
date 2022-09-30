TYPE=VIEW
query=select `bdclick5`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick5`.`bdcongelada`.`cantidad`),\'0\',`bdclick5`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick5`.`bdproductosbodega1` left join `bdclick5`.`bdcongelada` on((`bdclick5`.`bdcongelada`.`producto` = `bdclick5`.`bdproductosbodega1`.`idSistema`))) where (`bdclick5`.`bdcongelada`.`bodega` = \'BODEGA-1\') group by `bdclick5`.`bdproductosbodega1`.`idSistema`
md5=0b3fd5730b44c4c453997aa9c52af0b8
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:46:52
create-version=2
source=select `bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`bdcongelada`.`cantidad`),\'0\',`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdproductosbodega1` left join `bdcongelada` on((`bdcongelada`.`producto` = `bdproductosbodega1`.`idSistema`))) where (`bdcongelada`.`bodega` = \'BODEGA-1\') group by `bdproductosbodega1`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick5`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick5`.`bdcongelada`.`cantidad`),\'0\',`bdclick5`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick5`.`bdproductosbodega1` left join `bdclick5`.`bdcongelada` on((`bdclick5`.`bdcongelada`.`producto` = `bdclick5`.`bdproductosbodega1`.`idSistema`))) where (`bdclick5`.`bdcongelada`.`bodega` = \'BODEGA-1\') group by `bdclick5`.`bdproductosbodega1`.`idSistema`
mariadb-version=100135
