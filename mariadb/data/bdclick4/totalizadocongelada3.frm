TYPE=VIEW
query=select `bdclick4`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick4`.`bdcongelada`.`cantidad`),\'0\',`bdclick4`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick4`.`bdproductosbodega3` left join `bdclick4`.`bdcongelada` on((`bdclick4`.`bdcongelada`.`producto` = `bdclick4`.`bdproductosbodega3`.`idSistema`))) where (`bdclick4`.`bdcongelada`.`bodega` = \'BODEGA-3\') group by `bdclick4`.`bdproductosbodega3`.`idSistema`
md5=5e88ccf558a12afd7ac7837cbd71c744
updatable=0
algorithm=0
definer_user=click
definer_host=localhost
suid=1
with_check_option=0
timestamp=2019-11-22 19:32:32
create-version=2
source=select `bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`bdcongelada`.`cantidad`),\'0\',`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdproductosbodega3` left join `bdcongelada` on((`bdcongelada`.`producto` = `bdproductosbodega3`.`idSistema`))) where (`bdcongelada`.`bodega` = \'BODEGA-3\') group by `bdproductosbodega3`.`idSistema`
client_cs_name=utf8
connection_cl_name=utf8_general_ci
view_body_utf8=select `bdclick4`.`bdproductosbodega3`.`idSistema` AS `codigo`,sum(if(isnull(`bdclick4`.`bdcongelada`.`cantidad`),\'0\',`bdclick4`.`bdcongelada`.`cantidad`)) AS `Expr1` from (`bdclick4`.`bdproductosbodega3` left join `bdclick4`.`bdcongelada` on((`bdclick4`.`bdcongelada`.`producto` = `bdclick4`.`bdproductosbodega3`.`idSistema`))) where (`bdclick4`.`bdcongelada`.`bodega` = \'BODEGA-3\') group by `bdclick4`.`bdproductosbodega3`.`idSistema`
mariadb-version=100135
