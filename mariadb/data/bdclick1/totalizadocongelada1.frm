TYPE=VIEW
query=select `bdclick1`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick1`.`bdcongelada`.`cantidad`),\'0\',`bdclick1`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductosbodega1` left join `bdclick1`.`bdcongelada` on((`bdclick1`.`bdcongelada`.`producto` = `bdclick1`.`bdproductosbodega1`.`idSistema`))) where (`bdclick1`.`bdcongelada`.`bodega` = \'BODEGA-1\') group by `bdclick1`.`bdproductosbodega1`.`idSistema`
md5=f4d0bf4e859a5ce8dca7de5118f741e6
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:39
create-version=2
source=select `bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`bdcongelada`.`cantidad`),\'0\',`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdproductosbodega1` left join `bdcongelada` on((`bdcongelada`.`producto` = `bdproductosbodega1`.`idSistema`))) where (`bdcongelada`.`bodega` = \'BODEGA-1\') group by `bdproductosbodega1`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick1`.`bdcongelada`.`cantidad`),\'0\',`bdclick1`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductosbodega1` left join `bdclick1`.`bdcongelada` on((`bdclick1`.`bdcongelada`.`producto` = `bdclick1`.`bdproductosbodega1`.`idSistema`))) where (`bdclick1`.`bdcongelada`.`bodega` = \'BODEGA-1\') group by `bdclick1`.`bdproductosbodega1`.`idSistema`
mariadb-version=100135
