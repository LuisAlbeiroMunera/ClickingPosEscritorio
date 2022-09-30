TYPE=VIEW
query=select `bdclick2`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick2`.`bdcongelada`.`cantidad`),\'0\',`bdclick2`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductosbodega4` left join `bdclick2`.`bdcongelada` on((`bdclick2`.`bdcongelada`.`producto` = `bdclick2`.`bdproductosbodega4`.`idSistema`))) where (`bdclick2`.`bdcongelada`.`bodega` = \'BODEGA-4\') group by `bdclick2`.`bdproductosbodega4`.`idSistema`
md5=797b2e84c6757f7e6187c065a818bc56
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:37:49
create-version=2
source=select `bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`bdcongelada`.`cantidad`),\'0\',`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdproductosbodega4` left join `bdcongelada` on((`bdcongelada`.`producto` = `bdproductosbodega4`.`idSistema`))) where (`bdcongelada`.`bodega` = \'BODEGA-4\') group by `bdproductosbodega4`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick2`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick2`.`bdcongelada`.`cantidad`),\'0\',`bdclick2`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick2`.`bdproductosbodega4` left join `bdclick2`.`bdcongelada` on((`bdclick2`.`bdcongelada`.`producto` = `bdclick2`.`bdproductosbodega4`.`idSistema`))) where (`bdclick2`.`bdcongelada`.`bodega` = \'BODEGA-4\') group by `bdclick2`.`bdproductosbodega4`.`idSistema`
mariadb-version=100135
