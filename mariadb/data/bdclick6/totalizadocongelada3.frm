TYPE=VIEW
query=select `bdclick6`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick6`.`bdcongelada`.`cantidad`),\'0\',`bdclick6`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick6`.`bdproductosbodega3` left join `bdclick6`.`bdcongelada` on((`bdclick6`.`bdcongelada`.`producto` = `bdclick6`.`bdproductosbodega3`.`idSistema`))) where (`bdclick6`.`bdcongelada`.`bodega` = \'BODEGA-3\') group by `bdclick6`.`bdproductosbodega3`.`idSistema`
md5=6bfa9532b41cc23e96735671ed1a57d6
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:57:41
create-version=2
source=select `bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`bdcongelada`.`cantidad`),\'0\',`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdproductosbodega3` left join `bdcongelada` on((`bdcongelada`.`producto` = `bdproductosbodega3`.`idSistema`))) where (`bdcongelada`.`bodega` = \'BODEGA-3\') group by `bdproductosbodega3`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick6`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick6`.`bdcongelada`.`cantidad`),\'0\',`bdclick6`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick6`.`bdproductosbodega3` left join `bdclick6`.`bdcongelada` on((`bdclick6`.`bdcongelada`.`producto` = `bdclick6`.`bdproductosbodega3`.`idSistema`))) where (`bdclick6`.`bdcongelada`.`bodega` = \'BODEGA-3\') group by `bdclick6`.`bdproductosbodega3`.`idSistema`
mariadb-version=100135
