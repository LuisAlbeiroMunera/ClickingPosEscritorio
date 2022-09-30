TYPE=VIEW
query=select `bdclick6`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick6`.`bdcongelada`.`cantidad`),\'0\',`bdclick6`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick6`.`bdproductosbodega1` left join `bdclick6`.`bdcongelada` on((`bdclick6`.`bdcongelada`.`producto` = `bdclick6`.`bdproductosbodega1`.`idSistema`))) where (`bdclick6`.`bdcongelada`.`bodega` = \'BODEGA-1\') group by `bdclick6`.`bdproductosbodega1`.`idSistema`
md5=768f17f140509de1c518eed7be423a9a
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:41
create-version=2
source=select `bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`bdcongelada`.`cantidad`),\'0\',`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdproductosbodega1` left join `bdcongelada` on((`bdcongelada`.`producto` = `bdproductosbodega1`.`idSistema`))) where (`bdcongelada`.`bodega` = \'BODEGA-1\') group by `bdproductosbodega1`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdproductosbodega1`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick6`.`bdcongelada`.`cantidad`),\'0\',`bdclick6`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick6`.`bdproductosbodega1` left join `bdclick6`.`bdcongelada` on((`bdclick6`.`bdcongelada`.`producto` = `bdclick6`.`bdproductosbodega1`.`idSistema`))) where (`bdclick6`.`bdcongelada`.`bodega` = \'BODEGA-1\') group by `bdclick6`.`bdproductosbodega1`.`idSistema`
mariadb-version=100135
