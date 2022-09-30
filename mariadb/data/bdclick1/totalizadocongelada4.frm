TYPE=VIEW
query=select `bdclick1`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick1`.`bdcongelada`.`cantidad`),\'0\',`bdclick1`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductosbodega4` left join `bdclick1`.`bdcongelada` on((`bdclick1`.`bdcongelada`.`producto` = `bdclick1`.`bdproductosbodega4`.`idSistema`))) where (`bdclick1`.`bdcongelada`.`bodega` = \'BODEGA-4\') group by `bdclick1`.`bdproductosbodega4`.`idSistema`
md5=39c721556c5cee37da7f24a68e63086a
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-13 21:34:39
create-version=2
source=select `bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`bdcongelada`.`cantidad`),\'0\',`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdproductosbodega4` left join `bdcongelada` on((`bdcongelada`.`producto` = `bdproductosbodega4`.`idSistema`))) where (`bdcongelada`.`bodega` = \'BODEGA-4\') group by `bdproductosbodega4`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick1`.`bdproductosbodega4`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick1`.`bdcongelada`.`cantidad`),\'0\',`bdclick1`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick1`.`bdproductosbodega4` left join `bdclick1`.`bdcongelada` on((`bdclick1`.`bdcongelada`.`producto` = `bdclick1`.`bdproductosbodega4`.`idSistema`))) where (`bdclick1`.`bdcongelada`.`bodega` = \'BODEGA-4\') group by `bdclick1`.`bdproductosbodega4`.`idSistema`
mariadb-version=100135
